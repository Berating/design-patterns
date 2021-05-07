package Observer;

public class TitleMain {

	public static void main(String[] args) {
		
		
		Title title = new Title();
		Observer obs1 = new TitleCreate("Titler 01");
		Observer obs2 = new TitleCreate("Titler 02");
		Observer obs3 = new TitleCreate("Titler 03"); 
		
		title.CreateObserver(obs1);
		title.CreateObserver(obs2);
		title.CreateObserver(obs3);
		
		title.setTitle("Хитове до скъсване!");

	}

}
