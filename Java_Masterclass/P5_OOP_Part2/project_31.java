/* Project 31 from Java Master Class, OOP Part2: Composition part 2 */
import house.*;
/* Challenge ********************************************************************************
1. Create a single room of a house using composition. Think about the things that should be included in the room, physical parts of the house and also furniture as well.
2. Add at least one method to access an object via a getter and then that object's public method
3. Add at least one method to hide the object e.g. not using a getter to access the object used in composition withing the main class
*/

public class project_31{
	public static void main(String[] args){
		
		Room bedroom = new Room();
		
		Room livingroom = new Room("livingroom", new Floor(15, 10, true), new Bed(), new Couch(5, 3, false, new Fabric("white", "suede", true) ), 150, 2);
		
		System.out.println("bedroom " + bedroom.printInfo());
		System.out.println("livingroom " + livingroom.printInfo() );
		
		bedroom.setTypeOfRoom("bedroom");
		System.out.println(bedroom.printInfo());
		
		/* Test bedroom functions ***************************************************/
		System.out.println("Type of room is: " + bedroom.getTypeOfRoom() + 
		
		" width of room is: " + bedroom.getFloor().getWidth() +
		" length of room is: " + bedroom.getFloor().getLength() +
		" The floor is carpeted: " + bedroom.getFloor().getHasCarpet() +
		
		" the bedsize is: " + bedroom.getBed().getBedSize() + 
		" the bed has a headboard: " + bedroom.getBed().getHasHeadboard() +
		" the color of the sheets is: " + bedroom.getBed().getColorOfSheets() + 
	
		" the room is " + bedroom.getSquareFeet() + " square feet and has " + bedroom.getNumberOfWindows() + " windows."); 
		/**************************************************************************/
		
		/* Test livingroom functions ***********************************************/
		System.out.println("Type of room is: " + livingroom.getTypeOfRoom() + 
		" width of room is: " + livingroom.getFloor().getWidth() +
		" length of room is: " + livingroom.getFloor().getLength() +
		" The floor is carpeted: " + livingroom.getFloor().getHasCarpet() +
		
		" the length of the couch is: " + livingroom.getCouch().getLength() + 
		" the width of the couch is: " + livingroom.getCouch().getWidth() +
		" the couch is a futon: " + livingroom.getCouch().getIsFuton() + 
		" the couch is made from: " + livingroom.getCouch().getFabric().getMaterial() +
		" which is the color: " + livingroom.getCouch().getFabric().getColor() +
		" this fabric is machine washable: " + livingroom.getCouch().getFabric().getMachineWashable() +  
		 
		" the room is " + livingroom.getSquareFeet() + " square feet and has " + livingroom.getNumberOfWindows() + " windows.");
		/**************************************************************************/
		
		bedroom.setTypeOfRoom("bedroom");
		bedroom.setFloor(new Floor(60, 100, false) );
		bedroom.setBed(new Bed("king", true, "red") );
		bedroom.setCouch(new Couch(10, 4, false, new Fabric("red", "leather", false) ));
		bedroom.setSquareFeet(6000);
		bedroom.setNumberOfWindows(2);
		
		System.out.println( "bedroom info: "+ bedroom.printInfo());
		//System.out.println();
	}
}