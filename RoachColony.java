
public class RoachColony implements Observer{
	public String name;
	public int initialPopulation;
	public double growthRate;
	boolean spray = false;
	private MotelRoom r;
	public void update(RoachMotel rm) {
		System.out.println("Roach motel " + rm.getName() + " has an available room");
		//display();
	}
	//public void display() {
		//System.out.println("The room ");
	//}
	
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
		initialPopulation = (int) (initialPopulation * growthRate);
	}
	
	public void setSpray() {
		spray = true;
	}
	
	
	public String toString() {
		return "Name: " + name
				+ "\nPopulation: " + initialPopulation
				+ "\nGrowth Rate: " + growthRate
				+ "\nSpray Status: " + spray;
	}
}
