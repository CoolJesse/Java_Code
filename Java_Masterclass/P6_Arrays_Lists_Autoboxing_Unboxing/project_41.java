/** Java Master Class, Section 8: Arrays, Java inbuilt Lists, Autoboxing and Unboxing **/

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class project_41{
	public static void main(String[] args){
	
		LinkedList<String> monsters = new LinkedList<String>();
		LinkedList<String> monsters_ABC = new LinkedList<String>();
		
		monsters.add("Dracula");
		monsters.add("The Wolfman");
		monsters.add("The Mummy");
		monsters.add("Frankenstein's Monster");
		monsters.add("The Creature from the Black Lagoon");
		monsters.add("The Blob");
		monsters.add("King Kong");
		monsters.add("Godzilla");
		
		for(ListIterator<String> it = monsters.listIterator(); it.hasNext(); ){
			String monster = it.next();
			if( !addInOrder(monsters_ABC, monster ) )
				System.out.println("Error " + monster + " already in list!");
		}
		printList(monsters);
		printList(monsters_ABC);
		
		monsters.add(1, "Slender Man");
		printList(monsters);
		
		monsters.remove(1);
		printList(monsters);
	}
/************************************************************************************/	
/** Methods *************************************************************************/

/** Iterator.next() returns object currently pointed to and then advances to next node **/
	private static void printList(LinkedList<String> linkedList){
		for(Iterator<String> it = linkedList.iterator(); it.hasNext() ; ){
			System.out.println( "Monster: " + it.next() );
		}
		System.out.println("*******************************************************");
	}
/** Takes a string representing a monster name and adds it to specified linked list in alphabetical order. Adds to end of list if monster name is alphabetically last ******/
	private static boolean addInOrder(LinkedList<String> linkedList, String monster){
		
		ListIterator<String> it = linkedList.listIterator();
		
		while(it.hasNext()){
		/** compareTo() returns integer value. If equal to 0 two objects match **/
		/** because we are using .next() iterator automatically increments **/
			int comparison = it.next().compareTo(monster);
			
		/** monster should appear after this one **/
			if(comparison == 0)
				return false;
		/** monster should appear before this one **/
			else if(comparison > 0){
				it.previous();
				it.add(monster);
				return true;
			}
		/** monster should appear after this one so do nothing **/
			else{/** (comparison < 0) **/
			}
		}
	/** Add to end of list **/
		it.add(monster);
		return true;
	}
}