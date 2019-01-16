/* Project 32 from Java Master Class, OOP Part 2: Encapsulation challenge */

/* Challenge ***************************************************************************
1. Create a class and demonstrate proper encapsulation techniques. The class will be called "Printer." It will simulate a real computer printer.
2. Printer class should have fields for; toner level, number of pages printed, and also 
whether its a duplex printer (capable of printing on both sides)
3. Add methods to fill up the toner to a maximum of 100%, another method to simulate printing a page (which should increase the number of pages printed)
4. Decide on the scope, whether to use constructors, and anything else you think is needed.

*/

public class project_32{
	public static void main(String[] args){
		
		Printer myPrinter = new Printer(100, false);
		
		
		System.out.println("Total number of pages printed: " + myPrinter.getPagesPrinted());
		
		myPrinter.printPages(1);
		myPrinter.printPages(2);
		myPrinter.printPages(3);
		
		System.out.println("Total number of pages printed: " + myPrinter.getPagesPrinted());

		myPrinter.setIsDuplex(true);
		
		myPrinter.printPages(-4);
		myPrinter.printPages(0);
		myPrinter.printPages(1000);
		
		myPrinter.setIsDuplex(true);
		
		myPrinter.printPages(100);
		myPrinter.printPages(2);
		myPrinter.printPages(9);
		
		myPrinter.fillToner(2);
		myPrinter.fillToner(-1);
		myPrinter.fillToner(50);
		
		myPrinter.printPages(100);
		
		System.out.println("Total number of pages printed: " + myPrinter.getPagesPrinted());

	}
}