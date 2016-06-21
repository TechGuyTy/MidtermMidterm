import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductReader {
	static boolean repeatMenu = true;

	public static double calculateTotal(Product productName, int n) {
		double total = ((double) n) * productName.getPrice();
		return total;
	}

	public static boolean ToContinue() {

		System.out.println("would you like to continue with your purchase ?(y/n)");
		Scanner scan2 = new Scanner(System.in);
		String complete = scan2.nextLine();

		if (complete.equalsIgnoreCase("y") || complete.equalsIgnoreCase("yes")) {
			System.out.println(" ");
			repeatMenu = true;
		} else if (complete.equalsIgnoreCase("n") || complete.equalsIgnoreCase("no")) {
			System.out.println(" ");
			repeatMenu = false;
		} else {
			System.out.println("Sorry, please enter \"y\" or \"n\"");
		}
		return repeatMenu;
	}

	// Scanner scan = new Scanner(System.in);
	// System.out.println("Please enter the amount for the item purchased ");
	// int quantity = scan.nextInt();
	// double total = quantity * productName.getPrice();
	// return total;
	/*
	 * public static void shoppingCart() { ArrayList<String> shoppingCart = new
	 * ArrayList<String>();
	 * shoppingCart.add(ProductReader.calculateTotal(productName)); }
	 */

	public static boolean getCash(Scanner input, String prompt, double total) {
		boolean badPayment = false;
		while (badPayment == false) {
			System.out.println(prompt);
			double amountTendered = input.nextDouble();
			// this may be a method here
			if (amountTendered < total) {
				System.out.println(
						"This does not equal the total. Please check the total and input the" + "right amount.");
			} else {
				double change = amountTendered - total;
				new DecimalFormat("#.##").format(change);
				System.out.println("Here is your change " + change);
				badPayment = true;
			}
		}
		return badPayment;
	}
// implemented into the ForCheck class 
	//public void getCheckNumber(Scanner sc, String prompt) {
		//System.out.println(prompt);
		//int checkNumber = sc.nextInt();
		//System.out.println("Here is your receipt");
	//}
//implemented into the ForCheck class 
	//public void getCCNumber(Scanner sc, String prompt) {
		//System.out.println(prompt);
		//int ccNumber = sc.nextInt();
		//System.out.println("Here is your receipt");
	//}

	public static void main(String[] args) {
		int a = 0;

		// public static void foodReader() {

		ArrayList<Product> productList = new ArrayList<Product>();

		// basic menu not seperated by catagories yet
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		double subTotal = 0;
		double finalTotal = 0;

		ArrayList<Product> shoppingCart = new ArrayList<Product>();

		int placeHolder = 0;
		while (repeatMenu == true) {
			try {
				// creating new file object
				File productReader = new File("Products.txt");
				// creating filereader connection
				FileReader fileReader = new FileReader(productReader);

				// creating reader chain
				BufferedReader reader = new BufferedReader(fileReader);

				// reading the file
				String line = reader.readLine();

				int i = 0;
				while (line != null) {

					String[] details = line.split("\t");

					// System.out.println(line);
					Product temp = new Product();
					temp.setName(details[0]);
					temp.setCategory(details[1]);
					temp.setDescription(details[2]);
					temp.setPrice(details[3]);

					System.out.println(line);

					line = reader.readLine();

					productList.add(temp);

				}

				reader.close();

			} catch (Exception ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
			}
			System.out.println("Enter a menu number");
			System.out.println();
			int choice = sc.nextInt();

			System.out.println("How many would you like?");

			int quantity = sc.nextInt();
			placeHolder += quantity;
			choice = choice - 1;

			subTotal = calculateTotal(productList.get(choice), quantity);
			for (int i = 0; i < placeHolder; i++) {
				shoppingCart.add(productList.get(choice));
				System.out.println(shoppingCart.get(i));
			}

			
			//System.out.println();
			//for (int i = 0; i < quantity; i++) {

			
			
			
			finalTotal = finalTotal + subTotal;
			System.out.println("Subtotal "+finalTotal);
			// call the toContinue method
			ProductReader.ToContinue();
			// switch (choice) {
			// case 1:
			// productList.get(0);
			// System.out.println("You have chosen " +
			// productList.get(0).getName());
			// System.out.println("How many would you like?");
			// int number = sc.nextInt();
			// subTotal = (ProductReader.calculateTotal(productList.get(choice),
			// number ));
			// System.out.println("Your Subtotal is" + subTotal);
			//
			// for(int i = 0; i < number; i++){
			// shoppingCart.add(productList.get(0));
			// }
			// System.out.println("Here's your shopping cart:"+shoppingCart);
			// break;
			// case 2:
			// productList.get(1);
			// System.out.println("You have chosen " + productList.get(1));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 3:
			// productList.get(2);
			// System.out.println("You have chosen " + productList.get(2));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 4:
			// productList.get(3);
			// System.out.println("You have chosen " + productList.get(3));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 5:
			// productList.get(4);
			// System.out.println("You have chosen " + productList.get(4));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 6:
			// productList.get(5);
			// System.out.println("You have chosen " + productList.get(5));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 7:
			// productList.get(6);
			// System.out.println("You have chosen " + productList.get(1));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 8:
			// productList.get(7);
			// System.out.println("You have chosen " + productList.get(7));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 9:
			// productList.get(8);
			// System.out.println("You have chosen " + productList.get(8));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 10:
			// productList.get(9);
			// System.out.println("You have chosen " + productList.get(9));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 11:
			// productList.get(10);
			// System.out.println("You have chosen " + productList.get(10));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 12:
			// productList.get(11);
			// System.out.println("You have chosen " + productList.get(11));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;
			// case 13:
			// productList.get(12);
			// System.out.println("You have chosen " + productList.get(12));
			// subTotal =
			// (ProductReader.calculateTotal(productList.get(choice)));
			// System.out.println("Your Subtotal is" + subTotal);
			// break;

			// default:
			// break;

		}
		System.out.println("Thank you for your purchase ");
		finalTotal = finalTotal + subTotal;
		System.out.println("Your final total is " + finalTotal);
		System.out.println("How would you like to pay? (cash,check,CreditCard)");
		String garbage = sc.nextLine();
		String payment = sc.nextLine();
		if (payment.equalsIgnoreCase("cash")) {
			ProductReader.getCash(sc, "Enter amount you'd like to pay", finalTotal);
		} else if (payment.equalsIgnoreCase("check")){
			ForCheck.getCheck(sc, "Enter amount you'd like to pay");
		} else if (payment.equalsIgnoreCase("credit card")){
			ForCredit.getCardNumber(sc, "Enter your credit card number below");
		} else 
			System.out.println(" Sorry, we only accept cash, check, or credit card");
			
		System.out.println("Would you like to add an item to the menu? ");
         
         sc.nextLine();
         String newItem = sc.nextLine();
         
         
         try(FileWriter fw = new FileWriter("Products.txt", true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw))
             {
             
                 out.println("\n"+newItem);
                 //more code
             } catch (IOException e) {
                 //exception handling left as an exercise for the reader
             }

	}
}

// display a receipt with all items stored, sub total, grant total, and
// appropriate payment info
// use the arraylist created to keep track of what's been ordered

// returns the original menu for a new order Using the do while loop
