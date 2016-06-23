import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AllPayments implements Payment {
	
	
	private double cashPaid;
	private double subTotal; 
	private double salesTax = 1.06; 
	private double grandTotal; 
	private static double check;
	private static double cardNumber; 
	private String name; 
	private String category; 
	private String description; 
	private double price; 
	private static double tax = 0.06;
	private double change;
	double finalFinalTotal = 0;
	Scanner scan = new Scanner(System.in);

	@Override
	public  void getCash(double subTotal, Scanner scan) {
		setSubTotal(subTotal);
		double getGrandTotal = subTotal * salesTax;
		boolean rightAmount = true; 
		do
		{
			System.out.println("Enter cash value");
			double cash = scan.nextDouble();
			setCashPaid(cash);
			if (getCashPaid() < getGrandTotal) {
				System.out.println("This does not equal the total. Please check the total and input the" + "right amount.");
				rightAmount = false;
			} else {
				setChange(cash - getGrandTotal);
				System.out.println("Here is your change" + RoundTo2Decimals(getChange()));
				rightAmount = true;
			}
		}while (rightAmount == false);
		
	}
	
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
	
	public double getCardNumber(Scanner sc, String prompt) {
		System.out.println(prompt);
		String ccNumber = sc.next();
		
		System.out.println("The card number you entered is " + ccNumber);
		System.out.println("Please enter date of expiration (mm/dd/yyyy) ");
		String expirationDate = sc.next();
		
		System.out.println("The date of expiration of your card is " + expirationDate);
		System.out.println("Please enter your CVV ");
		int CVVnumber = sc.nextInt();
		
		System.out.println("Your CVV is " + CVVnumber);
		
		System.out.println("And here is your receipt");
		return cardNumber;
	}
	
	public double RoundTo2Decimals(double val) {
        DecimalFormat df2 = new DecimalFormat("###.##");
    return Double.valueOf(df2.format(val));
	}
	
	@Override
	public double getTax() {
		tax = tax + 1;
		return tax;
	}

	@Override
	public void receipt(ArrayList objects) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double setSubTotal(double subTotal) {
		return 0;
		
	}

	@Override
	public double getChange() {
		return change;
	}

	@Override
	public double getCashPaid() {
		return cashPaid;
	}

	@Override
	public void setChange(double change) {
		this.change = change;
		
	}

	@Override
	public void setCashPaid(double cashPaid) {
		this.cashPaid = cashPaid;
		
	}

	@Override
	public double getGrandTotal() {
		return grandTotal = subTotal * salesTax + subTotal;
	}

	@Override
	public double getCheck() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double setCheck(double check) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCheck(double total) {
		// TODO Auto-generated method stub
		return 0;
	}


}
