
public class ForCash implements Payment{
	private double change;
	private double cashPaid;
	private double subTotal; 
	private double salesTax; 
	private double grandTotal; 
	
	
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
	public double subTotal() {
		// TODO Auto-generated method stub
		return subTotal;
	}

	@Override
	public double salesTax() {
		// TODO Auto-generated method stub
		return salesTax;
	}

	@Override
	public double grandTotal() {
		grandTotal = subTotal * salesTax + subTotal;   
		return grandTotal;
	}

	@Override
	public String getGrandTotalString() {
		// TODO Auto-generated method stub
		return grandTotalString;
	}



}
