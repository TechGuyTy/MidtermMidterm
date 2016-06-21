
public class ForCheck implements Payment{
	//get the check number 
	private int check; 
	
	public int getCheck(){
		return check; 
	}
	
	public void setCheck(int check){
		this.check = check;
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
//Ff