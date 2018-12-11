/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: RoachMotel Singleton Design Pattern. Maintains rooms and room availability
 * Inputs:	Values needed for Observer pattern and check in and check out
 * Outputs: Status of rooms, cost of room
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RoachMotel implements Subject{

    private static RoachMotel roachMotel;
    private Map<String, Boolean> roachMotelTracker;
    boolean vacant;
    private ArrayList<RoachColony> waitList;
    String motelName = "HassNhaPeteMat Motel";
    int availableRooms;
    

    /**
     * Default Constructor
     */
    public RoachMotel() {
		waitList = new ArrayList<RoachColony>();
		roachMotelTracker = new HashMap<String, Boolean>();
	}
	
    /**
     * Wait list for RoachMotel rooms. Updates waitList ArrayList
     */
	public void registerObserver(RoachColony o) {
		waitList.add(o);
	}
	
	/**
	 * Remove RoachColony for waitList ArrayList
	 */
	public void removeObserver(RoachColony o) {
		int j = waitList.indexOf(o);
		if (j >= 0) {
			waitList.remove(j);
		}
	}

	/**
	 * Notify RoachColony of room availability
	 */
    public void notifyObservers() {
        for (RoachColony aWaitList : waitList) {
            ((Observer) aWaitList).update(this);
        }
	}

    /**
     * RoachMotel instance Singleton
     * @return RoachMotel instance
     */
    public static RoachMotel getInstance(){
        if(roachMotel == null) {
            roachMotel = new RoachMotel();
        }
        return roachMotel;
    }
    
    /**
     * Check into a RoachMotel room  
     * @param rc1 RoachColony that will occupy the room
     * @param type String of the name of the type of room to create
     * @param amenities ArrayList of all the amenities that will be added to the room
     * @return returns completed room after going factory and decorator design pattern
     */
	public MotelRoom checkIn(RoachColony rc1, String type, ArrayList<String> amenities) {
        for (Map.Entry<String, Boolean> entry : roachMotelTracker.entrySet()) {
            String key = entry.getKey();
            Boolean value = entry.getValue();
            if (!value){
                MotelRoomFactory factory = new MotelRoomFactory();
                MotelRoom room = factory.createMotelRoom(type);
                for (String amenity : amenities) {
                    if (amenity.equals("foodbar")) {
                        room = new FoodBar(room);
                    }
                    if (amenity.equals("spa")) {
                        room = new Spa(room);
                    }
                    if (amenity.equals("refillbar")) {
                        room = new Refill(room);
                    }
                    if (amenity.equals("shower")) {
                        room = new Shower(room);
                        rc1.setSpray();
                    }
                }

                roachMotelTracker.put(key,true);
                room.setName(key);
                availableRooms -= 1;
                System.out.println(rc1.name + " is checking into room " + key + " " + room.getDescription() + "\n");
                return room;
            }
        }
        waitList.add(rc1);
        System.out.println("=============" + rc1.name + " is waitlisted" + "=================");

        return null;
	}
	
	/**
	 * calculate the cost and make used room available
	 * @param room MotelRoom that will be available and have cost calculated
	 * @param days Number of days the room was occupied.  Used in cost calculation
	 * @return Total cost of the room
	 */
	public double checkOut(MotelRoom room, int days) {
        roachMotelTracker.put(room.getName(),false);
        availableRooms += 1;
	for (RoachColony r: waitList) {
		r.update(this);
	}
	waitList.clear();
	return room.cost()*days;
	}
	
	/**
	 * Method creates a preset amount of rooms for the RoachMotel
	 */
    public void createRooms() {
        //Generate 5 rooms
        MotelRoomFactory factory = new MotelRoomFactory();
        MotelRoomService service = new MotelRoomService(factory);

        MotelRoom reg1 = service.setRoom("Regular");
        reg1.setName("101");
        MotelRoom reg2 = service.setRoom("Regular");
        reg2.setName("102");
        MotelRoom del1 = service.setRoom("Deluxe");
        del1.setName("103");
        MotelRoom del2 = service.setRoom("Deluxe");
        del2.setName("104");
        MotelRoom sui1 = service.setRoom("Suite");
        sui1.setName("105");

        roachMotelTracker.put(reg1.getName(), false);
        roachMotelTracker.put(reg2.getName(), false);
        roachMotelTracker.put(del1.getName(), false);
        roachMotelTracker.put(del2.getName(), false);
        roachMotelTracker.put(sui1.getName(), false);
        availableRooms = roachMotelTracker.size();
    }

    /**
     * toString of RoachMotel
     * @return String of available rooms in the RoachMotel
     */
    public String toString() {
        ArrayList<String> names = new ArrayList<String>();
		for (String r : roachMotelTracker.keySet()) {
		    if (!roachMotelTracker.get(r)) {
                names.add(r);
            }
        }
		if (availableRooms == 0) {
			vacant = false;
			return "Roach Motel Available Rooms: " + names + "\n" + "NoVacancy is on \n";
		}
        return "Roach Motel Available Rooms: " + names + "\n" + "Vacancy is on\n";
	}

    /**
     * name getter
     * @return 
     */
    public String getName() {
        return motelName;
    }
}

