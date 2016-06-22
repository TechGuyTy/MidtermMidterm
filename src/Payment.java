import java.util.Scanner;

public interface Payment {
	double setCashPaid();
	double setSubTotal();
	double getCashPaid();
	double getSubTotal();
	double getSalesTax();
	double getGrandTotal();
	double getChange();
	String getGrandTotalString();
	void getCash(double subTotal, Scanner sc);
	void getCheck(double subTotal, Scanner sc);
}
