import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductReader {
	public static void main(String[] args) {

		// public static void foodReader() {

		ArrayList<String> productList = new ArrayList<String>();

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
			String[] productArray = {};

			while (line != null) {

				String[] details = line.split(line);
				// System.out.println(line);

				line = reader.readLine();

				productList.add(line);
				
				System.out.println(line);
				

			}

			System.out.println("Here's an attempt at an array " + productList.get(3) );
			System.out.println(productList.get(4));

			reader.close();
			

			

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		//basic menu not seperated by catagories yet
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a menu number");
		System.out.println();
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: productList.get(0);
			System.out.println("You have chosen " + productList.get(0));
			break;
		case 2: productList.get(1);
		System.out.println("You have chosen " + productList.get(1));
		break;
		case 3: productList.get(2);
		System.out.println("You have chosen " + productList.get(2));
		break;
		case 4: productList.get(3);
		System.out.println("You have chosen " + productList.get(3));
		break;
		case 5: productList.get(4);
		System.out.println("You have chosen " + productList.get(4));
		break;
		case 6: productList.get(5);
		System.out.println("You have chosen " + productList.get(5));
		break;
		case 7: productList.get(6);
		System.out.println("You have chosen " + productList.get(1));
		break;
		case 8: productList.get(7);
		System.out.println("You have chosen " + productList.get(7));
		break;
		case 9: productList.get(8);
		System.out.println("You have chosen " + productList.get(8));
		break;
		case 10: productList.get(9);
		System.out.println("You have chosen " + productList.get(9));
		break;
		case 11: productList.get(10);
		System.out.println("You have chosen " + productList.get(10));
		break;
		case 12: productList.get(11);
		System.out.println("You have chosen " + productList.get(11));
		break;

		default:
			break;
		}
		
		
	}
		
		//display a receipt with all items stored, sub total, grant total, and appropriate payment info 
		//use the arraylist created to keep track of what's been ordered 
		
		//returns the original menu for a new order Using the do while loop 
	}


