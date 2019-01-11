package house;

public class Floor{
	
	/* Fields ********************************************************************************/
	private int width;
	private int length;
	
	private boolean hasCarpet;
	
	/* Constructors **************************************************************************/
	public Floor(int width, int length, boolean hasCarpet){
		this.width = width;
		this.length = length;
		this.hasCarpet = hasCarpet;
	}
	public Floor(){
		this(0, 0, false);
	}
	
	/* Getters *******************************************************************************/
	public int getWidth(){
		return width;
	}
	public int getLength(){
		return length;
	}
	public boolean getHasCarpet(){
		return hasCarpet;
	}
	/* Setters *******************************************************************************/
	
	/* Methods *******************************************************************************/
	public String printInfo(){
		if(hasCarpet){
			return("The floor width is: " + getWidth() + " the length is: " + getLength() + "the floor has carpet." );
		}
		else{
			return("The floor width is: " + getWidth() + " the length is " + getLength() + " the floor doesn't have carpet." );
		}
	}
}