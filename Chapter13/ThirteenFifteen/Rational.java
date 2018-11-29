import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 13-15
 * @date Nov. 29, 2018
 * @summary (Use BigInteger for the Rational class) Redesign and implement the
 *          Rational class in Listing 13.13 using BigInteger for the numerator
 *          and denominator.
 **/
class Rational {
	public static void main(String[] args) {
	}

	public static String getInput() {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		reader.close();
		return input;
	}
}