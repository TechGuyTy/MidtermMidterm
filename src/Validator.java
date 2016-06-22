import java.util.Scanner;

public class Validator {

	public static String isValidChoiceForContinue(Scanner scan, String ans) {
		while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
			System.out.println("That is an invalid choice. You must choose \"Y\" or \"N\"");
			ans = scan.nextLine();
		}
		return ans;
	}
	
	public static int isValidChoiceForMenu(Scanner scan, int menuNumber) {
		while (menuNumber <= 0 || menuNumber >= 13) {
			System.out.println("That is an invalid choice. You must choose a number from 1 - 12");
			menuNumber = scan.nextInt(); 
		}
		return menuNumber;
	}
	
	
	public static String isValidForNewMenuItemCategory(Scanner scan, String ans) {
		while (!ans.equalsIgnoreCase("side") && !ans.equalsIgnoreCase("beverage") && !ans.equalsIgnoreCase("entree")) {
			System.out.println("That is an invalid choice. You must choose \"side\", \"beverage\", \"entree\"");
			ans = scan.nextLine();
		}
		return ans;
	}
	
	
	public static String isValidChoiceForNewOrder(Scanner scan, String ans) {
		while (!ans.equalsIgnoreCase("1") && !ans.equalsIgnoreCase("2") && !ans.equalsIgnoreCase("password")) {
			System.out.println("That is an invalid choice. You must choose \"1\" or \"2\"");
			ans = scan.nextLine();
		}
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
