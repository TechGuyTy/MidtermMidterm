
public class ForCredit implements Payment{
	//get the credit card number, expiration, and CVV 
	private double cardNumber; 
	private String expiration; 
	private int CVV; 
	private double subTotal; 
	private double salesTax; 
	private double grandTotal; 
	private String grandTotalString;
	
	public double getCardNumber() {
		return cardNumber;
	}


	public String getExpiration() {
		return expiration;
	}
	
	public int getCVV() {
		return CVV;
	}


	public void setCardNumber(double cardNumber) {
		this.cardNumber = cardNumber;
	}


	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	
	public void setCVV(int CVV) {
		this.CVV = CVV;
	}


	@Override
	public double getSubTotal() {
		return subTotal; 
	}


	@Override
	public double getSalesTax() {
		// TODO Auto-generated method stub
		return salesTax;
	}


	@Override
	public double getGrandTotal() {
		grandTotal = subTotal * salesTax + subTotal;   
		return grandTotal;
	}


	@Override
	public String getGrandTotalString() {
		grandTotalString = grandTotal + " ";
		return grandTotalString;
	}
	
}
