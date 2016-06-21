import java.util.Scanner;

public class ForCheck implements Payment{
	//get the check number 
	private static int check; 
	private double subTotal; 
	private double salesTax; 
	private double grandTotal; 
	private String grandTotalString;
	
	public static int getCheck(Scanner sc, String prompt){
		System.out.println(prompt);
		int checkNumber = sc.nextInt();
		System.out.println("Here is your receipt");
		return check; 
	}
	
	public void setCheck(int check){
		this.check = check;
	}

	@Override
	public double getSubTotal() {
		return subTotal;
	}

	@Override
	public double getSalesTax() {
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
//Ff