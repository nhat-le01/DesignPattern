/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Decorator for Spa.  Maintains Spa.
 * Inputs:	MotelRoom object
 * Outputs: Adds Spa to the output string and returns cost of Spa decorator
 */
public class Spa extends RoomDecorator {
	MotelRoom room;

	/**
     * Sets the MotelRoom object parameter to the MotelRoom object of this class
     * @param room MotelRoom object that will be saved
     */
    public Spa(MotelRoom room){
        this.room = room;
    }

    /**
     * Gets description of room and adds , Spa to the output string
     * @return Modified string
     */
    public String getDescription() {
        return room.getDescription() + ", Spa";
    }

    /**
     * Adds the cost of Spa to the total cost
     * @return cost of the Spa + all other charges
     */
    public double cost() {
        return 20 + room.cost();
    }
}
