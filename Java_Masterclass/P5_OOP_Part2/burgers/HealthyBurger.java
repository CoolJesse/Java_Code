package burgers;

public class HealthyBurger extends Hamburger{
 
	private final int extraOptions = 1;
	
	private final String name = "healthy hamburger";
	
	/* Constructor *****************************************************************/
	public HealthyBurger(){
		super(BreadRollType.BROWN_RYE, MeatType.BEEF, 7.0);
	}
}