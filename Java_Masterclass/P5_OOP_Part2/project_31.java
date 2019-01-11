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
		System.out.println(bedroom.getTypeOfRoom());
		//System.out.println();
		//System.out.println();
	}
}