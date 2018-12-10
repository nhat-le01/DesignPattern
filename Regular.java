
public class Regular extends MotelRoom {
	public Regular(){
		name = "Regular Room";
		rate = 50;
	}
	
	public double cost() {
		return rate;
	}
}