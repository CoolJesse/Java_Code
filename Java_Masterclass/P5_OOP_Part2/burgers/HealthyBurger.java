package burgers;

public class HealthyBurger extends Hamburger{
 
	private static final int extraOptions = 1;
	/* Constructor *****************************************************************/
	public HealthyBurger(){
		super(BreadRollType.BROWN_RYE, MeatType.BEEF, 7.0);
	}
}