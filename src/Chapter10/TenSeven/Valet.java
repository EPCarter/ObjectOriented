package Chapter10.TenSeven;

import java.util.Scanner;

public class Valet {

	public static String getInput() {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		return input;
	}

	public static int intParser() {
		int parsedInt = Integer.parseInt(getInput());
		return parsedInt;
	}

	public static double doubleParser() {
		double parsedDouble = Double.parseDouble(getInput());
		return parsedDouble;
	}
}