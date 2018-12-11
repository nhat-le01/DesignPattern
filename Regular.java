/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Factory class for the Regular Room which extends MotelRoom class
 * Inputs:	None
 * Outputs: Returns the cost of the Regular Room
 */

public class Regular extends MotelRoom {
	/**
	 * Constructor that sets name and rate from MotelRoom class
	 */
	public Regular(){
		name = "Regular Room";
		rate = 50;
	}
	
	/**
	 * This method returns the cost of the Regular room.
	 * @return rate
	 */
	public double cost() {
		return rate;
	}
}