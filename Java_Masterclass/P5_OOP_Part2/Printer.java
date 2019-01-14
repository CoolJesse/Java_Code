import java.util.Scanner;

public class Printer{
	/* Fields ********************************************************************/
	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;
	private Scanner myScanner;
	
	/* Constructors **************************************************************/
	public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex){
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this. isDuplex = isDuplex;
		this.myScanner = new Scanner(System.in);
	}
	public Printer(){
		this(0, 0, false);
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
		this.tonerLevel = tonerLevel;
	}
	public void setPagesPrinted(int pagesPrinted){
		this.pagesPrinted = pagesPrinted;
	}
	public void setIsDuplex(boolean isDuplex){
		this.isDuplex = isDuplex;
	}
	
	/* Methods *******************************************************************/
	public void fillToner(int fillAmount){
		
		if(fillAmount < 0){
			System.out.println("Sorry, you cannot add a negative amount of toner to the printer.");
			return;
		}
		
		if(tonerLevel == 100){
			System.out.println("Toner already full.");
			return;
		}
		
		tonerLevel += fillAmount;
		
		if(tonerLevel >= 100){
			tonerLevel = 100;
			System.out.println("Toner full.");
		}
	}
	public void printPage(){
		if(tonerLevel > 0){
			char answer = 'n';
			if(isDuplex){
				System.out.println("Would you like to print double sided: y/n ");
				answer = myScanner.next().charAt(0);
			}
			if(answer == 'y'){
				System.out.println("Printing double sided.");
				pagesPrinted++;
				tonerLevel--;
				System.out.println("Printing page " + pagesPrinted);
			}
			else{
				System.out.println("Printing single sided.");
				pagesPrinted++;
				tonerLevel--;
				System.out.println("Printing pages " + pagesPrinted);
			}
		}
		else
			System.out.println("Toner out, please refill and try again.");

	}
}