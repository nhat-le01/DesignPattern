/**
 * @author Mateo Perez
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Decorator for Refill.  Maintains Refill.
 * Inputs:	MotelRoom object
 * Outputs: Adds Refill to the output string and returns cost of Refill decorator
 */

public class Refill extends RoomDecorator{
	MotelRoom room;
	
	/**
     * Sets the MotelRoom object parameter to the MotelRoom object of this class
     * @param room MotelRoom object that will be saved
     */
    public Refill(MotelRoom room){
        this.room = room;
    }

    /**
     * Gets description of room and adds , AutoRefill of the FoodBar to the output string
     * @return Modified string
     */
    public String getDescription() {
        return room.getDescription() + ", AutoRefill of the FoodBar";
    }

    /**
     * Adds the cost of Refill to the total cost
     * @return cost of the Refill + all other charges
     */
    public double cost() {
        return 5 + room.cost();
    }
}
