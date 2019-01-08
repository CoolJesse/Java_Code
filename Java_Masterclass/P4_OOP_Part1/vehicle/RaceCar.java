package vehicle;

public class RaceCar extends Car{

	/* Fields *********************************************************************** */
	private boolean hasSpoiler;
	private String sponsor;
	private double engineSize;
	
	/* Constructors *******************************************************************/
	public RaceCar(String color, boolean hasSpoiler, String sponsor, double engineSize){
		
		super("power steering", "manual transmission", 0, 4, color);
		this.hasSpoiler = hasSpoiler;
		this.sponsor = sponsor;
		this.engineSize = engineSize;
	}
	public RaceCar(){
		this("black", true, "Budweiser", 8.0);
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
	
	public String printInfo(){
		return ( super.printInfo() + " has a spoiler: " + getHasSpoiler() + " sponsor: " + getSponsor() + "engine size: " + getEngineSize() );
	}
	
}