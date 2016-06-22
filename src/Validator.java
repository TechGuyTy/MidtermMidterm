import java.util.Scanner;

public class Validator {
	
	public static int isValidChoiceForMenu(Scanner scan, int menuNumber) {
        while (menuNumber <= 0 || menuNumber >= 13) {
            System.out.println("That is an invalid choice. You must choose a number from 1 - 12");
            menuNumber = scan.nextInt(); 
        }
        return menuNumber;
    }
	public static int isValidInt(Scanner scan, int choice, int minNumber, int maxNumber) {
        while (choice < minNumber || choice > maxNumber) {
            System.out.println("That is an invalid choice. You must choose a number from " + minNumber + " - " + maxNumber);
            choice = scan.nextInt(); 
        }
        return choice;
    }

	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextInt(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be greater than " + min + ".");
			else if (i > max)
				System.out.println("Error! Number must be less than " + max + ".");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d <= min)
				System.out.println("Error! Number must be greater than " + min + ".");
			else if (d >= max)
				System.out.println("Error! Number must be less than " + max + ".");
			else
				isValid = true;
		}
		return d;
	}
		public static boolean getYN(Scanner sc, String prompt) {
			boolean isValid = false;
			while(isValid==false) {
				System.out.println(prompt);
			String response = sc.nextLine();
			if (response.equals(" ")){
				response = sc.nextLine();
			}
			char firstLetter = response.toLowerCase().charAt(0);
			if (firstLetter=='y') {
				isValid = true;
			} else if (firstLetter == 'n' ) {
				isValid = true;
			} else {
				System.out.println("Try again");
			}
		}
			return isValid;
		}

		public static boolean getYesNo(Scanner sc, String prompt) {
			System.out.println(prompt);

			String S = sc.nextLine();
			boolean b = false;
			while (!S.trim().substring(0, 1).toLowerCase().equalsIgnoreCase("y")
					&& !S.trim().substring(0, 1).toLowerCase().equalsIgnoreCase("n")) {
				System.out.println("Incorrect format. Yes or No?");
				S = sc.nextLine();
			}
			if (S.trim().substring(0, 1).equalsIgnoreCase("y")) {
				b = true;
			} else {
				b = false;
			}
			return b;
		}
}