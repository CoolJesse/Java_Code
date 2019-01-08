package vehicle;

public class Car extends Vehicle{
	
	/* Fields ***********************************************************************/
	private int numberDoors;
	private int numberWheels;
	private String color;
	
	/* Constructors *****************************************************************/
	public Car(String steering, String changingGears, int numberDoors, int numberWheels, String color){
		super(steering, changingGears, 0);
		this.numberDoors = numberDoors;
		this.numberWheels = numberWheels;
		this.color = color;
	}
	public Car(){
		this("power steering", "automatic", 4, 4, "black" );
	}
	
	/* Getters **********************************************************************/
	public int getNumberDoors(){
		return numberDoors;
	}
	public int getNumberWheels(){
		return numberWheels;
	}
	public String getColor(){
		return color;
	}
	
	/* Setters **********************************************************************/
	public void setNumberDoors(int numberDoors){
		this.numberDoors = numberDoors;
	}
	public void setNumberWheels(int numberWheels){
		this.numberWheels = numberWheels;
	}
	public void setColor(String color){
		this.color = color;
	}

	public String printInfo(){
		return ("steering: " + getSteering() + " changing gears: " + getChangingGears() + " moving: " + getMoving() + " doors: " + getNumberDoors() + " wheels: " + getNumberWheels() + " color: " + getColor() );
	}

}