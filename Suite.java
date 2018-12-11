/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Factory class for the Suite Room which extends MotelRoom class
 * Inputs:	None
 * Outputs: Returns the cost of the Suite Room
 */

public class Suite extends MotelRoom{
	/**
	 * Constructor that sets name and rate from MotelRoom class
	 */
	public Suite(){
		name = "Suite Room";
		rate = 100;
	}
	
	/**
	 * This method returns the cost of the Suite room.
	 * @return rate
	 */
	public double cost() {
		return rate;
	}
}
