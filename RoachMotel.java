import java.util.ArrayList;
import java.util.Map;


public class RoachMotel implements Subject{

    private static RoachMotel roachMotel;
    Map<MotelRoom, Boolean> roachMotelTracker;
    boolean vacant;
    ArrayList<RoachColony> waitList;


    public RoachMotel() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int j = observers.indexOf(o);
		if (j >= 0) {
			observers.remove(j);
		}
	}
	
	public void notifyObservers() {
		for (int j = 0; j < observers.size(); j++) {
			Observer observer = (Observer) observers.get(j);
			observer.update();
		}
	}
	
	public int getNumberOfOccupants() {
		return numberOfOccupant;
	}
	
	public int getNumberofDaysPassed() {
		return numberOfDay;
	}
	
	public boolean isAvailable(){
		return available;
	}
	
	
	public void measurementsChanged() {
		notifyObservers();
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



	}
	
	public double checkOut(MotelRoom room, int days) {
		roachMotelTracker.put(room,false);
	for (RoachColony r: wailist) {
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


}

