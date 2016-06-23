import java.util.ArrayList;
import java.util.Scanner;

public interface Payment <Product> {
	
	void getCash(double subTotal, Scanner scan);
    void receipt(ArrayList <Product> objects);
    double setSubTotal(double subTotal);
    double getChange();
    double getCashPaid();
    public void setChange(double change);
    void setCashPaid(double total);
    double getGrandTotal();
    void getCheck(double subTotal, Scanner scan);
    double getCheck();
    double setCheck(double check);
    double getCheck(double total);
    double getCardNumber(Scanner sc, String prompt);
    double getTax();    
    double RoundTo2Decimals(double val);
}

