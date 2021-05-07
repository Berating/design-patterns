package mediatorsingleton;

public class BotTerminator {
	
private static BotTerminator instance;
	
	public BotTerminator() {
		
	}
	
	
	public static BotTerminator getInstance() {
		
		if(instance == null) {
			instance = new BotTerminator();
		}		
		
		return instance;
		
	}
	
	public boolean messageCheck(String message) {
		
		if(message.contains("Cat")) {
			
			System.out.println("This word: '" + message + "', is not permitted, prepare to be exterminated.");
			System.out.println("Extermination completed. Hasta la vista, baby.");
			return false;
			
		}
		
		return true;
	}
	
}
