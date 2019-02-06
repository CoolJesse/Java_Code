import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone{
	/** Private ArrayList that holds all contact info *************************/
	private ArrayList<Contacts> contacts = new ArrayList<Contacts>();
	private Scanner scanner = new Scanner(System.in);
	/**************************************************************************/
	
	/** Constructors **********************************************************/
	//No constructor since we must initilize ArrayList when we declare it above
	/**************************************************************************/
	
	/** Methods ***************************************************************/
	private void store(String name, String number, boolean search){
		/** If item is not already known to be in list search for it **/	
		if(search){
			int index = query(name);
			
		/** If item is not already in list add it **/
			if(index == -1)
				contacts.add( new Contacts(name, number) );
		}
		/** If we want to add contact without first searching for it. **/
		else{
			contacts.add( new Contacts(name, number) );
		}
	}
	public void store(String name, String number){
		store(name, number, true);
	}
	public void modify(String contact){
		int index = query(contact);
		/** If item is present in list, modify it **/
		if(index != -1){
			System.out.print("Please enter the new phone number for " + contact + ": " );
			String number = scanner.nextLine();
			contacts.set(index, new Contacts(contact, number) );
		}
		else{
			System.out.print(contact + " not found in list, adding contact info. Please enter the phone number for " + contact + ": ");
			
			String number = scanner.nextLine();
			store(contact, number, false);
		}
	}
	public void remove(String name){
		int index = query(name);
		/** If item is present in list remove it **/
		if(index != -1)
			contacts.remove(index);
	}
	public String print(){
		String list = "";
		
		for(int i=0; i < contacts.size(); i++){
			list += contacts.get(i).getName() + ": " + contacts.get(i).getPhoneNumber() + " \n"; 
		}
		return list;
	}
	
	/** Private helper function to find index of contact object in list **/
	private int query(String name){
		for(int i=0; i < contacts.size(); i++){
			if( contacts.get(i).getName() == name )
				return i;
		}
		
		return -1;
	}
	/**************************************************************************/
}