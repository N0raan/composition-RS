package Tutorial;

public class Director {


    private Builder builder;
  
    public Director(Builder builder)
    {
        this.builder = builder;
    }
  
    public Chat getChat()
    {
        return this.builder.getChat();
    }
  
    public void constructChat()
    {
        this.builder.MakeName();
        this.builder.MakeNotification();
        this.builder.MakeParticipants();
    }
	
}
