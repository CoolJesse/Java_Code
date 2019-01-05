package repo;

public class bankAccount{
	/* Fields/member variables ********************************************************/
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	/**********************************************************************************/
	
	/* Methods ***********************************************************************/
	/* Constructors ***************************************************/
	public bankAccount(){
		this(0, 0.0, "", "", 0); /*calls other constructor with default values. Must be first line after constructor declaration.*/
		//System.out.println("default constructor called.");
	}
	public bankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		
		//System.out.println("parameter constructor called.");
	}
	public bankAccount(String customerName, String email, int phoneNumber){
		this(0, 0.0, customerName, email, phoneNumber);
	}
	/* Setters *******************************************************/
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	/* Getters *******************************************************/
	public int getAccountNumber(){
		return accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	public String getCustomerName(){
		return customerName;
	}
	public String getEmail(){
		return email;
	}
	public int getPhoneNumber(){
		return phoneNumber;
	}
	/* The two additional methods required by challenge ***************/
	public boolean deposit(double amount){
		if(amount >= 0){
			balance += amount;
			return true;
		}
		else{
			System.out.println("error: attempting to deposit a negative value.");
			return false;
		}
	}
	public boolean withdraw(double amount){
		if(balance >= amount){
			balance -= amount;
			return true;
		}
		else{
			System.out.println("error: attempting to withdraw more than current balance.");
			return false;
		}
	}
	public String printInfo(){
		return "account number: " + accountNumber + " balance: " + balance + " customer name: " + customerName + " email: " + email + " phone number: " + phoneNumber;
	}
}