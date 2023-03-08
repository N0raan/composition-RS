package Tutorial;

public class Chat implements ChatBasics {
	
	private int Participants;
	private String name;
	private String notification;
	

	@Override
	public void SetNotificationSound(String notification) {
		this.notification = notification;
		
	}

	@Override
	public void SetParticipantsNumber(int Participants) {
		
		this.Participants = Participants;
		
		
	}

	@Override
	public void SetName(String name) {
		
		this.name = name;
		
	}

	
	

}
