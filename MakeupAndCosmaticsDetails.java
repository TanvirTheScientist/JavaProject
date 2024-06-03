package main;

public class MakeupAndCosmaticsDetails implements Process{
	private int lipstick;
	private int mascara;
	private int kajal;
	
	public MakeupAndCosmaticsDetails() {
		this.lipstick = 0;
	    this.mascara = 0;
		this.kajal = 0;
	}
	
	public MakeupAndCosmaticsDetails(int lipstick, int maskara, int kajal) {
		this.lipstick = lipstick;
		this.mascara = maskara;
		this.kajal = kajal;
	}
	public int getLipstick() {
		return lipstick;
	}
	public void setLipstick(int lipstick) {
		this.lipstick = lipstick;
	}
	public int getMascara() {
		return mascara;
	}
	public void setMascara(int maskara) {
		this.mascara = maskara;
	}
	public int getKajal() {
		return kajal;
	}
	public void setKajal(int kajal) {
		this.kajal = kajal;
	}

    public double comboOffer()
    {
    	  double discount = 0.0;
          if (mascara > 0 && kajal > 0) {
              discount = 10.0;
          }
          return discount;
      }
	
	public double price() {
		
		   double lipstickPrice = 300.0; 
	        double mascaraPrice = 250.0; 
	        double kajalPrice = 150.0; 

	        double totalLipstickPrice = lipstick * lipstickPrice;
	        double totalMascaraPrice = mascara * mascaraPrice;
	        double totalKajalPrice = kajal * kajalPrice;

	        double totalPrice = totalLipstickPrice + totalMascaraPrice + totalKajalPrice;

	        // Apply combo offer discount
	        double discount = comboOffer();
	        totalPrice = totalPrice-discount;

	        return totalPrice;
		
	}
}
