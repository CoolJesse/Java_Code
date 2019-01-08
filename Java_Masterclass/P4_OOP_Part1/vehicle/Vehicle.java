package vehicle;

public class Vehicle{
	
	/* Fields ***********************************************************************/
	private String steering;
	private String changingGears;
	private int moving;
	
	/* Constructors *****************************************************************/
	public Vehicle(String steering, String changingGears, int moving){
		this.steering = steering;
		this.changingGears = changingGears;
		this.moving = moving;
	}
	public Vehicle(){
		this("", "", 0);
	}
	
	/* Getters ***********************************************************************/
	public String getSteering(){
		return steering;
	}
	public String getChangingGears(){
		return changingGears;
	}
	public int getMoving(){
		return moving;
	}
	
	/* Setters ************************************************************************/
	public void setSteering(String steering){
		this.steering = steering;
	}
	public void setChangingGears(String changingGears){
		this.changingGears = changingGears;
	}
	public void setMoving(int moving){
		this.moving = moving;
	}
	
	public String printInfo(){
		return ("steering: " + getSteering() + "changing gears: " + getChangingGears() + "moving: " + getMoving() );
	}
	
}