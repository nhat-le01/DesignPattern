
public interface Subject {
	public void registerObserver(RoachColony o);
	public void removeObserver(RoachColony o);
	public void notifyObservers();
}
