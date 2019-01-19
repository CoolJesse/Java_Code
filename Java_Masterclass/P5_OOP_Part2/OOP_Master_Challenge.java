/* Final challenge for Java Master Class, OOP Part 2: OOP Master Challenge */
import burgers.*;
/*
1. Purpose is to create application to help "Bills Burgers" manage process of selling burgers.
2. App will help Bill to Select types of burgers, some additional items to be added to burgers, and pricing.
3. Create a base class for hamburger, and two sub classes for other types of burgers. 
4. The basic burger should have the following items: bread roll type, meat, and up to 4 additional items i.e. lettuce, tomato, etc that can be added to burger.
5. Each item added to the burger gets charged an additional price so figured into final cost of burger.
6. Constructor should only include the roll type, meat, and price. Can also include name of burger or can use setter.
7. Also create two extra varieties of Hamburgers; Healthy burger and Deluxe burger.
8. Healthy burger on a brown rye roll, plus two additional items for this burger
9. Deluxe burger comes with chips and drinks as additions, but no extra additions are allowed. You must find a way to add these two additions when object is created and prevent other additions from being added later on
10. All three burgers should have methods to show the base price of the burger, plus all add ons, showing the name of each add on and the price, and the grand total for the burger.  
*/

public class OOP_Master_Challenge{
	public static void main(String[] args){
		
		/** Initialize Hamburger, HealthyBurger, and Deluxe Burger Objects **********/
		Hamburger burger = new Hamburger(BreadRollType.WHITE_BUN, MeatType.BEEF, 6.5);
		Hamburger anotherBurger = new Hamburger();
		HealthyBurger healthyBurger = new HealthyBurger();
		DeluxeBurger deluxeBurger = new DeluxeBurger();
		/****************************************************************************/
		
		/** Print details of each burger ********************************************/
		System.out.println("burger: " + burger.orderBurger());
		System.out.println("another burger: " + anotherBurger.orderBurger());
		System.out.println("healthy burger: " + healthyBurger.orderBurger());
		System.out.println("deluxe burger: " + deluxeBurger.orderBurger());
		/****************************************************************************/
		
		/** Test addToppings() functions *********************************************/
		burger.addToppings(AddOns.LETTUCE, AddOns.TOMATO, AddOns.ONION, AddOns.PICKLES);
		anotherBurger.addToppings(AddOns.AVACADO);
		healthyBurger.addToppings(AddOns.AVACADO);
		healthyBurger.addToppings(AddOns.TOMATO, AddOns.LETTUCE, AddOns.ONION, AddOns.PICKLES);
		deluxeBurger.addToppings(AddOns.TOMATO);
		deluxeBurger.addToppings(AddOns.CHEESE, AddOns.LETTUCE, AddOns.ONION, AddOns.PICKLES);
		/*****************************************************************************/
		
		/** Print details of each burger *********************************************/
		System.out.println("burger: " + burger.orderBurger());
		System.out.println("another burger: " + anotherBurger.orderBurger());
		System.out.println("healthy burger: " + healthyBurger.orderBurger());
		System.out.println("Deluxe burger: " + deluxeBurger.orderBurger());
		/*****************************************************************************/
		
		/** Test removeTopping() functions *******************************************/
		burger.removeTopping(AddOns.TOMATO);
		burger.removeTopping(AddOns.PICKLES);
		anotherBurger.removeTopping(AddOns.BACON);
		/*****************************************************************************/
		
		/** Testing function to change meat temperature *****************************/
		burger.meatTemperature(MeatTemp.RARE);
		anotherBurger.meatTemperature(MeatTemp.WELL_DONE);
		healthyBurger.meatTemperature(MeatTemp.MEDIUM_WELL);
		deluxeBurger.meatTemperature(MeatTemp.MEDIUM_RARE);
		/*****************************************************************************/
		
		/** Print details of each burger *********************************************/
		System.out.println("burger: " + burger.orderBurger());
		System.out.println("another burger: " + anotherBurger.orderBurger());
		System.out.println("healthy burger: " + healthyBurger.orderBurger());
		System.out.println("another burger: " + deluxeBurger.orderBurger());
		/****************************************************************************/
		/** Testing addToppings functions one more time after removing toppings *****/
		burger.addToppings(AddOns.BACON);
		burger.addToppings(AddOns.CHEESE);
		healthyBurger.addToppings(AddOns.SPROUTS);
		healthyBurger.addToppings(AddOns.BACON);
		deluxeBurger.addToppings(AddOns.CHEESE);
		/****************************************************************************/
		
		/** Print details of each burger *********************************************/
		System.out.println("burger: " + burger.orderBurger());
		System.out.println("another burger: " + anotherBurger.orderBurger());
		System.out.println("healthy burger: " + healthyBurger.orderBurger());
		System.out.println("another burger: " + deluxeBurger.orderBurger());
		/*****************************************************************************/
	}
}