/***************************************************************************************
imported May 17, 2019 from:https://www.udemy.com/java-the-complete-java-developer-course/learn/lecture/4152150#overview 
***************************************************************************************/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	/***** Create temporary HashMap of possible exits to initlize each location *****/
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",tempExit));
	/**************************** Initilize location 1 ******************************/
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));
	/**************************** Initilize location 2 ******************************/
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));
	/**************************** Initilize location 3 ******************************/
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));
	/**************************** Initilize location 4 ******************************/
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));
	/**************************** Initilize location 5 ******************************/
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
	/******** Create HashMap with possible direction player may travel ***************/
        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
		
	/********************************* Start Game ************************************/
        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            tempExit.remove("S");
		// Quit game //
            if(loc == 0) {
                break;
            }
		// Tell player which directions they may move from current location //
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
		// Accept user input for direction to move //
            String direction = scanner.nextLine().toUpperCase();
		// If user enters more than single character //			
            if(direction.length() > 1) {
                String[] words = direction.split(" ");
                for(String word: words) {
                    if(vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }
		// Check if player may move chosen direction // 
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
		// If player may not move chosen direction //
            } else {
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
