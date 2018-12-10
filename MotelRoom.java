import java.util.ArrayList;


public abstract class MotelRoom {
	String name;
	double rate;
	
	public String getDescription(){
		return name;
	}

	public abstract double cost();
}
