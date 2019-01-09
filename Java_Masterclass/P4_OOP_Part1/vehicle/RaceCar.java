package vehicle;

public class RaceCar extends Car{

	/* Fields *********************************************************************** */
	private boolean hasSpoiler;
	private String sponsor;
	private double engineSize;
	
	/* Constructors *******************************************************************/
	public RaceCar(String name, String sponsor, double engineSize){
		
		super(name, "medium size", 4, 0, 4, true);
		this.hasSpoiler = true;
		this.sponsor = sponsor;
		this.engineSize = engineSize;
	}
	public RaceCar(){
		this("no name", "no sponsor", 8.0);
	}
	
	/* Getters ************************************************************************/
	public boolean getHasSpoiler(){
		return hasSpoiler;
	}
	public String getSponsor(){
		return sponsor;
	}
	public double getEngineSize(){
		return engineSize;
	}
	
	/* Setters ************************************************************************/
	public void setHasSpoiler(boolean hasSpoiler){
		this.hasSpoiler = hasSpoiler;
	}
	public void setSponsor(String sponsor){
		this.sponsor = sponsor;
	}
	public void setEngineSize(double engineSize){
		this.engineSize = engineSize;
	}
	
	/* Methods *************************************************************************/
	public void accelerate(int rate){
		int newVelocity = getVelocity() + rate;
		
		if(newVelocity == 0){
			stop();
			setCurrentGear(1);
		}
		else if(newVelocity > 0 && newVelocity <= 10)
			setCurrentGear(1);
		else if(newVelocity > 10 && newVelocity <= 20)
			setCurrentGear(2);
		else if(newVelocity > 20 && newVelocity <= 30)
			setCurrentGear(3);
		else 
			setCurrentGear(4);
		
		if(newVelocity > 0)
			changeVelocity(newVelocity, getDirection());
	}
	
	public String printInfo(){
		return ( super.printInfo() + " has a spoiler: " + this.hasSpoiler + " sponsor: " + this.sponsor + "engine size: " + this.engineSize );
	}
	
}