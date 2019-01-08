package repo;

public class Animal{
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	
	/* Constructors ****************************************************************/
	public Animal(String name, int brain, int body, int size, int weight){
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.body = size;
		this.weight = weight;
	}
	/*
	public Animal(){
		this("", 0, 0, 0, 0);
	}
	public Animal(String name){
		this(name, 0, 0, 0, 0);
	}
	*/
	
	/* Methods ***********************************************************************/
	public void eat(){
		System.out.println("Animal.eat() called");
	}
	public void move(){
		
	}
	public void move(int speed){
		System.out.println("Animal is moving at " + speed);
	}
	/* Getters ***********************************************************************/
	public String getName(){
		return name;
	}
	public int getBrain(){
		return brain;
	}
	public int getBody(){
		return body;
	}
	public int getSize(){
		return size;
	}
	public int getWeight(){
		return weight;
	}
}