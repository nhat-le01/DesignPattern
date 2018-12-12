/**
 * @author Mateo Perez
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Creates the right type of Motel Room depending string parameter
 * Inputs:	String of room name
 * Outputs: MotelRoom object 
 */

public class MotelRoomFactory {
	/**
	 * Creates and returns a MotelRoom object depending on string parameter
	 * @param type String of MotelRoom name to create
	 * @return MotelRoom object
	 */
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
