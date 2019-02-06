import java.util.ArrayList;

/** Built in ArrayList methods **********************************************************
- ArrayList list.add(variable/object);
- ArrayList list.get(variable/object);
- ArrayList list.set(postition, variable/object);
- ArrayList list.remove(postition);
****************************************************************************************/

public class GroceryList{
/** Member variable ArrayList to hold grocery items ****************************/
	private ArrayList<String> groceryList = new ArrayList<String>();
/*******************************************************************************/
	
/** Methods ********************************************************************/
	public ArrayList<String> getGroceryList(){
		return groceryList;
	}
	public boolean onFile(String item){
		int position = findItem(item);
		
		if(position != -1)
			return true;
		else
			return false;
	}
	public void addGroceryItem(String item){
		groceryList.add(item);
	}
	public void printGroceryList(){
		System.out.println("You have " + groceryList.size() + " items in your grocery list.");
		for(int i=0; i < groceryList.size(); i++){
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	public void modifyGroceryItem(String currentItem, String newItem){
		int index = findItem(currentItem);
		
		if(index != -1)
			modifyGroceryItem(index, newItem);		
	}
	public void removeGroceryItem(String item){
		int index = findItem(item);
		
		if(index != -1)
			removeGroceryItem(index);
	}
	/** private internal methods *************************************************/
	private void removeGroceryItem(int position){
		String item = groceryList.get(position);
		groceryList.remove(position);
	}
	private void modifyGroceryItem(int position, String newItem){
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position +1) + " has been modified.");
	}
	private int findItem(String searchItem){
		/** returns -1 if item is not in list **/
		return groceryList.indexOf(searchItem);
	}
}