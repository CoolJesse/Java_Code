package repo;

public class PC{
	
	/* Fields ********************************************************************************/
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;
	
	/* Constructor **************************************************************************/
	public PC(Case theCase, Monitor monitor, Motherboard motherboard){
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}
	/* Getters ******************************************************************************/
	public Case getTheCase(){
		return theCase;
	}
	public Monitor getMonitor(){
		return monitor;
	}
	public Motherboard getMotherboard(){
		return motherboard;
	}
	
	/* Methods ******************************************************************************/
	public void powerUp(){
		//getTheCase().pressPowerButton();
		theCase.pressPowerButton();//access variable directly
		drawLogo();
	}
	private void drawLogo(){
		//fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
	
}