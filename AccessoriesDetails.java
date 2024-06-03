package main;

public class AccessoriesDetails implements Process{
	private int bag;
	private int watch;
	private int belt;
	private String itemDescription;
	
	
	public AccessoriesDetails() 
	{
		this.bag = 0;
		this.watch = 0;
		this.belt = 0;
		this.itemDescription = null;
		
	}

	public AccessoriesDetails(int bag, int watch, int belt, String itemDescription, double discountPrice) 
	{
		this.bag = bag;
		this.watch = watch;
		this.belt = belt;
		this.itemDescription = itemDescription;
		
	}
	
	public int getBag() {
		return bag;
	}

	public void setBag(int bag) {
		this.bag = bag;
	}

	public int getWatch() {
		return watch;
	}

	public void setWatch(int watch) {
		this.watch = watch;
	}

	public int getBelt() {
		return belt;
	}

	public void setBelt(int belt) {
		this.belt = belt;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	
	//Offer for bags
	public String Buy1Get1Free(int item )
	{
		  if (item == bag && bag >= 2) 
	            return "Buy 1 Get 1 Free offer applicable for bags.";
	            else    
	            return "Buy 1 Get 1 Free offer not applicable.";
	        }
	    
	

	public double price()
	
	
	{
		
	       
			// Buy 1 Get 1 Free for bags
	        double totalBagPrice = (bag / 2 + bag % 2) * 2000; 
	       double totalWatchPrice = watch*5000;
	       double totalBeltPrice = belt*5000;
	        double totalPrice = totalBagPrice + totalWatchPrice + totalBeltPrice;


	        return totalPrice;
	    }
		
	}
