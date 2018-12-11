
public class RoachColony implements Observer{
	public String name;
	public int initialPopulation;
	public double growthRate;
	boolean spray = false;
	private MotelRoom r;
	public void update(RoachMotel rm) {
		System.out.println(name + " has been notified that Roach Motel " + rm.getName() + " has an available room!\n");
			}
	
	public RoachColony() {
		name = "Default";
		initialPopulation = 1;
		growthRate = 1.1;
	}
	public RoachColony(String name, int initialPopulation, double growthRate) {
		this.name = name;
		this.initialPopulation = initialPopulation;
		this.growthRate = growthRate;
	}
	
	public void party() {
		System.out.println(name + " is throwing a party!");
		initialPopulation += (int) (initialPopulation * growthRate);

		if (spray){
			System.out.println(name + " didn't cheap out and got a spray resistant shower, the losses were few!");
		    initialPopulation -= initialPopulation * .25;
		}
        else {
			System.out.println(name + "  cheaped out and did not get a spray resistant shower, poor roaches!");
			initialPopulation -= initialPopulation * .50;
		}

		System.out.println();


	}
	
	public void setSpray() {
		spray = true;
	}
	
	
	public String toString() {
		return "Name: " + name
				+ "\nPopulation: " + initialPopulation
				+ "\nGrowth Rate: " + growthRate
				+ "\nSpray Status: " + spray + "\n";
	}
}
