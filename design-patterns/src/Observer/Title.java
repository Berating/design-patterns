package Observer;

import java.util.ArrayList;
import java.util.List;

public class Title implements Observable {
	
	private List<Observer> observers;
	private String title;
	
	public Title() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void CreateObserver(Observer observer) {
		this.observers.add(observer);
		observer.setTitle(this);

	}

	@Override
	public void DeleteObserver(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void UpdateObservers() {
		for(Observer observer: this.observers) {
			observer.update();

		}
	}

	@Override
	public String getUpdate() {
		return this.title;
	}
	
	public void setTitle(String Title) {
		this.title = Title;
		this.UpdateObservers();
		}
		
}
