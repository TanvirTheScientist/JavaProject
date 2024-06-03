package main;

public class ElectronicDetails implements Process{
	 private int tv;
	 private int pc;
	 private int ac;
	//Variables should be private
	public ElectronicDetails() {}
	public ElectronicDetails(int tv,int pc,int ac)
	{
		this.tv = tv;
		this.pc = pc;
		this.ac = ac;
		
	}
	
	public int getTv() {
		return tv;
	}
	public void setTv(int tv) {
		this.tv = tv;
	}
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getAc() {
		return ac;
	}
	public void setAc(int ac) {
		this.ac = ac;
	}
	public double price()
	{
		double tvPrice = 50000 * tv;
		double pcPrice = 80000 * pc;
		double acPrice = 60000 * ac;
		if(tv>=2) {
			tvPrice *= 0.80;
		}
		return tvPrice + pcPrice + acPrice;
	}
	
	/*Modify this calculation for price for the following condition - If a person buy two tv's then the customer will
	get 20% discount. and the price will be shown after the discount.*/	
}


//Encapsulation:
//Changed the variables tv, pc, and ac to private.
//Added public getter and setter methods for these variables.

//Discount Logic:
//Modified the price method to apply a 20% discount on the total TV price if the number of TVs purchased is 2 or more.