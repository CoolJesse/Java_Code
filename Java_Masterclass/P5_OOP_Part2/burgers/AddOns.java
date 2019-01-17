package burgers;

public enum AddOns{
	NONE(0.0, 0), LETTUCE(.25, 0), TOMATO(.25, 0), ONION(.25, 0), PICKLES(.5, 0), CHEESE(1.0, 0), BACON(2.0, 0), AVACADO(2.0, 1), SPROUTS(2.0, 1);
	
	private final double price;
	private final int available;
	
	AddOns(double price, int available){
		this.price = price;
		this.available = available;
	}
	
	double getPrice(){
		return price;
	}
	int getAvailable(){
		return available;
	}
}