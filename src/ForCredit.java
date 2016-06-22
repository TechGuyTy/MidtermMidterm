import java.util.Scanner;

public class ForCredit implements Payment{
	//get the credit card number, expiration, and CVV 
	private static double cardNumber; 
	private String expiration; 
	private int CVV; 
	private double subTotal; 
	private double salesTax; 
	private double grandTotal; 
	private String grandTotalString;
	
	public static double getCardNumber(Scanner sc, String prompt) {
		System.out.println(prompt);
		int ccNumber = sc.nextInt();
		System.out.println("The card number you entered is " + ccNumber);
		System.out.println("And here is your receipt");
		return cardNumber;
	}


	public String getExpiration() {
		return expiration;
	}
	
	public int getCVV() {
		return CVV;
	}


	public void setCardNumber(double cardNumber) {
		ForCredit.cardNumber = cardNumber;
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


	@Override
	public double setCashPaid() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double setSubTotal() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getCashPaid() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double getChange() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void getCash(double subTotal, Scanner sc) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getCheck(double subTotal, Scanner sc) {
		// TODO Auto-generated method stub
		
	}
	
}
