
public class ForCash implements Payment{
	private double change;
	private double cashPaid;
	private double subTotal; 
	private double salesTax; 
	private double grandTotal; 
	private String grandTotalString;
	
	public ForCash(double price, double cashPaid){
		
		this.cashPaid = cashPaid;
		this.change = (cashPaid - price);
		}
	
	public double getChange() {
		return change;
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

}