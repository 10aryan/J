package oops;

class Vehicle{
	int wheels;
	int headlights;
	String colour;
	Vehicle(int wheels){   // if the variable name is same then we use this.variable name;
	this.wheels = wheels;  	// if the variable name is different then no use of wheels
		
		headlights = 2;  
	}
	Vehicle(int wheels, String colour){  // If defaulter constructor is overwrite then default constructor is not remain;
		
		this.wheels = wheels;
		this.colour = colour;
		headlights = 2;
	}
	Vehicle(){		// If there is no value then it is a default constructor
		this.wheels = 3;
		headlights = 2;
	}
}

public class MyConstructors {

	 MyConstructors(){
		
			System.out.println("new objext is now created");
		}
	
	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4);
		Vehicle car2 = new Vehicle(2);
		Vehicle eRikshaw = new Vehicle(3, "yellow");
		Vehicle random = new Vehicle();
		
		
		
		System.out.println(car2.wheels +" Wheels ");
		System.out.println(car.headlights+ "  wheels ");
		
		System.out.println(eRikshaw.wheels +" Whells and colour "+ eRikshaw.colour);
		
	}

}
