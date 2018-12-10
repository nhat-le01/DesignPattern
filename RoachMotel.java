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
    
    public void createRooms() {
        //Generate 5 rooms
        MotelRoomFactory factory = new MotelRoomFactory();
        MotelRoomService service = new MotelRoomService(factory);

        MotelRoom reg1 = service.setRoom("regular");
        MotelRoom reg2 = service.setRoom("regular");
        MotelRoom del1 = service.setRoom("deluxe");
        MotelRoom del2 = service.setRoom("deluxe");
        MotelRoom sui1 = service.setRoom("suite");
    }

    public MotelRoom checkIn(RoachColony rc2, String deluxe, ArrayList amenities2) {
        return null;
    }


    public Double checkOut(MotelRoom r2, int i) {
        return null;
    }
}

