
public class RoachColony {
	public String name;
	public int initialPopulation;
	public double growthRate;
	Boolean spray = false;
	
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
