package System;

public class Heart {

	int HeartRate;
	String Color;
	String Size;
	
	 Heart(int HeartRate) {
		Color = "Red";
		Size = "Normal";
		this.HeartRate = HeartRate;
	 }
	 public void CheckHealth() {
	 if (HeartRate < 100 | HeartRate > 60) {
		 System.out.print("Heart is in good condition");
	 }
	 else { System.out.print("You might have a problem .. suggested to visit a doctor");}
	 }
}
