package house;

enum TypeOfRoom{
	bedroom, livingroom, kitchen, bathroom, other;
}
public class Room{
	
	/* Fields ************************************************************************/
	private TypeOfRoom typeOfRoom;
	
	private Floor floor;
	private Bed bed;
	private Couch couch;
	
	private int squareFeet;
	private int numberOfWindows;
	
	/* Constructors ******************************************************************/
	public Room(TypeOfRoom typeOfRoom, Floor floor, Bed bed, Couch couch, int squareFeet, int numberOfWindows){
		this.typeOfRoom = typeOfRoom;
		this.floor = floor;
		this.bed = bed;
		this.couch = couch;
		this.squareFeet = squareFeet;
		this.numberOfWindows = numberOfWindows;
	}
	public Room(String typeOfRoom, Floor floor, Bed bed, Couch couch, int squareFeet, int numberOfWindows){
		this.typeOfRoom = TypeOfRoom.valueOf(typeOfRoom);
		this.floor = floor;
		this.bed = bed;
		this.couch = couch;
		this.squareFeet = squareFeet;
		this.numberOfWindows = numberOfWindows;
	}
	public Room(){
		this(TypeOfRoom.other, new Floor(), new Bed(), new Couch(), 0, 0);
		//typeOfRoom = TypeOfRoom.other;
	}
	
	/* Getters ***********************************************************************/
	public TypeOfRoom getTypeOfRoom(){
		return typeOfRoom;
	}
	public Floor getFloor(){
		return floor;
	}
	public Bed getBed(){
		return bed;
	}
	public Couch getCouch(){
		return couch;
	}
	public int getSquareFeet(){
		return squareFeet;
	}
	public int getNumberOfWindows(){
		return numberOfWindows;
	}
	
	/* Setters ***********************************************************************/
	public void setTypeOfRoom(TypeOfRoom typeOfRoom){
		this.typeOfRoom = typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom){
		this.typeOfRoom = TypeOfRoom.valueOf(typeOfRoom);
	}
	public void setFloor(Floor floor){
		this.floor = floor;
	}
	public void setBed(Bed bed){
		this.bed = bed;
	}
	public void setCouch(Couch couch){
		this.couch = couch;
	}
	public void setSquareFeet(int squareFeet){
		this.squareFeet = squareFeet;
	}
	public void setNumberOfWindows(int numberOfWindows){
		this.numberOfWindows = numberOfWindows;
	}
	
	/* Methods ***********************************************************************/
	public void isBedroom(String bedSize, boolean hasHeadBoard, String colorOfSheets ){
		typeOfRoom = TypeOfRoom.valueOf("bedroom");
		
		bed.setBedSize(bedSize);
		bed.setHasHeadBoard(hasHeadBoard);
		bed.setColorOfSheets(colorOfSheets);
	}
	public void isLivingroom(int couchLength, int couchWidth, boolean isFuton, String couchColor, String couchMaterial, boolean machineWashable){
		typeOfRoom = TypeOfRoom.valueOf("livingroom");
		
		couch.setLength(couchLength);
		couch.setWidth(couchWidth);
		couch.setIsFuton(isFuton);
		
		couch.setFabric(couchColor, couchMaterial, machineWashable);
	}
	
	public String printInfo(){
		if( typeOfRoom == TypeOfRoom.valueOf("bedroom") ){
			return ("Room is a bedroom, " + bed.printInfo() + " " + floor.printInfo() + " the square footage of the room is: " + squareFeet + " the number of windows are: " + numberOfWindows);
		}
		else if( typeOfRoom == TypeOfRoom.valueOf("livingroom") ){
			return ("Room is a livingroom, " + couch.printInfo() + " " + floor.printInfo() + " the square footage of the room is: " + squareFeet + " the number of windows are: " + numberOfWindows);			
		}
		else{
			return("Undefined type of room!");
		}
 
	}
}