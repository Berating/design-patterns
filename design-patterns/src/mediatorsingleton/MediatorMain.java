package mediatorsingleton;

public class MediatorMain {

	public static void main(String[] args) {


		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Dani");
		User user2 = new ChatUser(chat, "Ivan");
		User user3 = new ChatUser(chat, "Gosho");
		
		
		user2.send("Hi, lads!");
		user3.send("addBot");
		user1.send("Cat");
		user3.send("Get to the Choppah!");
	}

}
