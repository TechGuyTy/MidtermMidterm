import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

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

				String[] details = line.split("\t");
				// System.out.println(line);

				line = reader.readLine();

				productList.add(line);
				
				System.out.println(line);
				

			}

			System.out.println("Here's an attempt at an array " + productList.get(3) );

			reader.close();

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		//display a receipt with all items stored, sub total, grant total, and appropriate payment info 
		//use the arraylist created to keep track of what's been ordered 
		
		//returns the original menu for a new order Using the do while loop 
	}

}
