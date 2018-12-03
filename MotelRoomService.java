
public class MotelRoomService {
	MotelRoomFactory factory;
	
	public MotelRoomService(MotelRoomFactory factory) {
		this.factory = factory;
	}
	
	public MotelRoom setRoom(String type) {
		MotelRoom motelRoom;
		
		motelRoom = factory.createMotelRoom(type);
		
		return motelRoom;
	}
}
