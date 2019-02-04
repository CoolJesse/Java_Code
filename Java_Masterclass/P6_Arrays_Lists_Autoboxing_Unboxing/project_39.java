/** Project 39 from Java Master Class, Arrays, Lists...: List and ArrayList part1 *******/
import java.util.ArrayList;
import java.util.Scanner;


public class project_39{
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args){
		boolean quit = false;
		int choice = 0;
		
		while(!quit){
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice){
				case 0:
					printInstructions();
					break;
				case 1:
					groceryList.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					quit = true;
					break;
				default:
					System.out.println("Sorry, invalid input.");
			}
		}
		
	}
/** Methods ***************************************************************************/
	public static void printInstructions(){
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quit the application.");
	}
	public static void printGroceryList(){
		groceryList.printGroceryList();
	}
	public static void addItem(){
		System.out.print("Please enter the grocery item: ");
		/** nextLine accepts input until return in pressed **/
		groceryList.addGroceryItem( scanner.nextLine() );
	}
	public static void modifyItem(){
		System.out.print("Please enter item number: ");
		int itemNumber = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Please enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem( (itemNumber-1), newItem);
	}
	public static void removeItem(){
		System.out.print("Please enter item number: ");
		int itemNumber = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNumber-1);
	}
	public static void searchForItem(){
		System.out.print("Please enter item to search for: ");
		String searchItem = scanner.nextLine();
		
		if(groceryList.findItem(searchItem) != null)
			System.out.println("Found " + searchItem + " in our grocery list.");
		
		else
			System.out.println(searchItem + " is not in the shopping list.");
	}
}