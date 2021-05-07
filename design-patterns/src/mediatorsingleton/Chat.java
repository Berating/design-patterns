package mediatorsingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private BotTerminator botTerminator;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {		
		this.users.add(user);		
	}

	@Override
	public void sendMessage(String message, User user) {
		
		if(message.contains("addBot")) {			
			this.botTerminator = BotTerminator.getInstance();
			System.out.println("BotTerminator has been activated, prepare to be exterminated!");			
		}
		
		if(botTerminator != null) {
			this.users.remove(user);	
			
			if(botTerminator.messageCheck(message)){
				
				for(User chatUser : this.users) {		
					if(user != chatUser) {
						chatUser.receive(message);
						
					}
				}	
			}
		}			
	}



	@Override
	public void removeUser(User user) {	
		this.users.remove(user);	
	}

}
