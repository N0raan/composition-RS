package System;

public abstract class body {

	String name;
	int age;
	String generalHealth;
	Heart heart;
	
body(String name,int age, int HearRate){
	this.name=name;
	this.age=age;
	new Heart(HearRate);
	}




}
