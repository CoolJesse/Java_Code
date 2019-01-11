package house;

public class Fabric{
	
	/* Fields ************************************************************************/
	private String color;
	private String material;
	private boolean machineWashable;
	
	/* Constructors *****************************************************************/
	public Fabric(String color, String material, boolean machineWashable){
		this.color = color;
		this. material = material;
		this.machineWashable = machineWashable;
	}
	public Fabric(){
		this("N/A", "N/A", true);
	}
	
	/* Getters *******************************************************************************/
	public String getColor(){
		return color;
	}
	public String getMaterial(){
		return material;
	}
	public boolean getMachineWashable(){
		return machineWashable;
	}
	
	/* Setters *******************************************************************************/
	public void setColor(String color){
		this.color = color;
	}
	public void setMaterial(String material){
		this.material = material;
	}
	public void setMachineWashable(boolean machineWashable)
	{
		this.machineWashable = machineWashable;
	}
	/* Methods ********************************************************************/
	public String printInfo(){
		if(machineWashable){
			return("The fabric color is: " + getColor() + " the material is: " + getMaterial() + " the fabric is machine washable");
		}
		else{
			return("The fabric color is: " + getColor() + " the material is: " + getMaterial() + " the fabric is NOT machine washable");
		}
	}
}