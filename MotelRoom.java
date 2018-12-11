/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Abstract class of MotelRoom for factory pattern. To be extended.
 * Inputs:	Name of MotelRoom. Rate defined by extended classes
 * Outputs: Cost of room and name of room
 */

import java.util.ArrayList;


public abstract class MotelRoom {
	String name;
	double rate;
	
	/**
	 * Prints the name of the room
	 * @return name String of what MotelRoom this is
	 */
	public String getDescription(){
		return name;
	}

	/**
	 * Calculate cost which is done through factory/decorator pattern
	 * @return calculated cost
	 */
	public abstract double cost();

	/**
	 * Name setter
	 * @param name Name of MotelRoom
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Name getter
	 * @return name Name of MotelRoom
	 */
	public String getName(){
		return name;
	}
}
