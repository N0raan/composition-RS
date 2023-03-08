package Tutorial;

public class PrivateChat implements Builder {
	
	private Chat chat;
	
	public PrivateChat() {
		this.chat= new Chat();
	}

	@Override
	public void MakeNotification() {
		chat.SetNotificationSound("trn trrn");
		
	}

	@Override
	public void MakeName() {
		chat.SetName("me");
		
	}

	@Override
	public void MakeParticipants() {
		chat.SetParticipantsNumber(2);
		
	}
	
	public Chat getChat() {
		return this.chat;
	}
	

}
