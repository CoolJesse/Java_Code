package house;

public class Couch{
	
	/* Fields ********************************************************************************/
	private int length;
	private int width;
	private boolean isFuton;
	
	private Fabric fabric;
	
	/* Constructors **************************************************************************/
	public Couch(int length, int width, boolean isFuton, Fabric fabric){
		this.length = length;
		this.width = width;
		this.isFuton = isFuton;
		this.fabric = fabric;
	}
	public Couch(){
		this(0, 0, false, new Fabric() );
	}
	
	/* Getters *********************************************************************/
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	public boolean getIsFuton(){
		return isFuton;
	}
	public Fabric getFabric(){
		return fabric;
	}
	
	/* Setters **********************************************************************/
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public void setIsFuton(boolean isFuton){
		this.isFuton = isFuton;
	}
	public void setFabric(String color, String material, boolean machineWashable){
		fabric.setColor(color);
		fabric.setMaterial(material);
		fabric.setMachineWashable(machineWashable);
	}

	/* Methods *******************************************************************************/
	public String printInfo(){
		if(isFuton){
			return("The length of the couch is: " + getLength() + " the width of the couch is: " + getWidth() + " the couch is a futon " + fabric.printInfo());
		}
		else{
			return("The length of the couch is: " + getLength() + " the width of the couch is: " + getWidth() + " the couch is a not a futon " + fabric.printInfo());
		}	
	}
}