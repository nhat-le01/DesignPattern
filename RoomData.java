import java.util.ArrayList;

public class RoomData implements Subject{
	private ArrayList<Observer> observers;
	private int numberOfOccupant;
	private boolean available;
	private int numberOfDay;
	public RoomData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int j = observers.indexOf(o);
		if (j >= 0) {
			observers.remove(j);
		}
	}
	
	public void notifyObservers() {
		for (int j = 0; j < observers.size(); j++) {
			Observer observer = (Observer) observers.get(j);
			observer.update();
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
}
