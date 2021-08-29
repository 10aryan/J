package oops;

class cat {
	boolean hasfire;
	String colour, breed;
	int legs, eyes;
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat(){
		System.out.println("Cat is eating");
	}
	public void description() {
		System.out.println("my cat has " + legs + "legs and "+ eyes +"eyes");
	}
	
}
class dog{
	String breed, name;
	int legs, eyes;
	public void jump() {
		System.out.println("My dog "+ name +" Jump");
	}
	public void discription() {
		System.out.println("My dog name is "+ name + " and It's breed is "+ breed );
	}
	
}

public class Oops {

	public static void main(String[] args) {
		cat cat1 = new cat();
		cat cat2 = new cat();
		
		cat1.legs = 4;
		cat1.eyes = 2;
		
		cat2.legs = 2;
		cat2.eyes = 2;
	
		cat1.description();
		cat2.description();
		
		dog dog1 = new dog();
		dog dog2 = new dog();
		
		dog1.breed = "Libra";
		dog1.name = "Brownee";
		
		
		dog1.jump();
		dog1.discription();
	}
}
