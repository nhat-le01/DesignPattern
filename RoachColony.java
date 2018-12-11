/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Create RoachColony object
 * Inputs:	Initial values to set RoachColony variables
 * Outputs: Returns the cost of the Regular Room
 */
public class RoachColony implements Observer{
	public String name;
	public int initialPopulation;
	public double growthRate;
	boolean spray = false;
	private MotelRoom r;
	
	/**
	 * Definition for update in Observer pattern Observer.java
	 * @return String to notify RoachColony of available rooms
	 */
	public void update(RoachMotel rm) {
		System.out.println(name + " has been notified that Roach Motel " + rm.getName() + " has an available room!");
	}
	
	/**
	 * Default Constructor
	 */
	public RoachColony() {
		name = "Default";
		initialPopulation = 1;
		growthRate = 1.1;
	}
	
	/**
	 * Constructor
	 * @param name Name of RoachColony
	 * @param initialPopulation The starting population of the RoachColony
	 * @param growthRate the percentage and which the RoachColony grows
	 */
	public RoachColony(String name, int initialPopulation, double growthRate) {
		this.name = name;
		this.initialPopulation = initialPopulation;
		this.growthRate = growthRate;
	}
	
	/**
	 * Throwing a party modifies the population of the RoachColony depending on the
	 * status of spray 
	 * @return String of results of the party
	 */
	public String party() {
		initialPopulation += (int) (initialPopulation * growthRate);

		if (spray){
			initialPopulation -= initialPopulation * .25;
			
			return name + " is throwing a party!\n"
					+ name + " didn't cheap out and got a spray resistant shower, the losses were few!\n";
		}
        else {
			initialPopulation -= initialPopulation * .50;
			
        	return name + " is throwing a party!\n"
        			+ name + "  cheaped out and did not get a spray resistant shower, poor roaches!\n";
		}
	}
	
	/**
	 * spray setter
	 */
	public void setSpray() {
		spray = true;
	}
	
	/**
	 * toString of RoachColony
	 */
	public String toString() {
		return "Name: " + name
				+ "\nPopulation: " + initialPopulation
				+ "\nGrowth Rate: " + growthRate
				+ "\nSpray Status: " + spray + "\n";
	}
}
