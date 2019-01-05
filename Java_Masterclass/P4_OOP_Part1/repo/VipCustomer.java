package repo;

public class VipCustomer{
	/* Fields ****************************************************************************/
	private String name;
	private double creditLimit;
	private String emailAddress;
	/*************************************************************************************/
	/* Constructors **********************************************************************/
	public VipCustomer(String name, double creditLimit, String emailAddress){
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	public VipCustomer(){
		this("", 0.0, "");
	}
	public VipCustomer(String name, double creditLimit){
		this(name, creditLimit, "");
	}
	public VipCustomer(String name, String emailAddress){
		this(name, 0.0, emailAddress);
	}
	public String getName(){
		return name;
	}
	public double getCreditLimit(){
		return creditLimit;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
}