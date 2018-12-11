/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Classed used for Factory Design Pattern
 * Inputs:	MotelRoomFactory object
 * Outputs: None
 */
public class MotelRoomService {
	MotelRoomFactory factory;
	
	/**
	 * Sets MotelRoomFactory object parameter to in class MotelRoomFactory
	 * @param factory MotelRoomFactory object used to set in class MotelRoomFactory
	 */
	public MotelRoomService(MotelRoomFactory factory) {
		this.factory = factory;
	}
	
	/**
	 * Create the correct MotelRoom type 
	 * @param type String of the MotelRoom name
	 * @return newly created MotelRoom object
	 */
	public MotelRoom setRoom(String type) {
		MotelRoom motelRoom;
		
		motelRoom = factory.createMotelRoom(type);
		
		return motelRoom;
	}
}
