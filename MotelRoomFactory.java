
public class MotelRoomFactory {
	public MotelRoom createMotelRoom(String type) {
		MotelRoom room = null;
		
		if(type.equals("Regular")){
			room = new Regular();
		}
		if(type.equals("Deluxe")) {
			room = new Deluxe();
		}
		if(type.equals("Suite")) {
			room = new Suite();
		}
		
		return room;
	}
}
