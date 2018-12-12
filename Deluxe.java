/**
 * @author Mateo Perez
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Factory class for the Deluxe Room which extends MotelRoom class
 * Inputs:	None
 * Outputs: Returns the cost of the Deluxe Room
 */

public class Deluxe extends MotelRoom{
	/**
	 * Constructor that sets name and rate from MotelRoom class
	 */
	public Deluxe(){
		name = "Deluxe Room";
		rate = 75;
	}
	
	/**
	 * This method returns the cost of the deluxe room.
	 * @return rate
	 */
	
   public double cost() {
	   return rate;
   }
}
