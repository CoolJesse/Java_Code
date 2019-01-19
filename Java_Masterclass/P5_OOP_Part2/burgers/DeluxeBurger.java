package burgers;

public class DeluxeBurger extends Hamburger{
	//private final int extraOptions = 3;	
	
	//private static final String name = "deluxe hamburger";
	//private String name;

	/* Constructor *********************************************************************/
	/*
	private void setName(String burgerName){
		name = burger;
	}
	*/
	public DeluxeBurger(){
		super(BreadRollType.WHITE_BUN, MeatType.BEEF, 8.0);
		addSide(Sides.DRINK);
		addSide(Sides.CHIPS);
		
		setNameAndOptions("Deluxe Burger", 3);
	}
	

	/** Overload addTopping method to prevent adding addtional items to Deluxe *********/
	@Override
	public void addToppings(AddOns addOn_1, AddOns addOn_2, AddOns addOn_3, AddOns addOn_4){
		System.out.println("Sorry, you cannot add any additional topping to the Deluxe Hamburger.");
	}
	@Override
	public void addToppings(AddOns addOn_1){
		System.out.println("Sory, you cannot add any additional toppings to the Deluxe Hamburger.");
	}
}