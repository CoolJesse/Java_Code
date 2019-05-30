
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
/************************************** Fields ***************************************/
    private final String name;
    private final Map<StockItem, Integer> list;
	private int totalItems;
/*********************************** Constructor *************************************/
    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
		this.totalItems = 0;
    }
/************************************* Getter ****************************************/
	public int getTotalItems(){
		return totalItems;
	}
/************************************* Methods ***************************************/
/** Add item(s) to basket ************************************************************/
	public int addToBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
		//return the number of the ite alread in basket
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, (inBasket + quantity) );
			totalItems += quantity;
            return inBasket;
        }
        return 0;
    }
/** Remove item(s) from basket *******************************************************/
	public boolean removeFromBasket(StockItem item, int quantity) {
        if ((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
		// If item to remove is found in basket
			if(inBasket != 0){
			// Remove specified amount of item from basket
				if(quantity == inBasket){
					list.remove(item);
					totalItems -= quantity;					
					return true;
				}
			// Remove specified amount of reserved items
				else if(quantity <= inBasket){
					list.put(item, (inBasket-quantity) );
					totalItems -= quantity;					
					return true;
				}
			// Attempting to remove more items than are in basket
				else{
					System.out.println("Sorry, you cannot remove more items than are present in basket.");
					return false;
				}
			}
        }
		System.out.println("Error: " + item.getName() + " is not located in basket.");
        return false;
    }	
/** Return Map of items in basket ****************************************************/
	public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }
/** Checkout all items in basket *****************************************************/
	public void checkOut(){
		System.out.println("Checked out!");
		list.clear();
		totalItems = 0;
	}
/********************************* Overriden Methods *********************************/
    @Override
    public String toString() {
        /*String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";*/
		
        String s = "\nShopping basket " + name + " contains " + totalItems + ((totalItems == 1) ? " item" : " items") + "\n";
		
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
