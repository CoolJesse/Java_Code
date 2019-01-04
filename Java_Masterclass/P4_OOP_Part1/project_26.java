/*Project 26 from Java Master Class, OOP Part 1: Constructors - Part 1*/

/* Challenge ******************************************
1. Create a new class for a bank account
2. Create fields for the account number, balance, customer name, email, and phone number
3. Create getter and setters for each fields
4. Create two additional methods:
	a. To allow the customer to deposit funds(increment balance field)
	b. To allow the customer to withdraw funds. Deduct from the balance field, but only if there
	are sufficient funds
4. Write Main class program to test code.
*/
import repo.bankAccount;

public class project_26{
	public static void main(String[] args){
		bankAccount jesse = new bankAccount();
		bankAccount ryan = new bankAccount(123, 1000.23, "Ryan Middleton", "bobbyfuntown@hotmail", 2065551234);
		
		System.out.println("Initial values -------------------->");
		System.out.println("Jesse info: " + jesse.printInfo());
		System.out.println("Ryan info: " + ryan.printInfo());
		System.out.println("");
		
		jesse.setAccountNumber(123456);
		jesse.setBalance(0);
		jesse.setCustomerName("Jesse Olson");
		jesse.setEmail("CoolJesse@yahoo.com");
		jesse.setPhoneNumber(2065555656);
		
		System.out.println("Jesse updated info: " + jesse.printInfo());
		
		System.out.println("Ryan's info: account number: " + ryan.getAccountNumber() + " balance: " + ryan.getBalance() + " customer name: " + ryan.getCustomerName() + " email: " + ryan.getEmail() + " phone number: " + ryan.getPhoneNumber());
		
		jesse.deposit(1500);
		System.out.println("Jesse deposit 1500: " + jesse.printInfo());
		jesse.withdraw(300);
		System.out.println("Jesse withdraw 300: " + jesse.printInfo());
		jesse.deposit(-500);
		System.out.println("Jesse deposit -500: " + jesse.printInfo());
		jesse.withdraw(5000);
		System.out.println("Jesse withdraw 5000: " + jesse.printInfo());

		



		
		
	}
}