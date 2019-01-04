/*Project 25 from Java Master Class, OOP Part 1: Classes Part 1*/
import repo.Car;

public class project_25{
	public static void main(String[] args){
		Car porsche = new Car(2, 4, "new", "V8", "black");
		Car toyota = new Car();
		
		porsche.printCarInfo();
		
		toyota.setDoors(2);
		toyota.setWheels(3);
		toyota.setModel("F-250");
		toyota.setEngine("2 stroke");
		toyota.setColour("Pink");
		
		System.out.printf( "Toyota info: "); 
		toyota.printCarInfo();
		
		
	
	}
}