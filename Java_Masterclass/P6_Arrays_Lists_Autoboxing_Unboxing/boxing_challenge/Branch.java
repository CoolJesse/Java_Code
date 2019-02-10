/***************************************************************************************
Include a Branch class
	A. Each branch should have an ArrayList of Customers
	B. Ability to add a new customer and initial transaction amount.
	C. Add any additional transactions for that customer/branch
***************************************************************************************/
import java.util.ArrayList;

public class Branch{
/** Member variable ArrayList of all the customers belonging to the bank branch ********/
	private ArrayList<Customer> customers;
	private String branchName;
/***************************************************************************************/
/** Constructor ************************************************************************/
	public Branch(String branchName){
		this.customers = new ArrayList<Customer>();
		this.branchName = branchName;
	}
/***************************************************************************************/
/** Getter *****************************************************************************/
	public String getBranchName(){
		return branchName;
	}
/***************************************************************************************/
/** Methods ****************************************************************************/
	public void addCustomer(String name, double balance){
		if(find(name) == -1)
			customers.add( new Customer(name, balance) );
		else
			System.out.println("Sorry, an account for " + name + " already exists at the " + branchName + " branch.");
		//System.out.println("Branch.addCustomer() " + name);		
	}
	public boolean withdrawl(String name, double amount){
		int index = find(name);
		
		if( index != -1 ){
			customers.get(index).withdrawl(amount);
			return true;
		}
		else{
			System.out.println("Sorry, no customer by the name " + name + " exists at the " + branchName + " branch.");
			return false;
		}
		//System.out.println("Branch.withdrawl() from " + name);
	}
	public boolean deposit(String name, double amount){
		int index = find(name);
		
		if( index != -1 ){
			customers.get(index).deposit(amount);
			return true;
		}
		else{
			System.out.println("Sorry, no customer by the name " + name + " exists at the " + branchName + " branch.");
			return false;
		}
		//System.out.println("Branch.deposit() to the account of " + name);		
	}
	public void printBalance(String name){
		int index = find(name);
		if(index != -1)
			System.out.println( name + " balance: " + 
			customers.get(index).getCurrentBalance() );
		else
			System.out.println("Sorry, no customer by the name: " + name + " exists at the " + branchName + " branch.");
		//System.out.println("Branch.printBalance()" + customer);
	}
	public void listCustomers(){
		System.out.println(branchName);
		for(int i=0; i<customers.size(); i++){
			System.out.println(customers.get(i).getName());
		}
		//System.out.println("Branch.printCustomers()");
	}
	public void listCustomersAndBalances(){
		System.out.println(branchName);
		for(int i=0; i<customers.size(); i++){
			System.out.println( customers.get(i).getName() + " balance: " + customers.get(i).getCurrentBalance() );
		}
	}
/** Search ArrrayList<Customer> customers for matching name, return index if found and -1 if customer not found in list ****************************************************/
	private int find(String name){
		for(int i=0; i < customers.size(); i++){
			if(customers.get(i).getName()==name)
				return i;
		}
		return -1;
	}
/***************************************************************************************/
	
}