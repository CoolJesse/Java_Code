package burgers;

public class HealthyBurger extends Hamburger{
 
	//private final int extraOptions = 1;
	
	//private final String name = "healthy hamburger";
	//private String name;
	
	/* Constructor *****************************************************************/
	/*
	private void setName(String burgerName){
		name = burgername;
	}
	*/
	public HealthyBurger(){
		super(BreadRollType.BROWN_RYE, MeatType.BEEF, 7.0);
		
		setNameAndOptions("healthy burger", 1);
	}
}