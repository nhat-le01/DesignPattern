/**
 * @author Mateo Perez
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Observer pattern for maintaining waitlist
 * Inputs:	None
 * Outputs: None
 */

public interface Subject {
	public void registerObserver(RoachColony o);
	public void removeObserver(RoachColony o);
	public void notifyObservers();
}
