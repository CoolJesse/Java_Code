
import java.util.Map;

public class Main {
	/** Stocklist of all items for sale *****************************/
    private static StockList stockList = new StockList();

    public static void main(String[] args){	
	/** Populate StockList "inventory" ******************************************/
	    StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
		
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);
	/********************************************************************/
	/** Print all items in inventory ************************************/
        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }
	/** Create Basket ***************************************************/
        Basket timsBasket = new Basket("Tim");
		
        addToBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);

        addToBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);
		
        if(addToBasket(timsBasket, "car", 1) == false) {
            System.out.println("Error");
        }

        addToBasket(timsBasket, "spanner", 5);
        System.out.println(timsBasket);
	
        addToBasket(timsBasket, "juice", 4);
        addToBasket(timsBasket, "cup", 12);
        addToBasket(timsBasket, "bread", 1);
		
		//print contents of basket
        System.out.println(timsBasket);
		
		//remove items from basket
		removeFromBasket(timsBasket, "juice", 2);		
		removeFromBasket(timsBasket, "cup", 13);		
		removeFromBasket(timsBasket, "bread", 1);
		
		//print contents of basket
        System.out.println(timsBasket);		
		
		//checkout
		checkout(timsBasket);
		System.out.println(timsBasket);

        System.out.println(stockList);

        //temp = new StockItem("pen", 1.12);
        //stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);
		
        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }


    }
/************************************* Methods ***************************************/
/** Final sale of item, remove from inventory and adjust number of reserved items **/
    public static int sellItem(String item, int quantity){
        // Retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
		
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            return quantity;
        }
        return 0;
    }
/** Add specified item to basket *****************************************************/
	public static boolean addToBasket(Basket basket, String item, int quantity){
	// Check for item in inventory
		//StockItem stockItem = stockList.getOrDefault(item, null);
		StockItem stockItem = stockList.get(item);
	// If item was not found in inventory
		if(stockItem == null){
			System.out.println("Sorry, " + item + " is not offered by this seller.");
			return false;
		}
	// Make sure there are enough items to fill request
		if(stockItem.reserveItem(quantity)){
		// If there are add item(s) to basket
  			basket.addToBasket(stockItem,quantity);
			return true;
		}
	// If there are not enough items to fill request
		else
			System.out.println("Sorry, there are not enough items to fill that request. There are " + (stockItem.quantityInStock()-stockItem.amountReserved()) + " and you requested " + quantity);
		
		return false;
	}
/** Remove specified item from basket ***********************************************/
	public static boolean removeFromBasket(Basket basket, String item, int quantity){
		return basket.removeFromBasket(new StockItem(item, 0), quantity);
	}
/** Guest can check out and finalize sale *******************************************/	
	public static void checkout(Basket basket){
	// Return map of all items in basket to checkout
		Map<StockItem, Integer> shoppingCart = basket.Items();
	
	// Finalize order for each element in basket
		System.out.println("\nChecking out, final order: ");
		for(Map.Entry<StockItem, Integer> item : shoppingCart.entrySet()){
			System.out.println(item.getKey().getName() + ": " + item.getValue());
			sellItem(item.getKey().getName(), item.getValue());
		}
	// Clear basket		
		basket.checkOut();
	}
}
