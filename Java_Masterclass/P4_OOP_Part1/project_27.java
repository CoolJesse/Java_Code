/* Project 27 from Java Master Class, OOP Part 1: Constructors - Part 2 */

/* Challenge *****************************************************************************
1. Create a new class called VipCustomer. It should have 3 fields: name, credit limit, & email address.
2.Create 3 constructors
	a. 1st constructor empty should call the constructor with 3 parameters with default values
	b. 2nd constructor should pass 2 values and add a default value for the 3rd
	c. 3rd constuctor should save all fields
3. Create getters only for this code generation as setters will not be needed
4. Test and confirm it works
*/

import repo.VipCustomer;

public class project_27{
	public static void main(String[] args){
		
		VipCustomer Wolfman = new VipCustomer();
		VipCustomer Dracula = new VipCustomer("Dracula", 1000.00, "DrAcula@hotmail.com");
		VipCustomer Mummy = new VipCustomer("Mummy", 50000.00);
		VipCustomer Frankenstein = new VipCustomer("Frankenstien", "itsalive@yahoo.com");
		
		System.out.println("Wolfman's info: " + Wolfman.getName() + ", credit limit: " + Wolfman.getCreditLimit() + ", email address: " + Wolfman.getEmailAddress());	
		
		System.out.println("Dracula's info: " + Dracula.getName() + ", credit limit: " + Dracula.getCreditLimit() + ", email address: " + Dracula.getEmailAddress());	
		
		System.out.println("Mummy's info: " + Mummy.getName() + ", credit limit: " + Mummy.getCreditLimit() + ", email address: " + Mummy.getEmailAddress());
		
		System.out.println("Frankenstein's info: " + Frankenstein.getName() + ", credit limit: " + Frankenstein.getCreditLimit() + ", email address: " + Frankenstein.getEmailAddress());
		
	}
}