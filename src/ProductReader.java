import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductReader {

	public static double calculateTotal(Product productName){
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the amount for the item purchased ");
		int quantity = scan.nextInt(); 
		
		//Product temp = new Product(); 
		double total = quantity * productName.getPrice();
		return total; 
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

			ArrayList<String> productArray = new ArrayList<String>();
			// reading the file
			String line = reader.readLine();

			productArray.add(line);
			
			int i = 0;
			while (line != null) {
				
				productArray.add(line);
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
		//basic menu not seperated by catagories yet
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter a menu number");
		System.out.println();
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: productList.get(0);
			System.out.println("You have chosen " + productList.get(0));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 2: productList.get(1);
			System.out.println("You have chosen " + productList.get(1));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 3: productList.get(2);
			System.out.println("You have chosen " + productList.get(2));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 4: productList.get(3);
			System.out.println("You have chosen " + productList.get(3));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 5: productList.get(4);
			System.out.println("You have chosen " + productList.get(4));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 6: productList.get(5);
			System.out.println("You have chosen " + productList.get(5));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 7: productList.get(6);
			System.out.println("You have chosen " + productList.get(1));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 8: productList.get(7);
			System.out.println("You have chosen " + productList.get(7));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 9: productList.get(8);
			System.out.println("You have chosen " + productList.get(8));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 10: productList.get(9);
			System.out.println("You have chosen " + productList.get(9));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 11: productList.get(10);
			System.out.println("You have chosen " + productList.get(10));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;
		case 12: productList.get(11);
			System.out.println("You have chosen " + productList.get(11));
			System.out.println(ProductReader.calculateTotal(productList.get(choice)));
			break;

		default:
			break;
		}
		
		
	}
		
		//display a receipt with all items stored, sub total, grant total, and appropriate payment info 
		//use the arraylist created to keep track of what's been ordered 
		
		//returns the original menu for a new order Using the do while loop 
	}

