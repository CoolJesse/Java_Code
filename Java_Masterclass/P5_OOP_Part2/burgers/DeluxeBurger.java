package burgers;

public class DeluxeBurger extends Hamburger{
	private final int extraOptions = 3;	
	
	private final String name = "deluxe";

	/* Constructor *********************************************************************/
	public DeluxeBurger(){
		super(BreadRollType.WHITE_BUN, MeatType.BEEF, 8.0);
		addSide(Sides.DRINK);
		addSide(Sides.CHIPS);
	}
}