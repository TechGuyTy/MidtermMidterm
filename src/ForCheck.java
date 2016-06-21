
public class ForCheck implements Payment{
	//get the check number 
	private int check; 
	private double subTotal; 
	private double salesTax; 
	private double grandTotal; 
	private String grandTotalString;
	
	public int getCheck(){
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