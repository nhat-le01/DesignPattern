import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RoachMotel implements Subject{

    private static RoachMotel roachMotel;
    private Map<String, Boolean> roachMotelTracker;
    boolean vacant;
    private ArrayList<RoachColony> waitList;


    public RoachMotel() {
		waitList = new ArrayList<RoachColony>();
		roachMotelTracker = new HashMap<String, Boolean>();

	}
	
	public void registerObserver(RoachColony o) {
		waitList.add(o);
	}
	
	public void removeObserver(RoachColony o) {
		int j = waitList.indexOf(o);
		if (j >= 0) {
			waitList.remove(j);
		}
	}

    public void notifyObservers() {
        for (RoachColony aWaitList : waitList) {
            ((Observer) aWaitList).update(this);
        }
	}

    public static RoachMotel getInstance(){
        if(roachMotel == null) {
            roachMotel = new RoachMotel();
        }
        return roachMotel;
    }
    
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
                System.out.println(roachMotelTracker);
                return room;
            }
        }
        waitList.add(rc1);
        System.out.println("=============" + rc1.name + " is waitlisted" + "=================");
        System.out.println(roachMotelTracker);
        return null;
	}
	
	public double checkOut(MotelRoom room, int days) {
        roachMotelTracker.put(room.getName(),false);
	for (RoachColony r: waitList) {
		r.update(this);
	}
	waitList.clear();
	return room.cost()*days;
	}
	
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


    }

    public String toString() {
        ArrayList<String> names = new ArrayList<String>();
		for (String r : roachMotelTracker.keySet()) {
		    if (!roachMotelTracker.get(r)) {
                names.add(r);
            }
        }
        return "Roach Motel: " + names;
	}

    public String getName() {
        return "HNPM Motel";
    }
}

