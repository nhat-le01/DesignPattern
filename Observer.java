/**
 * @author Mateo Olmeda
 * @author Peter Park
 * @author Hassan Ishmam
 * @author Nhat Le
 * December 12, 2018
 * Purpose: Observer Design Pattern Interface
 * Inputs:	None
 * Outputs: None
 */
public interface Observer {
	/**
	 * Updates status of RoachMotel Vacancy
	 * @param rm The RoachMotel that is currently being used
	 */
  public void update(RoachMotel rm);
}
