/** Basic class for testing with data structures **/

public class Person{

/** Member variables/fields *********************************************************/
	private String name;
	private int age;
	private char gender;

/** Constructors ********************************************************************/
	public Person(String name, int age, char gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Person(){
		this("nobody", 0, 'z');
	}
/** Getters *************************************************************************/
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}
/** Setters *************************************************************************/
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
/** Methods *************************************************************************/
	public String printInfo(){
		String personInfo = "";
			
		personInfo += name;
		personInfo += ": age = ";
		personInfo += String.valueOf(age);
		personInfo += ", gender is ";
		personInfo += String.valueOf(gender);
		
		return personInfo;
	}
}