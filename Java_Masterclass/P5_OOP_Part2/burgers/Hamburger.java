package burgers;

public class Hamburger{
	
	/* Fields ************************************************************************/
	private MeatType meat;
	private MeatTemp temperature;
	private BreadRollType bread;
	
	private AddOns addOn_1;
	private AddOns addOn_2;
	private AddOns addOn_3;
	private AddOns addOn_4;
	
	private double price;
	private String name;
	private static final int extraOptions = 0;
	
	/* Constructor *******************************************************************/
	//public Hamburger(String bread, String meat, double price){
	public Hamburger(BreadRollType bread, MeatType meat, double price){
		this.bread = bread;
		this.meat = meat;
		this.price = price;
		
		temperature = MeatTemp.MEDIUM;
		
		addOn_1 = AddOns.NONE;
		addOn_2 = AddOns.NONE;
		addOn_3 = AddOns.NONE;
		addOn_4 = AddOns.NONE;
		
		name = "hamburger";
		//extraOptions = 0;
	}
	public Hamburger(){
		this(BreadRollType.WHITE_BUN, MeatType.BEEF, 5.0);
	}
	/* Methods ***********************************************************************/
	
	/** Add toppings to burger *******************************************************/
	public void addToppings(AddOns addOn_1, AddOns addOn_2, AddOns addOn_3, AddOns addOn_4){
		if(extraOptions == addOn_1.getAvailable() ){
			this.addOn_1 = addOn_1;
			price += addOn_1.getPrice();
		}
		if(extraOptions == addOn_2.getAvailable() ){
			this.addOn_2 = addOn_2;
			price += addOn_2.getPrice();
		}
		if(extraOptions == addOn_3.getAvailable() ){
			this.addOn_3 = addOn_3;
			price += addOn_3.getPrice();
		}
		if(extraOptions == addOn_4.getAvailable() ){
			this.addOn_4 = addOn_4;
			price += addOn_4.getPrice();
		}
		/*
		price += (addOn_1.getPrice() + addOn_2.getPrice() + addOn_3.getPrice() + addOn_4.getPrice() );*/
	}
	public void addToppings(AddOns addOn_1){
		if(addOn_1.getAvailable() == extraOptions){
			if(this.addOn_1 == AddOns.NONE){
				this.addOn_1 = addOn_1;
				price += addOn_1.getPrice();
			}
			else if(this.addOn_2 == AddOns.NONE){
				this.addOn_2 = addOn_1;
				price += addOn_1.getPrice();
			}
			else if(this.addOn_3 == addOn_1){
				this.addOn_3 = addOn_1;
				price += addOn_1.getPrice();
			}
			else if(this.addOn_4 == addOn_1){
				this.addOn_4 = addOn_1;
				price += addOn_1.getPrice();
			}
			else
				;
		}
		else
			System.out.println("Sorry " + addOn_1 + " is not an option for this burger");
	}
	/**********************************************************************************/
	/** remove toppings after they have been added ************************************/
	public void removeTopping(AddOns topping){
		
		if( addOn_1 == topping ){
			addOn_1 = AddOns.NONE;
			price -= topping.getPrice();
		}
		else if( addOn_2 == topping ){
			addOn_2 = AddOns.NONE;
			price -= topping.getPrice();
			
		}
		else if( addOn_3 == topping ){
			addOn_3 = AddOns.NONE;
			price -= topping.getPrice();	
		}
		else if( addOn_4 == topping ){ 
			addOn_4 = AddOns.NONE;
			price -= topping.getPrice();			
		}
		else
			; /* DO NOTHING */		
	}
	/***********************************************************************************/
	/** adjust meat temperature ********************************************************/
	public void meatTemperature(MeatTemp temperature){
		this.temperature = temperature;
	}
	
	/** print burger info **************************************************************/
	public String orderBurger(){
		
		String returnMessage = ("A " + meat + " " + name + " cooked " + temperature + " on a " + bread);
		
		if(addOn_1 != AddOns.NONE)
			returnMessage += (" with " + addOn_1.name() + " " + addOn_1.getPrice() );
			
		if(addOn_2 != AddOns.NONE)
			returnMessage += (" with " + addOn_2.name() + " " + addOn_2.getPrice() );			
		if(addOn_3 != AddOns.NONE)
			returnMessage += (" with " + addOn_3.name() + " " + addOn_3.getPrice() );			
		if(addOn_4 != AddOns.NONE)
			returnMessage += (" with " + addOn_4.name() + " " + addOn_4.getPrice() );

		returnMessage += " final price: $" + price;
		
		return returnMessage;
	}
}