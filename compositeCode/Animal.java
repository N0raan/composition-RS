package System;

public class Animal extends body {

	Animal(String name, int age, int HearRate) {
		super(name, age, HearRate);
	}
	
	public void animalHeart(int HeartRate) {
		Heart AnimalHeart =  new Heart(HeartRate);
		AnimalHeart.CheckHealth();
		 
	}

}
