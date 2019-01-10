package repo;

public class Motherboard{
	
	/* Fields ******************************************************************************/
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	/* Constructors ************************************************************************/
	public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	public Motherboard(){
		this("", "", 0, 0, "");
	}
	
	/* Getters ******************************************************************************/
	String getModel(){
		return model;
	}
	String getManufacturer(){
		return manufacturer;
	}
	int getRamSlots(){
		return ramSlots;
	}
	int getCardSlots(){
		return cardSlots;
	}
	String getBios(){
		return bios;
	}
	
	/* Methods *******************************************************************************/
	public void loadProgram(String programName){
		System.out.println("Program " + programName + " is now loading...");
	}
	
}