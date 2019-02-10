/****************************************************************************************
Include a "Bank" class
	A. Bank class should have ArrayList of branches
	B. Ability to add a new branch
	C. Add customer to branch with initial transaction
	D. Add a transaction for an existing customer for that branch
	E. Able to show list of customers for a particular branch and optionally a list of their transactions. 
***************************************************************************************/
import java.util.ArrayList;

public class Bank{
	
/** Member Variable ArrayList of all the different bank branches **********************/
	private ArrayList<Branch> theBranches;
	
	String bankName;
	//private ArrayList<String> theBranches;
/**************************************************************************************/
/** Constructors **********************************************************************/
	public Bank(String bankName, String branchName){
		this.bankName = bankName;
		this.theBranches = new ArrayList<Branch>();
		
		theBranches.add(new Branch(branchName) );	
	}
	public Bank(String bankName){
		this(bankName, "N/A");
	}
/**************************************************************************************/
/** Methods ***************************************************************************/
	public String getBankName(){
		return bankName;
	}
	public void addBranch(String branchName){
		if( findBranch(branchName) == -1)
			theBranches.add( new Branch(branchName) );
		
		//System.out.println("Bank.addBranch()");
	}
	public boolean addCustomer(String branch, String name, double balance){
		int index = findBranch(branch);
		
		if(index != -1){
			theBranches.get(index).addCustomer(name, balance);
			return true;
		}
		else{
			System.out.println("Sorry " + this.bankName + " does not have a " + branch + " branch.");
			return false;
		}
		//System.out.println("addCustomer");
		//theBranches.get(0).addCustomer(customer, balance);
	}
	public boolean withdrawl(String branch, String name, double amount){
		int index = findBranch(branch);
		
		if(index != -1){
			theBranches.get(index).withdrawl(name, amount);
			return true;
		}
		else{
			System.out.println("Sorry " + this.bankName + " does not have a " + branch + " branch.");
			return false;
		}
		//System.out.println("withdrawl");
		//theBranches.get(0).withdrawl(customer, amount);
	}
	public boolean deposit(String branch, String name, double amount){
		int index = findBranch(branch);
		
		if(index != -1){
			theBranches.get(index).deposit(name, amount);
			return true;
		}
		else{
			System.out.println("Sorry " + this.bankName + " does not have a " + branch + " branch.");
			return false;
		}
		//System.out.println("deposit");
		//theBranches.get(0).deposit(customer, amount);
	}
	public boolean printBalance(String branch, String name){
		int index = findBranch(branch);
		
		if(index != -1){
			theBranches.get(index).printBalance(name);
			return true;
		}
		else{
			System.out.println("Sorry " + this.bankName + " does not have a " + branch + " branch.");
			return false;	
		}
		//System.out.println("print balance");
		//theBranches.get(0).printBalance(customer);
	}
	public boolean listCustomers(String branch){
		int index = findBranch(branch);
		
		if(index != -1){
			System.out.println(this.bankName + " " + branch + " branch");
			theBranches.get(index).listCustomers();
			return true;
		}
		else{
			System.out.println("Sorry " + this.bankName + " does not have a " + branch + " branch.");
			return false;
		}
		//System.out.println("list customers of branch " + branch);
		//theBranches.get(0).listCustomers();
	}
	public boolean listCustomersAndBalances(String branch){
		int index = findBranch(branch);
		
		if(index != -1){
			System.out.println(this.bankName + " " + branch + " branch");
			System.out.println(this.bankName + " " + branch + " branch");
			theBranches.get(index).listCustomersAndBalances();
			return true;
		}
		else{
			System.out.println("Sorry " + this.bankName + " does not have a " + branch + " branch.");
			return false;
		}		
	}
	public void listBranches(){
		System.out.println(bankName + " branches:");
		for(int i=0; i<theBranches.size(); i++){
			System.out.println(theBranches.get(i).getBranchName());
		}
		//System.out.println("Bank.list branches()");
	}
/** private helper function searches ArrayList<Branch> theBranches for branch with matching name. If it find branch function returns index, if not returns -1 ******/
	private int findBranch(String name){
		for(int i=0; i< theBranches.size(); i++){
			if(theBranches.get(i).getBranchName() == name)
				return i;
		}
		return -1;
	}
}