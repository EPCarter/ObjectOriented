import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 12-1
 * @date Oct. 24, 2018
 * @summary (NumberFormatException) Listing 7.9, Calculator.java, is a simple
 *          commandline calculator. Note that the program terminates if any
 *          operand is nonnumeric. Write a program with an exception handler
 *          that deals with nonnumeric operands; then write another program
 *          without using an exception handler to achieve the same objective.
 *          Your program should display a message that informs the user of the
 *          wrong operand type before exiting (see Figure 12.12)
 **/
class TwelveOne {
	public static void main(String[] args) {
		System.out.println("*Nice Parser*");
		System.out.println("Enter math:");
		inputHandler(getInput());
		dumbMath();
	}

	public static String getInput() {
		Scanner reader = new Scanner(System.in);
		String input = "";
		input = reader.nextLine();
		return input;
	}

	public static String inputHandler(String input) {
		String numReg = "\\d{1,}";
		String symbolReg = "\\*|\\+|\\-|\\/";
		String cleanedString = "";
		String lastNumReg = "\\d{1,}$";
		double firstNum = 0;
		double secondNum = 0;
		String symbol = "";
		String charReg = "[a-zA-Z]";

		cleanedString = input.replaceAll("\\s{2,}", " ");
		cleanedString = input.replaceAll("\\s{2,}", " ");

		Pattern searchPattern = Pattern.compile(charReg);
		Matcher searchMatcher = searchPattern.matcher(cleanedString);

		if (searchMatcher.find()) {
			System.out.println("Enter numbers only");
			System.exit(0);
			// cleanedString = cleanedString.replaceAll("[a-zA-Z]", "0");
		}

		searchPattern = Pattern.compile(numReg);
		searchMatcher = searchPattern.matcher(cleanedString);

		if (searchMatcher.find()) {
			firstNum = Double.parseDouble(searchMatcher.group());
		}
		searchPattern = Pattern.compile(symbolReg);
		searchMatcher = searchPattern.matcher(cleanedString);

		if (searchMatcher.find()) {
			symbol = searchMatcher.group();
		}
		searchPattern = Pattern.compile(lastNumReg);
		searchMatcher = searchPattern.matcher(cleanedString);

		if (searchMatcher.find()) {
			secondNum = Double.parseDouble(searchMatcher.group());
		}
		cleanedString = firstNum + " " + symbol + " " + secondNum + " = ";
		System.out.print(cleanedString);
		System.out.println(calculator(firstNum, symbol, secondNum));
		return cleanedString;
	}

	public static void dumbMath() {
		double firstNum = 0;
		double secondNum = 0;
		System.out.println();
		System.out.println("*Not Great Parser*");
		System.out.println("Enter 1st number: ");
		try {
			firstNum = Double.parseDouble(getInput());
		} catch (NumberFormatException e) {
			System.out.println("Error: Enter a number");
			System.exit(0);
		}
		System.out.println("Enter math operation: ");
		String symbol = getInput();

		System.out.println("Enter 2nd number: ");
		try {
			secondNum = Double.parseDouble(getInput());
		} catch (NumberFormatException e) {
			System.out.println("Error: Enter a number");
			System.exit(0);
		}
		System.out.println(firstNum + " " + symbol + " " + secondNum + " = " + calculator(firstNum, symbol, secondNum));
	}

	public static double calculator(double firstNum, String symbol, double secondNum) {
		double answer = 0;

		switch (symbol) {
		case "+":
			answer = firstNum + secondNum;
			break;
		case "-":
			answer = firstNum - secondNum;
			break;
		case "*":
			answer = firstNum * secondNum;
			break;
		case "/":
			answer = firstNum / secondNum;
			break;
		default:
			System.out.println("Error: Enter a math operation");
			System.exit(0);
			break;
		}
		return answer;
	}
}