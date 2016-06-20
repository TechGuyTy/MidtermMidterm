import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ProductReader {
	public static void main(String[] args) {
		

	//public static void foodReader() {

		try {
			// creating new file object
			File productReader = new File("Products.txt");
			// creating filereader connection
			FileReader fileReader = new FileReader(productReader);

			// creating reader chain
			BufferedReader reader = new BufferedReader(fileReader);

			// reading the file
			String line = reader.readLine();

			while (line != null) {
				
				String[] details = line.split("\t");
				System.out.println(line);
				line = reader.readLine();
			}
			
			reader.close();

		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}


}
