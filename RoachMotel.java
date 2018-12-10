import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RoachMotel implements Subject{

    private static RoachMotel roachMotel;
    private Map<MotelRoom, Boolean> roachMotelTracker;
    boolean vacant;
    private ArrayList<RoachColony> waitList;


    public RoachMotel() {
		waitList = new ArrayList<RoachColony>();
		roachMotelTracker = new HashMap<MotelRoom,Boolean>();

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
		for (int j = 0; j < waitList.size(); j++) {
			Observer observer = (Observer) waitList.get(j);
			observer.update(this);
		}
	}


    public static RoachMotel getInstance(){
        if(roachMotel == null) {
            roachMotel = new RoachMotel();
        }
        return roachMotel;
    }
    
	public MotelRoom checkIn(RoachColony rc1, String type, ArrayList<String> amenities) {

        for (Map.Entry<MotelRoom, Boolean> entry : roachMotelTracker.entrySet()) {
            MotelRoom key = entry.getKey();
            Boolean value = entry.getValue();
            if (!value){
                MotelRoomFactory factory = new MotelRoomFactory();


                key = factory.createMotelRoom(type);

                for (String amenity : amenities) {
                    if (amenity.equals("foodbar")) {
                        key = new FoodBar(key);
                    }
                    if (amenity.equals("spa")) {
                        key = new Spa(key);
                    }
                    if (amenity.equals("refillbar")) {
                        key = new Refill(key);
                    }
                    if (amenity.equals("shower")) {
                        key = new Shower(key);
                        rc1.setSpray();
                    }
                }

                roachMotelTracker.put(key,true);
                return key;
            }
        }
        waitList.add(rc1);
        return null;



	}
	
	public double checkOut(MotelRoom room, int days) {
		roachMotelTracker.put(room,false);
	for (RoachColony r: waitList) {
		r.update(this);
	}
	waitList.clear();
		
		
       // roachMotelTracker.put(room,false);
		
		return room.cost()*days;
	}
	
    public void createRooms() {
        //Generate 5 rooms
        MotelRoomFactory factory = new MotelRoomFactory();
        MotelRoomService service = new MotelRoomService(factory);

        MotelRoom reg1 = service.setRoom("Regular");
        MotelRoom reg2 = service.setRoom("Regular");
        MotelRoom del1 = service.setRoom("Deluxe");
        MotelRoom del2 = service.setRoom("Deluxe");
        MotelRoom sui1 = service.setRoom("Suite");

        roachMotelTracker.put(reg1, false);
        roachMotelTracker.put(reg2, false);
        roachMotelTracker.put(del1, false);
        roachMotelTracker.put(del2, false);
        roachMotelTracker.put(sui1, false);
    }

    public String toString() {
		return "Roach Motel";
	}


    public String getName() {
        return "HNPM Motel";
    }
}

