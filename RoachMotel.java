import java.util.ArrayList;
import java.util.Map;


public class RoachMotel{

    private static RoachMotel roachMotel;
    Map<MotelRoom, Boolean> roachMotelTracker;
    boolean vacant;
    ArrayList<String> waitList;


    private RoachMotel(){}

    public static RoachMotel getInstance(){
        if(roachMotel == null) {
            roachMotel = new RoachMotel();
        }
        return roachMotel;
    }
    
	public MotelRoom checkIn(RoachColony rc1, String type, ArrayList<String> amenities) {
		MotelRoomFactory factory = new MotelRoomFactory();
		MotelRoom room;
		
		room = factory.createMotelRoom(type);
		
		for(int i = 0; i < amenities.size(); i++) {
			if(amenities.get(i) == "foodbar") {
				room = new FoodBar(room);
			}
			if(amenities.get(i) == "spa") {
				room = new Spa(room);
			}
			if(amenities.get(i) == "refillbar") {
				room = new Refill(room);
			}
			if(amenities.get(i) == "shower") {
				room = new Shower(room);
				rc1.setSpray();
			}
		}

		System.out.println("");

		return room;
	}
	
	public double checkOut(MotelRoom room, int days) {

		
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

