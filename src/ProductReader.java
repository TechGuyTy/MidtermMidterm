import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductReader {

	public static double calculateTotal(Product productName, int n) {
		
		
		double total = ((double)n) * productName.getPrice();
		return total;
		
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the amount for the item purchased ");
//		int quantity = scan.nextInt();
//		double total = quantity * productName.getPrice();
//		return total;
	}
	/*
	 * public static void shoppingCart() { ArrayList<String> shoppingCart = new
	 * ArrayList<String>();
	 * shoppingCart.add(ProductReader.calculateTotal(productName)); }
	 */

	public static void getCash(Scanner sc, String prompt, double total) {
		System.out.println(prompt);
		double amountTendered = sc.nextDouble();
		// this may be a method here
		if (amountTendered < total) {
			System.out.println("This does not equal the total. Please check the total and input the" + "right amount.");
		} else {
			double change = amountTendered - total;
			new DecimalFormat("#.##").format(change);
			System.out.println("Here is your change " + change);
		}
	}

	public void getCheckNumber(Scanner sc, String prompt) {
		System.out.println(prompt);
		int checkNumber = sc.nextInt();
		System.out.println("Here is your receipt");
	}

	public void getCCNumber(Scanner sc, String prompt) {
		System.out.println(prompt);
		int ccNumber = sc.nextInt();
		System.out.println("Here is your receipt");
	}

	public static void main(String[] args) {

		// public static void foodReader() {

		ArrayList<Product> productList = new ArrayList<Product>();

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

			System.out.println(productList);

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		// basic menu not seperated by catagories yet
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		double subTotal = 0;
		double finalTotal = 0;
		boolean repeatMenu = false;
		ArrayList<Product> shoppingCart = new ArrayList<Product>();
		while (repeatMenu == false) {
			System.out.println("Enter a menu number");
			System.out.println();
			int choice = sc.nextInt();

			
			System.out.println("How many would you like?");
			
			int quantity = sc.nextInt();
			
			choice = choice -1;
			
			subTotal = calculateTotal(productList.get(choice), quantity);
			
			for(int i = 0; i < quantity; i++){
				shoppingCart.add(productList.get(choice));
				}

			System.out.println();
			System.out.println(shoppingCart);
			finalTotal = finalTotal + subTotal;
			System.out.println(finalTotal);
			
//			switch (choice) {
//			case 1:
//				productList.get(0);
//				System.out.println("You have chosen " + productList.get(0).getName());
//				System.out.println("How many would you like?");
//				int number = sc.nextInt();
//				subTotal = (ProductReader.calculateTotal(productList.get(choice), number ));
//				System.out.println("Your Subtotal is" + subTotal);
//				
//				for(int i = 0; i < number; i++){
//				shoppingCart.add(productList.get(0));
//				}
//				System.out.println("Here's your shopping cart:"+shoppingCart);
//				break;
//			case 2:
//				productList.get(1);
//				System.out.println("You have chosen " + productList.get(1));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 3:
//				productList.get(2);
//				System.out.println("You have chosen " + productList.get(2));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 4:
//				productList.get(3);
//				System.out.println("You have chosen " + productList.get(3));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 5:
//				productList.get(4);
//				System.out.println("You have chosen " + productList.get(4));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 6:
//				productList.get(5);
//				System.out.println("You have chosen " + productList.get(5));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 7:
//				productList.get(6);
//				System.out.println("You have chosen " + productList.get(1));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 8:
//				productList.get(7);
//				System.out.println("You have chosen " + productList.get(7));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 9:
//				productList.get(8);
//				System.out.println("You have chosen " + productList.get(8));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 10:
//				productList.get(9);
//				System.out.println("You have chosen " + productList.get(9));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 11:
//				productList.get(10);
//				System.out.println("You have chosen " + productList.get(10));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 12:
//				productList.get(11);
//				System.out.println("You have chosen " + productList.get(11));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;
//			case 13:
//				productList.get(12);
//				System.out.println("You have chosen " + productList.get(12));
//				subTotal = (ProductReader.calculateTotal(productList.get(choice)));
//				System.out.println("Your Subtotal is" + subTotal);
//				break;

//			default:
//				break;
			}
			finalTotal = finalTotal + subTotal;
			System.out.println(finalTotal);
		}
	}

	// display a receipt with all items stored, sub total, grant total, and
	// appropriate payment info
	// use the arraylist created to keep track of what's been ordered

	// returns the original menu for a new order Using the do while loop

