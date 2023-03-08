package Tutorial;

public class Main {

	public static void main(String[] args) {
		
		 Builder group1 = new GroupChat();
	     Director developer = new Director(group1);
	  
	     developer.constructChat();
	  
	     Chat chat = developer.getChat();
	  
	     System.out.println("Builder constructed: "+ chat);

	}

}
