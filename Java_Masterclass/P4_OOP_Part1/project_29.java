/* Project 29 from Java Master Class, OOP Part 1: Inheritance Challenge part 1*/
import vehicle.*;

public class project_29{
	public static void main(String[] args){
		
		Vehicle generalVehical = new Vehicle();
		Car basicCar = new Car();
		RaceCar winner = new RaceCar("red", true, "Jimmy Dean Sausage", 12.0);
		
		System.out.println("Vehicle: " + generalVehical.printInfo());
		System.out.println("Car: " + basicCar.printInfo());
		System.out.println("RaceCar: " + winner.printInfo());
	}
}

/* Challenge ******************************************************************
1. Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
2.Finally create another class, a specific type fo Car that inherits from the Car class.
You should be able to hand steering, changing gears, and moving (speed in other words). You will want to decide where to put the appropriate state and behaviors (fields and methods). As mentioned above, changing gears, increasing/decreasing speed should be included. For your specific type of vehicle you will want to add something specific for that type of car.
*/