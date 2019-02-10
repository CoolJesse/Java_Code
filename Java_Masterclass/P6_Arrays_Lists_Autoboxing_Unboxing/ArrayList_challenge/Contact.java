public class Contact{
	/** Member Variables ******************************************************/
	private String name;
	private String phoneNumber;
	/**************************************************************************/
	/** Constructors **********************************************************/
	public Contact(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public Contact(){
		this("John Doe", "555-5555" );
	}
	/**************************************************************************/
	/** Methods ***************************************************************/
	public void setName(String name){
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String getName(){
		return name;
	}
	public String getPhoneNumber(){
		return phoneNumber;	
	}
	
	public static Contact createContact(String name, String phoneNumber){
		return new Contact(name, phoneNumber);
	}
}