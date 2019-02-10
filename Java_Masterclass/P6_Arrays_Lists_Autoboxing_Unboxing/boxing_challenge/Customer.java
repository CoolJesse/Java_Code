/***************************************************************************************
Include a Customer class.
	A. Customer class should have an ArrayList of Doubles (transactions).
	B. Also include customer's name
***************************************************************************************/
import java.util.ArrayList;

public class Customer{
	
/** Member Variables ******************************************************************/
	private ArrayList<Double> transactions;
	
	private String name;
	private double balance;
/*************************************************************************************/
/** Constructors *********************************************************************/
	public Customer(String name, double balance){
		this.name = name;
		this.balance = balance;
		this.transactions = new ArrayList<Double>();
		this.transactions.add(balance);
	}
	public Customer(String name){
		this(name, 0.0);
	}
/*************************************************************************************/
/** Getters **************************************************************************/
	public String getName(){
		return name;
	}
	public double getCurrentBalance(){
		return balance;
	}
/*************************************************************************************/
/** Methods **************************************************************************/
	public boolean withdrawl(double amount){
		if( (amount >=0) && (balance >= amount) ){
			amount *= -1;
			transactions.add(amount);
			balance += amount;
			return true;
		}
		else
			return false;
	}
	public boolean deposit(double amount){
		if(amount >= 0){
			transactions.add(amount);
			balance += amount;
			return true;
		}
		else
			return false;
	}
	public void printTransactionHistory(){
		double previousBalance = 0.0;
		
		for(int i=0; i < transactions.size(); i++){
			System.out.println("Transaction " + (i+1) + " previous balance: " +previousBalance + " transaction amount: " + transactions.get(i) + " current balance: " + (previousBalance += transactions.get(i)) );
			
			previousBalance += transactions.get(i);
		}
	}
/*************************************************************************************/
}