public class Contacts{
	/** Member Variables ******************************************************/
	private String name;
	private String phoneNumber;
	/**************************************************************************/
	/** Constructors **********************************************************/
	public Contacts(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public Contacts(){
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
}