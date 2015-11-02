package Observer.ObserverDesignPatternHFS;

//When the state(values of properties) of weather changes observer will be notified,registerd and removed
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
