/**
 * @author Mateo Perez
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Decorator for Food Bar.  Maintains Food bar.
 * Inputs:	MotelRoom object
 * Outputs: Adds FoodBar to the output string and returns cost of food bar decorator
 */

public class FoodBar extends RoomDecorator{
    MotelRoom room;

    /**
     * Sets the MotelRoom object parameter to the MotelRoom object of this class
     * @param room MotelRoom object that will be saved
     */
    public FoodBar(MotelRoom room){
        this.room = room;
    }

    /**
     * Gets description of room and adds , Foodbar to the output string
     * @return Modified string
     */
    public String getDescription() {
        return room.getDescription() + ", FoodBar";
    }

    /**
     * Adds the cost of Foodbar to the total cost
     * @return cost of the food bar + all other charges
     */
    public double cost() {
    	//issue: cost()
        return 10 + room.cost();
    }
}
