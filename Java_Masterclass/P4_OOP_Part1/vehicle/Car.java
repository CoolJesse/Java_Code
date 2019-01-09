package vehicle;

public class Car extends Vehicle{
	
	/* Fields ***********************************************************************/
	private int numberDoors;
	private int numberWheels;
	private int gears;
	private boolean isManual;
	
	private int currentGear;
	
	/* Constructors *****************************************************************/
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual){
		super(name, size);
		
		this.numberWheels = wheels;
		this.numberDoors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	public Car(){
		this("car", "small", 0, 0, 0, false );
	}
	
	/* Getters **********************************************************************/
	public int getNumberDoors(){
		return numberDoors;
	}
	public int getNumberWheels(){
		return numberWheels;
	}
	public int getGears(){
		return gears;
	}
	public boolean getIsManual(){
		return isManual;
	}
	public int getCurrentGear(){
		return currentGear;
	}
	
	/* Setters **********************************************************************/
	public void setNumberDoors(int numberDoors){
		this.numberDoors = numberDoors;
	}
	public void setNumberWheels(int numberWheels){
		this.numberWheels = numberWheels;
	}
	public void setGears(int gears){
		this.gears = gears;
	}
	public void setIsManual(boolean isManual){
		this.isManual = isManual;
	}
	public void setCurrentGear(int currentGear){
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
	}
	
	/* Methods ***********************************************************************/
	public void changeVelocity(int speed, int direction){
		move(speed, direction);
		System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
	}
	
	public String printInfo(){
		return ("name: " + getName() + " size: " + getSize() + " velocity: " + getVelocity() + " direction: " + getDirection() + " doors: " + this.numberDoors + " wheels: " + this.numberWheels + " gears: " + this.gears + " is manual: " + this.isManual + " current gear " + this.currentGear);//getCurrentGear() );
	}
}