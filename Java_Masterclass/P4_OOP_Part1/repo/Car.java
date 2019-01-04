package repo; /*Indicates to the compiler that Car class belongs in repo package*/ 

public class Car{
	
	/* Member Variables ********************************************************************/
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	/****************************************************************************************/
	
	/* Methods *****************************************************************************/
	/* Constructors ****************************************************/
	public Car(){
		doors = 0;
		wheels = 0;
		model = "";
		engine = "";
		colour = "";
	}
	public Car(int numDoors, int numWheels, String theModel, String sizeEngine, String theColour){
		doors = numDoors;
		wheels = numWheels;
		model = theModel;
		engine = sizeEngine;
		colour = theColour;
	}
	/* Setters *********************************************************/
	public void setDoors(int doors){
		this.doors = doors;
	}
		
	public void setWheels(int wheels){
		this.wheels =  wheels;
	}
	
	public void setModel(String model){
		this.model = model;
	}
	public void setEngine(String newValue){
		engine = newValue;
	}
	public void setColour(String newValue){
		colour = newValue;
	}
	/* getters ********************************************************/
	public int getDoors(){
		return this.doors;
	}
	public int getWheels(){
		return this.wheels;
	}
	public String getModel(){
		return this.model;
	}
	public String getEngine(){
		return this.engine;
	}
	public String getColour(){
		return this.colour;
	}
	/* Print function */
	public void printCarInfo(){
		System.out.println("doors: " + doors + ", wheels: " + wheels + ", model: " + model + ", engine: " + engine + ", colour: " + colour);
	}
} 