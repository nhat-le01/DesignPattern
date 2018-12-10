
public class RoachColony {
	public String name;
	public int initialPopulation;
	public double growthRate;
	
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
}
