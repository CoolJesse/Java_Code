package burgers;

enum Sides{
	NONE(0), DRINK(3), CHIPS(3);
	
	private final int available;
	
	Sides(int available){
		this.available = available;
	}
	
	int getAvailable(){
		return available;
	}
}