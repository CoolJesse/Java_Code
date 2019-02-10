/** Java Master Class, Section 8: Arrays, Inbuilt Lists, Autoboxing, and Unboxing **/

/**  Autoboxing and Unboxing Challenge *************************************************
1. Create a simple banking application
2. Include a "Bank" class
	A. Bank class should have ArrayList of branches
	B. Ability to add a new branch
	C. Add customer to branch with initial transaction
	D. Add a transaction for an existing customer for that branch
	E. Able to show list of customers for a particular branch and optionally a list of their transactions.	
3. Include a Branch class
	A. Each branch should have an ArrayList of Customers
	B. Ability to add a new customer and initial transaction amount.
	C. Add any additional transactions for that customer/branch
4. Include a Customer class.
	A. Customer class should have an ArrayList of Doubles (transactions).
	B. Also include customer's name
****************************************************************************************/
import java.util.ArrayList;

public class main{
	public static void main(String[] args){
		Bank BofA = new Bank("BofA");
		Bank USBank = new Bank("US Bank", "New York");
		Bank WellsFargo = new Bank("Wells Fargo", "London");
		
		BofA.addBranch("Seattle");
		USBank.addBranch("Seattle");
		WellsFargo.addBranch("Seattle");
		
		BofA.listBranches();
		USBank.listBranches();
		WellsFargo.listBranches();
		
		BofA.addCustomer("Seattle", "Bigfoot", 100.00);
		BofA.addCustomer("Seattle", "Yeti", 500.00);
		BofA.addCustomer("Seattle", "El Chupacabra", 0.00);
		BofA.addCustomer("New York", "Swamp Thing", 0.00);
		
		USBank.addCustomer("New York", "Bigfoot", -100.00);
		USBank.addCustomer("Seattle", "Yeti", 300000.00);
		USBank.addCustomer("New York", "Yeti", 50.00);

		
		WellsFargo.addCustomer("London", "Bigfoot", -30000.00);
		WellsFargo.addCustomer("London", "Sasquatch", 101.00);
		WellsFargo.addCustomer("London", "Bigfoot", 5.00);
		WellsFargo.addCustomer("London", "Bigfoot", 56.00);
		
		BofA.withdrawl("Seattle", "", 10.50);
		BofA.withdrawl("Seattle", "Bigfoot", 10.50);
		BofA.withdrawl("", "", 10.50);
		BofA.withdrawl("Seattle", "Dracula", 10.50);
		
		USBank.withdrawl("Seattle", "Bigfoot", 10.50);
		USBank.withdrawl("New York", "Bigfoot", 10.50);
		
		WellsFargo.withdrawl("Seattle", "Dracula", 10.50);
		WellsFargo.addCustomer("Seattle", "Dracula", 6.66);
		WellsFargo.withdrawl("Seattle", "Dracula", 10.50);
		
		BofA.printBalance("Seattle", "Bigfoot");
		USBank.printBalance("Seattle", "Bigfoot");
		WellsFargo.printBalance("Seattle", "Bigfoot");
		
		BofA.deposit("Seattle", "Bigfoot", 5.25);
		BofA.printBalance("Seattle", "Bigfoot");
		
		BofA.listCustomers("Seattle");
		USBank.listCustomers("New York");
		WellsFargo.listCustomers("London");
		WellsFargo.listCustomers("Chicago");
		
		BofA.listCustomersAndBalances("Seattle");
		USBank.listCustomersAndBalances("Seattle");
		WellsFargo.listCustomersAndBalances("Seattle");
		
		USBank.addBranch("Chicago");
		USBank.addBranch("London");
		
		WellsFargo.addBranch("San Francico");
		WellsFargo.addBranch("New York");
		
		
		BofA.listBranches();
		USBank.listBranches();
		WellsFargo.listBranches();
		
	}
}

