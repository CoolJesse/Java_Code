import java.util.Scanner;

public class Printer{
	/* Fields ********************************************************************/
	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;
	private Scanner myScanner;
	
	/* Constructors **************************************************************/
	public Printer(int tonerLevel, boolean isDuplex){
		if(tonerLevel > -1){
			this.tonerLevel = tonerLevel;
		}
		else{
			this.tonerLevel = -1;
		}
		
		this.pagesPrinted = 0;
		this. isDuplex = isDuplex;
		this.myScanner = new Scanner(System.in);	
	}
	public Printer(){
		this(0, false);
	}
	
	/* Getters *******************************************************************/
	public int getTonerLevel(){
		return tonerLevel;
	}
	public int getPagesPrinted(){
		return pagesPrinted;
	}
	public boolean getIsDuplex(){
		return isDuplex;
	}
	
	/* Setters *******************************************************************/
	public void setTonerLevel(int tonerLevel){
		if(tonerLevel > -1  && tonerLevel <= 100 )
			this.tonerLevel = tonerLevel;
		else
			this.tonerLevel = -1;	
	}
	public void setPagesPrinted(int pagesPrinted){
		if(pagesPrinted >= 0)
			this.pagesPrinted = pagesPrinted;
		else
			this.pagesPrinted = 0;
	}
	public void setIsDuplex(boolean isDuplex){
		this.isDuplex = isDuplex;
	}
	
	/* Methods *******************************************************************/
	public int  fillToner(int fillAmount){
		
		if(fillAmount < 0){ //try to add negative amount of toner
			System.out.println("Sorry, you cannot add a negative amount of toner to the printer.");
			return -1;
		}
		
		if(tonerLevel == 100){ //toner already full
			System.out.println("Toner already full.");
			return 0;
		}
		
		else{ //adding toner amount between 0 and 100
			tonerLevel += fillAmount;
		
			if(tonerLevel >= 100){
				tonerLevel = 100;
				System.out.println("Toner full.");
			}
			return 0;
		}
	}
	/* For the sake of simplicity I have assumed that each page requires 1% of the toner to print. *************************************************************/
	public int printPages(int pages){
		if(pages < 1){
			System.out.println("No pages printed.");
			return -1;
		}
		
		else if( (tonerLevel - pages) >= 0){
			char answer = 'n';
			if(isDuplex){
				System.out.println("Would you like to print double sided: y/n ");
				answer = myScanner.next().charAt(0);
			}
			if(answer == 'y'){
				System.out.println("Printing double sided.");
				pagesPrinted += ( (pages/2) + (pages%2) ); //since printing on both sides
				tonerLevel -= pages;
				System.out.println("Printing " + pages + " pages on " + (pages/2) + " sheets of paper.");
				return ( (pages/2) + (pages%2) );
			}
			else{
				System.out.println("Printing single sided.");
				pagesPrinted += pages;
				tonerLevel -= pages;
				System.out.println("Printing " + pages + " pages on " + pages + " sheets of paper.");
				return pages;
			}
		}
		else{
			System.out.println("Toner low, please refill and try again.");
			return -1;
		}

	}
}