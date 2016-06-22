import java.util.Scanner;

public class ForCheck implements Payment{
	//get the check number 
	private static double check; 
	private double subTotal; 
	private double salesTax; 
	private double grandTotal; 
	private String grandTotalString;
	
	public void getCheck(double subTotal, Scanner scan){
		setSubTotal(grandTotal);
		
		boolean rightAmount = true;
		do
		{
			System.out.println("Enter check number");
			double checkAmount = scan.nextDouble();
			setCheck(checkAmount);
			if (getCheck() < getGrandTotal()) {
				System.out.println("This does not equal the total. Please check the total and input the" + "right amount.");
				rightAmount = false;
			} else {
				System.out.println("Thank you for your purchase ");
				rightAmount = true;
			}
		}while (rightAmount == false);
	}
	
	public void setCheck(double check){
		this.check = check;
	}
	
	public double getCheck(){
		return check;
	}

	@Override
	public double getSubTotal() {
		return subTotal;
	}

	@Override
	public double getSalesTax() {
		salesTax = 0.06;
		return salesTax; 
	}
	

	
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


	public void setSubTotal(double subTotal) {
			this.subTotal = subTotal;
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

	/*@Override
	public void getCash(double subTotal, Scanner sc) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public double setSubTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCardNumber(Scanner sc, String prompt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getCash(double subTotal, Scanner sc) {
		// TODO Auto-generated method stub
		
	}


}
//Ff