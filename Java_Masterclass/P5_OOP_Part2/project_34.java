/* Project 34 from Java Master Class, OOP Part 2: Polymorphism Challenge */
/*
1. Create a base class called Car. It should have a few fields that would be appropriate for a generic car class; engine, cylinders, wheels, etc.
2. Constructor should initialize cylinders (number of) and name, and set wheels to 4 and engine to true. Cylinders and names would be passed parameters.
3. Create appropriate getters
4. Create some methods like startEngine, accelerate, and brake
5. Show a message for each in the base class
6. Now create 3 sub classes for your favorite vehicles
7. Override the appropriate methods to demonstrate polymorphism in use
8. Put all classes in the one java file
*/
/* Base class ***********************************************************************/
class Car{
	/* Fields ****************************************/
	private boolean engine;
	private boolean absBrakes;
	
	private int cylinders;
	private int wheels;
	private int doors;
	
	private String name;
	
	/* Constructor ***********************************/
	public Car(boolean absBrakes, int cylinders, int doors, String name){
		this.engine = true;
		this.absBrakes = absBrakes;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.doors = doors;
		this.name = name;
	}
	
	/* Getters ***************************************/
	public boolean getEngine(){
		return engine;
	}
	public boolean getAbsBrakes(){
		return absBrakes;
	}
	public int getCylinders(){
		return cylinders;
	}
	public int getWheels(){
		return wheels;
	}
	public int getDoors(){
		return doors;
	}
	
	/* Methods ***************************************/
	/* getClass() function extended from Object class */
	public String startEngine(){
		return(getClass().getSimpleName() + ": Starting engine."); 
	}
	public String accelerate(){
		return(getClass().getSimpleName() + ": Make car go now");
		
	}
	public String brake(){
		return(getClass().getSimpleName() + ": Pump the brakes");
	}
}
/* Sub Classes ***********************************************************************/
class RaceCar extends Car{
	public RaceCar(int cylinders, int doors, String name){
		super(true, cylinders, doors, name);
	}
	@Override
	public String startEngine(){
		return(getClass().getSimpleName() + ": Gentlemen, start your engines.");
	}
	@Override
	public String brake(){
		return(getClass().getSimpleName() + ": Checkered Flag");
	}
}

class PickupTruck extends Car{
	public PickupTruck(int cylinders, int doors, String name){
		super(false, cylinders, doors, name);
	}
	@Override
	public String startEngine(){
		return(getClass().getSimpleName() + ": Let those glow plugs warm up");
	}
}

class StretchLimo extends Car{
	public StretchLimo(boolean absBrakes, int cylinders, int doors, String name){
		super(absBrakes, cylinders, doors, name);
	}
	@Override
	public String accelerate(){
		return(getClass().getSimpleName() + ": Slowly, make sure the client doesn't spill their drink");

	}
	@Override
	public String brake(){
		return(getClass().getSimpleName() + ": STOP!");
	}
}
/* Main body of program ***************************************************************/
public class project_34{
	public static void main(String[] args){
		
		Car car = new Car(true, 4, 4, "Pinto");
		RaceCar racecar = new RaceCar(12, 0, "Budweiser");
		PickupTruck truck = new PickupTruck(12, 2, "Gravedigger");
		StretchLimo limo = new StretchLimo(true, 6, 4, "Stretch Hummer");
		
		System.out.println( car.startEngine() );
		System.out.println( car.accelerate() );
		System.out.println( car.brake() );
		
		System.out.println( racecar.startEngine() );
		System.out.println( racecar.accelerate() );
		System.out.println( racecar.brake() );
		
		System.out.println( truck.startEngine() );
		System.out.println( truck.accelerate() );
		System.out.println( truck.brake() );
		
		System.out.println( limo.startEngine() );
		System.out.println( limo.accelerate() );
		System.out.println( limo.brake() );
		
		System.out.println("Car info: " + car.getEngine()+" "+ car.getAbsBrakes()+" "+ car.getCylinders()+" "+ car.getWheels()+" "+ car.getDoors() );
		System.out.println("Racecar info: " + racecar.getEngine()+" "+ racecar.getAbsBrakes()+" "+ racecar.getCylinders()+" "+ racecar.getWheels()+" "+ racecar.getDoors());
		System.out.println("Pickup truck info: " + truck.getEngine()+" "+ truck.getAbsBrakes()+" "+ truck.getCylinders()+" "+ truck.getWheels()+" "+ truck.getDoors());
		System.out.println("Stretch limo info: " + limo.getEngine()+" "+ limo.getAbsBrakes()+" "+ limo.getCylinders()+" "+ limo.getWheels()+" "+ limo.getDoors());
	}
}
