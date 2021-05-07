package Observer;

public interface Observable {

	void CreateObserver(Observer observer);
	void DeleteObserver(Observer observer);
	
	void UpdateObservers();
    String getUpdate();
}