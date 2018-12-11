/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Decorator for Shower.  Maintains Shower.
 * Inputs:	MotelRoom object
 * Outputs: Adds Shower to the output string and returns cost of Shower decorator
 */

public class Shower extends RoomDecorator{
	MotelRoom room;

	/**
     * Sets the MotelRoom object parameter to the MotelRoom object of this class
     * @param room MotelRoom object that will be saved
     */
    public Shower(MotelRoom room){
        this.room = room;
    }

    /**
     * Gets description of room and adds , Spray Resistant Shower to the output string
     * @return Modified string
     */
    public String getDescription() {
        return room.getDescription() + ", Spray Resistant Shower";
    }

    /**
     * Adds the cost of Shower to the total cost
     * @return cost of the Shower + all other charges
     */
    public double cost() {
        return 25 + room.cost();
    }
}
