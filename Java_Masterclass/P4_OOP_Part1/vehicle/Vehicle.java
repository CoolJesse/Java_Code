package vehicle;

public class Vehicle{
	
	/* Fields ***********************************************************************/
	private String name;
	private String size;
	
	private int velocity;
	private int direction;
	
	/* Constructors *****************************************************************/
	public Vehicle(String name, String size, int velocity, int direction){
		this.name = name;
		this.size = size;
		this.velocity = velocity;
		this.direction = direction;
	}
	public Vehicle(){
		this("", "", 0, 0);
	}
	public Vehicle(String name, String size){
		this(name, size, 0, 0);
	}
	
	/* Getters ***********************************************************************/
	public String getName(){
		return name;
	}
	public String getSize(){
		return size;
	}
	public int getVelocity(){
		return velocity;
	}
	public int getDirection(){
		return direction;
	}
	
	/* Setters ************************************************************************/
	public void setName(String name){
		this.name = name;
	}
	public void setSize(String size){
		this.size = size;
	}
	public void setVelocity(int velocity){
		this.velocity = velocity;
	}
	public void setDirection(int direction){
		this.direction = direction;
	}
	
	/* Methods ************************************************************************/
	public void steer(int direction){
		this.direction = direction;
		System.out.println("Vehicle.steer(): steering at " + direction + " degrees.");

	}
	public void move(int velocity, int direction){
		this.velocity = velocity;
		this.direction = direction;
		System.out.println("Vehicle.move(): moving at " + velocity + " in direction " + direction);
	}
	public void stop(){
		this.velocity = 0;
	}
	
	public String printInfo(){
		return ("name: " + getName() + " size: " + getSize() + " velocity: " + getVelocity() + " direction: " + getDirection() );
	}
	
}