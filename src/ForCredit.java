
public class ForCredit implements Payment{
	//get the credit card number, expiration, and CVV 
	private double cardNumber; 
	private String expiration; 
	private int CVV; 
	
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
	public double subTotal() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double salesTax() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double grandTotal() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getGrandTotal() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
