package Tutorial;

public class GroupChat implements Builder {
	
	private Chat chat;
	

	public GroupChat() {
		
		this.chat = new Chat();
	}

	@Override
	public void MakeNotification() {
		
		chat.SetNotificationSound("zeo zeo");
	}

	@Override
	public void MakeName() {
		
		chat.SetName("S3");
		
	}

	@Override
	public void MakeParticipants() {
		chat.SetParticipantsNumber(30);
		
	}
	
	public Chat getChat() {
		return this.chat;
	}
	
	
	

}
