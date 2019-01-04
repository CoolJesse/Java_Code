public class Car{
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;
	
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
		
	public void setDoors(int newValue){
		doors = newValue;
	}
		
	public void setWheels(int newValue){
		wheels =  newValue;
	}
	
	public void setModel(String newValue){
		model = newValue;
	}
	
	public void setEngine(String newValue){
		engine = newValue;
	}
	
	public void setColour(String newValue){
		colour = newValue;
	}
	
	public void printCarInfo(){
		System.out.println("doors " + doors + " wheels " + wheels + " model " + model + " engine " + " colour " + colour);
	}
} 