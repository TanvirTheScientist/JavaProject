package main;

public class FoodDetails implements Process{
	private int burger;
	private int pizza;
	private int shake; 
	private String foodDescription;
	private double discountPrice;
//All the variables should be private, also add two more variables for a string and a double type data
	
	public FoodDetails() 
	{
		this.burger = 0;
		this.pizza = 0;
		this.shake = 0;
		this.foodDescription =null;
		this.discountPrice = 0.0;
		
	}
	public FoodDetails(int burger,int pizza,int shake,String foodDescription,double  discountPrice)
	{
		this.burger = burger;
		this.pizza = pizza;
		this.shake = shake;
		this.foodDescription = foodDescription;
		this.discountPrice = discountPrice;
	}
	
	
	public int getBurger() {
		return burger;
	}
	public void setBurger(int burger) {
		this.burger = burger;
	}
	public int getPizza() {
		return pizza;
	}
	public void setPizza(int pizza) {
		this.pizza = pizza;
	}
	public int getShake() {
		return shake;
	}
	public void setShake(int shake) {
		this.shake = shake;
	}
	public String getFoodDescription() {
		return foodDescription;
	}
	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	
	public double price()
	{
		double totalPrice = (200*burger)+ (1350*pizza) + (150*shake);
		return totalPrice-(totalPrice*(discountPrice/100));
	}
	
	
	
}
