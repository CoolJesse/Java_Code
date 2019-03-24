import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
	
public class Wolfman implements IMonsters{
/** Fields *****************************************************************/
	private final String typeOfCreature = "Wolfman";
	private final String weakness = "Silver Bullet";
	private String personName;
	private String age;
	//private String gender;
	private Gender gender;
/****************************************************************************/
/** Constructors*************************************************************/
	public Wolfman(String personName, int age, String gender){
		this.personName = personName;
		
		if(age < 0 || age > 120)
			this.age = "0";
		else
			this.age = String.valueOf(age);
		
		this.gender = Gender.valueOf(gender);
	}
	public Wolfman(){
		this("unknown", 0, "NA");
	}
/** Setters ******************************************************************/
	public void setPersonName(String name){
		this.personName = name;
	}
	public void setAge(int age){
		if(age >= 0)
			this.age = String.valueOf(age);
		else this.age = "0";
	}
	public void setGender(String gender){
		this.gender = Gender.valueOf(gender);
	}
/** Getters ******************************************************************/
	public String getPersonName(){
		return personName;
	}
	public String getAge(){
		return age;
	}
	public String getGender(){
		return gender.toString();
	}
/** methods *******************************************************************/
	@Override
	public ArrayList<String> outputTraits(){

		ArrayList<String> traits = new ArrayList<String>();
		traits.add(typeOfCreature);
		traits.add(weakness);
		traits.add(personName);
		traits.add(age);
		traits.add(gender.toString());
		
		return traits;	
	}
	@Override
	public void inputTraits(List<String> info){

		Iterator itr = info.iterator();
		
		if(itr.hasNext())
			personName = itr.next().toString();
		if(itr.hasNext()){
			age = itr.next().toString();
			if(Integer.parseInt(age) < 0)
				age = "0";
		}
		if(itr.hasNext())
			gender = Gender.valueOf( itr.next().toString() );
	}
	@Override
	public String toString(){
		return ("Creature: " + typeOfCreature + " weakness: " + weakness + " human name: " +personName + " age: " + age + " gender: " + gender.toString());
	}
	@Override
	public boolean equals(Object obj){
		if(obj != null && getClass() == obj.getClass()){
			if(this == obj)
				return true;
			
			Wolfman temp = (Wolfman)obj;
			
			return(personName.equals(temp.personName) && age.equals(temp.age) && gender.equals(temp.gender) );
		}
		else
			return false;
	}
/******************************************************************************/
}