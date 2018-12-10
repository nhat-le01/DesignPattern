import java.util.ArrayList;

public class RoachMotel {

    private static RoachMotel roachMotel;

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
    }

    public String toString() {
		return "Roach Motel";
	}

}

