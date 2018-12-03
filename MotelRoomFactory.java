
public class MotelRoomFactory {
	public MotelRoom createMotelRoom(String type) {
		MotelRoom room = null;
		
		if(type.equals("regular")){
			room = new Regular();
		}
		if(type.equals("deluxe")) {
			room = new Deluxe();
		}
		if(type.equals("suite")) {
			room = new Suite();
		}
		
		return room;
	}
}
