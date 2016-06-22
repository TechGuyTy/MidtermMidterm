import java.util.Scanner;

public class ForCash implements Payment{
	private double change;
	private double cashPaid;
	private double subTotal; 
	private double salesTax =0.06; 
	private double grandTotal; 
	private String grandTotalString;
	Scanner scan = new Scanner(System.in);
	
	public ForCash(){

		}
	@Override
	public  void getCash(double subTotal, Scanner scan) {
		setSubTotal(subTotal);
		getGrandTotal();
		boolean rightAmount = true; 
		do
		{
			System.out.println("Enter cash value");
			double cash = scan.nextDouble();
			setCashPaid(cash);
			if (getCashPaid() < getGrandTotal()) {
				System.out.println("This does not equal the total. Please check the total and input the" + "right amount.");
				rightAmount = false;
			} else {
				setChange(change);
				System.out.println("Here is your change" + getChange());
				rightAmount = true;
			}
		}while (rightAmount == false);
		
	}
	
	private void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
		
	}

	public double getChange() {
		return change = cashPaid - subTotal;
	}


	public double getCashPaid() {
		return cashPaid;
	}


	public void setChange(double change) {
		this.change = change;
	}


	public void setCashPaid(double cashPaid) {
		this.cashPaid = cashPaid;
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
	public String getGrandTotalString() {
		grandTotalString = grandTotal + " ";
		return grandTotalString;
	}

	@Override
	public double getGrandTotal() {
		grandTotal = subTotal * salesTax + subTotal;
		return grandTotal;
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
	public void getCheck(double subTotal, Scanner sc) {
		// TODO Auto-generated method stub
		
	}



}