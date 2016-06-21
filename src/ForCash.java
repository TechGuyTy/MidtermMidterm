
public class ForCash {
	private double change;
	private double cashPaid;
	
	
	
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



}
