import java.util.ArrayList;


public abstract class MotelRoom {
	String name;
	double rate;
	
	public String getDescription(){
		return name;
	}

	public abstract double cost();

	public void setName(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}
}
