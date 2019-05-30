
import java.util.Map;

public class Main {
	/** Stocklist of all items for sale *****************************/
    private static StockList stockList = new StockList();

    public static void main(String[] args){
		
	/** Populate StockList ******************************************/
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
	
        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

	/** Create Basket ***************************************************/
        Basket timsBasket = new Basket("Tim");
		
        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "car", 1);
        System.out.println(timsBasket);

        if(sellItem(timsBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(timsBasket, "spanner", 5);
        System.out.println(timsBasket);

        sellItem(timsBasket, "juice", 4);
        sellItem(timsBasket, "cup", 12);
        sellItem(timsBasket, "bread", 1);
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
		StockItem stockItem = stockList.getOrDefault(item, null);
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
			System.out.println("Sorry, there are not enough items to fill that request. There are " + stockItem.quantityInStock()-stockItem.amountReserved() + " and you requested " + quantity);
		
		return false;
	}
/** Guest can check out and finalize sale *******************************************/	
	public static void checkout(Basket basket){
	// Return map of all items in basket to checkout
		Map<stockItem, Integer> shoppingCart = basket.Items();
	
	// Finalize order for each element in basket
		System.out.println("Final order: ");
		for(Map.Entry<stockItem, Integer> item : shoppingCart.entrySet()){
			System.out.println(item.getKey().getName() + ": " + item.getValue())
			sellItem(item.getKey().getName(), item.getValue());
		}
	// Clear basket		
		basket.checkOut();
	}
}
