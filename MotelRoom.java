import java.util.ArrayList;

public abstract class MotelRoom {
	String name;
	double rate;
	ArrayList<String> amenities = new ArrayList<String>();

	public String getDescription(){
		return name;
	}

	public abstract double cost();
}
