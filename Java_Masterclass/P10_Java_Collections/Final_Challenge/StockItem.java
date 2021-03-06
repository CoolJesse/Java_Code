
public class StockItem implements Comparable<StockItem> {

/************************************** Fields **************************************/
	private final String name;
	private double price;
	private int quantityStock;
	private int reserved;
/*********************************** Constructors ***********************************/
	public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
		this.reserved = 0;
    }
    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
		this.reserved = 0;
    }
    public StockItem(String name, double price, int quantityStock, int reserved) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
		this.reserved = reserved;
    }
/************************************** Getters *************************************/
	public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int quantityInStock() {
        return quantityStock;
    }
	public int amountReserved(){
		return reserved;
	}
/*************************************** Methods *************************************/
/** Adjust price of item *************************************************************/
	public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }
/** Adjust the quantity of the item in stock *****************************************/
	public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }
/** Request the specified amount of the item be reserved for an order ****************/
	public boolean reserveItem(int reserved){
		if(reserved > 0){
			if( (this.reserved + reserved) <= this.quantityStock){
				this.reserved += reserved;
				return true;
			}
		}
		return false;
	}
/** Release the specified amount of requested items **********************************/
	public boolean unreserveItem(int unreserve){
		if(unreserve <= this.reserved){
			this.reserved -= unreserve;
			return true;
		}
		return false;
	}
/******************************** Overriden Functions *******************************/
    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        //System.out.println("Entering StockItem.compareTo");
        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
