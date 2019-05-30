
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
/************************************** Field ****************************************/
    private final Map<String, StockItem> list;
/*********************************** Constructor *************************************/
    public StockList() {
        this.list = new LinkedHashMap<>();
    }
/************************************ Getter ****************************************/
    public StockItem get(String key) {
        return list.get(key);
    }
/************************************ Methods ****************************************/
/** Add item to list of what is in stock *********************************************/
    public int addStock(StockItem item) {
        if(item != null) {
            // Check if already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            // If there are already stocks on this item, adjust the quantity
            if(inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }
			// Add item with adjusted quantity to list of items
            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }
/** Remove specified amount of items from stock *************************************/
    public int sellStock(String item, int quantity){
	
		if(quantity < 0){
			System.out.println("Cannot sell negative items.");
			return 0;
		}
		
        StockItem inStock = list.get(item);
		
        if(inStock != null){
			if(inStock.quantityInStock() >= quantity){
				inStock.adjustStock(-quantity);
				return inStock.quantityInStock();				
			}
			else{
				System.out.println("Cannot sell that many items. Not enough in stock.");
				return inStock.quantityInStock();
			}
        }
        return 0;
    }
/** Reserve items for sale when user checks out *************************************/
	public boolean reserveStock(String item, int quantity){
	// Test for negative quantities or zero
		if(quantity <= 0){
			System.out.println("Sorry, you cannot reserve " + quantity + " " + item + "s.");
			return false;
		}
		
		StockItem inStock = list.get(item);
	// Test if item is not found and thus not offered	
		if(inStock == null){
			System.out.println("Sorry, " + item + " is not offered by this seller.");
			return false;
		}
	// Test if quantity requested exceeds available amount
		else if(inStock.reserveItem(quantity) == false){
			System.out.println("Sorry, there are not enough " + item + "s.");			
			return false;
		}
		return true;
	}
/** Unreserve items when user makes mistake or changes mind *************************/
	public boolean unreserveStock(String item, int quantity){
	// Test for negative quantity or zero	
		if(quantity <= 0){
			System.out.println("Sorry, you cannot unreserve " + quantity + " " + item + "s.");
			return false;
		}
		
		StockItem inStock = list.getOrDefault(item, null);
	// Test if item is not found and thus cannot be unreserved
		if(inStock == null){
			System.out.println("Sorry, " + item + " is not offered by this seller.");
			return false;
		}
	// Test if attempting to unreserve more items than are reserved
		else if(inStock.unreserveItem(quantity) == false){
			System.out.println("Sorry, you cannot unreserve more " + item + "s than are reserved.");			
			return false;
		}
	// If successfully unreserved specified amount of items
		return true;
	}	
/** Return list of item names with their prices **************************************/
	public Map<String, Double> PriceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }
/** Return list of all items *********************************************************/
	public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }
/******************************** Overriden Methods **********************************/
    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0.0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + String.format("%.2f",totalCost);
    }
}
