package house;

enum BedSize{
	noBed, twin, full, queen, king, CaliforniaKing;
}
public class Bed{
	
	/* Fields ********************************************************************************/
	BedSize bedsize;
	boolean hasHeadboard;
	String colorOfSheets;
	
	/* Constructors **************************************************************************/
	public Bed(BedSize bedsize, boolean hasHeadboard, String colorOfSheets){
		this.bedsize = bedsize;
		this.hasHeadboard = hasHeadboard;
		this.colorOfSheets = colorOfSheets;
	}
	public Bed(){
		this(BedSize.noBed, false, "");
	}
	
	/* Getters *******************************************************************************/
	public BedSize getBedsize(){
		return bedsize;
	}
	public boolean getHasHeadboard(){
		return hasHeadboard;
	}
	public String getColorOfSheets(){
		return colorOfSheets;
	}
	/* Setters *******************************************************************************/
	public void setBedSize(BedSize bedSize){
		this.bedsize = bedSize;
	}
	public void setBedSize(String bedSize){
		this.bedsize = BedSize.valueOf(bedSize);
	}
	public void setHasHeadBoard(boolean hasHeadboard){
		this.hasHeadboard = hasHeadboard;
	}
	public void setColorOfSheets(String color){
		this.colorOfSheets = color;
	}
	/* Methods *********************************************************************/
	public String printInfo(){
		if(hasHeadboard){
			return("The bedsize is: " + getBedsize() + " there is a headboard " + " the color of the sheets is: " + getColorOfSheets() );
		}
		else{
			return("The bedsize is: " + getBedsize() + " there is not a headboard " + " the color of the sheets is: " + getColorOfSheets() );
		}
	}
	
}