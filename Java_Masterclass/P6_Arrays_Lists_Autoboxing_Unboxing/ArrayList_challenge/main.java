/** Challenge  
1. Create a program that implements a simple mobile phone that is able to store, modify, remove, and query contact names. 
2. Create seperate class for Contacts (name and phone number).
3. Create a master class (MobilePhone) that holds the ArrayList of Contacts. The MobilePhone classhas the functionality listed above.
4. Add a menu of options that are available.
	A. Options: Quit, print list of contacts, add new contact, update existing contact, remove contact, and search/find contact.
	B. When adding or updating contact check if it already exists (use name)

-- Be sure not to expose the inner workings of the ArrayList to MobilePhone. --
-- MobilePhone should do everything with Contact objects only. --

**/
public class main{
	public static void main(String[] args){
	
		MobilePhone myPhone = new MobilePhone();
		
		/** Tests ********************************************************************/
		/** store() **/
		myPhone.store("Dracula", "1-800-SUN-LOVE");
		myPhone.store("The Wolfman", "1-800-FUL-MOON");
		myPhone.store("The Mummy", "1-800-BAN-DAID");
		myPhone.store("Frankenstein's Monster", "1-800-ITS-ALYV");
		myPhone.store("Creature from the Black Lagoon", "1-800-IAM-FISH");
		
		System.out.println(myPhone.print());
		/** modify() **/
		myPhone.modify("Dracula");
		myPhone.modify("Bigfoot"); /* look for entry that isn't there */
		
		System.out.println(myPhone.print());		
		/** remove() **/
		myPhone.remove("The Mummy");
		myPhone.remove("Bigfoot"); /* try to remove entry that isn't there */
		
		System.out.println(myPhone.print());
		/** test store() again**/
		myPhone.store("BigFoot", "1-800-BIG-FEET");
		myPhone.store("Dracula", "1-800-BLD-SUCK"); /* Test entry that is already there */
		
		System.out.println(myPhone.print());
		/** End of Tests *************************************************************/
	
	}
}