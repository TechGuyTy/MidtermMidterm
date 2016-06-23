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
	Product pay;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double finalFinalTotal = 0;

		do {
			
			//displaying menu
			//creating arraylist for product objects
			ArrayList<Product> productList = new ArrayList<Product>();
			
			
			//Initializing variables that will be used in the loop to calculate subtotal and total
			double subTotal = 0;
			double finalTotal = 0;
			
			//creating array list for shopping cart
			ArrayList<Product> shoppingCart = new ArrayList<Product>();
			int placeHolder = 0;
			
			//reading the product file and setting the variable line equal to the line that was read
			while (repeatMenu == true) {
				try {
					File productReader = new File("Products.txt");
					FileReader fileReader = new FileReader(productReader);
					BufferedReader reader = new BufferedReader(fileReader);
					String line = reader.readLine();
					
					//as long as there is no null in the document it will continue reading putting each column of each line
					//into an array
					while (line != null) {

						String[] details = line.split("\t");

						//temporary product objects created according to name,categroy, price and description
						
						Product temp = new Product();
						temp.setName(details[0]);
						temp.setCategory(details[1]);
						temp.setDescription(details[2]);
						temp.setPrice(details[3]);

						System.out.println(line);

						line = reader.readLine();

						//adding each of the newly created product objects into an array list
						productList.add(temp);
					}
					reader.close();

				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				//user choosing items
				System.out.println("Enter a menu number");
				int choice = sc.nextInt();

				System.out.println("How many would you like? (Max 100)");
				int quantity = sc.nextInt();
				
				Validator.isValidInt(sc, quantity, 1, 100);
				//placeholder keeps track of the quantity of items in the shopping cart
				placeHolder += quantity;
				//Choice is decreased by one so that it works intuitively as well as with an array on the backend
				choice = choice - 1;
				
				//creating shopping cart
				subTotal = calculateTotal(productList.get(choice), quantity);
				for (int i = 0; i < quantity; i++) {
					shoppingCart.add(productList.get(choice));
				}
				//placeholder updated with multiple quantity values for shopping cart
				for (int i = 0; i < placeHolder; i++) {
					System.out.println(shoppingCart.get(i));
				}
				
				
				//calculating total 
				//Payment  pay;
				//pay = new AllPayments();
				//initiate variable finalfinaltotal to store total value * tax
				//
				finalTotal = finalTotal + subTotal;
				finalFinalTotal = (finalTotal * Product.getTax());
				System.out.println("Subtotal " + ProductReader.RoundTo2Decimals(finalTotal));
				System.out.println("Your subTotal plus tax is " + ProductReader.RoundTo2Decimals(finalFinalTotal));
				
				//continue? line 189
				ProductReader.ToContinue();

			}
			System.out.println("Your final total is " + ProductReader.RoundTo2Decimals(finalFinalTotal));
			System.out.println("Thank you for your purchase ");
			
			//payments options starts by asking which method they want to pay
			//validator to make sure it's validated
			
			
			System.out.println("How would you like to pay? ((1)cash,(2)check,(3)credit card)");
			int payment = sc.nextInt();
			//Validator.isValidInt(sc, payment, 1,3);
			
			//creating reference from the interface to use for all methods in the All payments class
			
			Payment pay;
			pay = new AllPayments();
			if (payment == 1) {
				//pay = new AllPayments();
				pay.getCash(finalTotal, sc);
			} else if (payment == 2) {
				//pay = new AllPayments();
				pay.getCheck(finalTotal, sc);
			} else if (payment == 3) {
				//pay = new AllPayments();
				pay.getCardNumber(sc, "Enter card number");
			} else
				System.out.println(" Sorry, we only accept (1)cash, (2)check, or (3)credit card");
			System.out.println("Here is your receipt");
			getReceipt(shoppingCart, finalTotal);
			
			//Ty
			System.out.print("Would you like to place another order? \n1. Yes, Please!\n2. No, Thank You\nClient Login type in password\nInput:  ");
			sc.nextLine();
			String newOrder = sc.nextLine();
			Validator.isValidChoiceForNewOrder(sc, newOrder);
			if (newOrder.equalsIgnoreCase("1")) {
				repeatMenu = true;
			} else if (newOrder.equalsIgnoreCase("2")) {
				repeatMenu = false;
			} else if (newOrder.equals("Password")) {
				
				//client side to add to menu. More freedom provided
				System.out.println(
						"Welcome to the Menu editor! If you're here by mistake type Exit to exit the program. ");
				System.out.println("What is the name of the item you would like to add?");
				
				//arrayList size called to keep numbering for items correct
				String name = ((productList.size() + 1) + ". " + sc.nextLine() + "\t");
				//extra nonsense in order to read correctly
				if (name.equalsIgnoreCase(((productList.size() + 1) + ". " + "exit" + "\t"))) {
					break;
				}
				//prompts each column
				System.out.println("What is the name of the category for the item you would like to add?");
				String category = (sc.nextLine() + "\t");
				System.out.println("What is a description for the item you would like to add?");
				String description = (sc.nextLine() + "\t");
				System.out.println("What is the price of the item you would like to add?");
				String price = sc.nextLine();
				//creates new object with new specifications 
				Product newItem = new Product(name, category, description, price);
				//Writes the new product to the textfile in a readable format
				try (FileWriter fw = new FileWriter("Products.txt", true);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter out = new PrintWriter(bw)) {

					out.print("\n" + newItem);
					// more code
				} catch (IOException e) {
					// exception handling 
				}
				repeatMenu = true;

			}
		} while (repeatMenu);
	}


	static boolean repeatMenu = true;

	public static double calculateTotal(Product productName, int n) {
		double total = ((double) n) * productName.getPrice();
		return total;
	}


	public static boolean ToContinue() {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Would you like to continue?\n1.YES\n2.NO ");
		String complete = scan2.nextLine();
		Validator.isValidInt(scan2, Integer.parseInt(complete), 1,2);
		if (complete.equalsIgnoreCase("1") ) {
			System.out.println(" ");
			repeatMenu = true;
		} else if (complete.equalsIgnoreCase("2") ) {
			System.out.println(" ");
			repeatMenu = false;
		} else {
			System.out.println("Sorry, please enter \"1\" or \"2\"");
		}
		return repeatMenu;

	}
	public static double RoundTo2Decimals(double val) {
        DecimalFormat df2 = new DecimalFormat("###.##");
    return Double.valueOf(df2.format(val));
	}
	
	 public static String getReceipt(ArrayList<Product> shoppingCart, double total) {
	        for (int i = 0; i < shoppingCart.size(); i++) {
	            System.out.println(shoppingCart.get(i).getName() + "\t" + shoppingCart.get(i).getPrice());
	        }
	        System.out.println("Subtotal:" + "\t" + total);
	        System.out.println("Tax: " + "\t\t" + ProductReader.RoundTo2Decimals((total * .06)));
	        System.out.println("Total: " + "\t\t" + ProductReader.RoundTo2Decimals(total * 1.06));
	        return null;
	    }
}
