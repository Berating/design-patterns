package Observer;

public class TitleCreate implements Observer {

	private String name;
	private Observable title;
	
	
	public TitleCreate(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.title == null) {
			
			System.out.println(this.getName()+ " Has no title");
			return; 
		}
		String latestTitle = this.title.getUpdate();
		System.out.println(this.getName()+ " New update: " + latestTitle);
	}

	@Override
	public void setTitle(Observable title) {
		this.title = title;

	}

	public String getName() {
		return name;
	}
	
}
