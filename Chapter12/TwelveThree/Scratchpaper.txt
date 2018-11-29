import java.util.Random;
import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 12-3
 * @date Oct. 24, 2018
 * @summary (ArrayIndexOutOfBoundsException) Write a program that meets the
 *          following requirements:
 * 
 *          Creates an array with 100 randomly chosen integers.
 * 
 *          Prompts the user to enter the index of the array, then displays the
 *          corresponding element value. If the specified index is out of
 *          bounds, display the message Out of Bounds.
 **/
class TwelveThree {
	public static void main(String[] args) {
		System.out.println("Enter index: ");
		String input = getInput();
		int[] array = arrayMaker();
		int inputInt = Integer.parseInt(input);
		if (inputInt <= array.length && inputInt >= 0) {
			System.out.println("Index " + inputInt + " holds the value " + array[inputInt]);
		} else {
			System.out.println("Out of bounds");
		}

	}

	public static String getInput() {
		Scanner reader = new Scanner(System.in);
		String input = "";
		input = reader.nextLine();
		return input;
	}

	public static int[] arrayMaker() {
		int[] array = new int[101];
		for (int i = 0; i < array.length; i++) {
			array[i] = numberGenerator();
			System.out.print(array[i] + ",");
		}
		System.out.println();
		return array;
	}

	public static int numberGenerator() {
		Random rand = new Random();
		int number = rand.nextInt(100);
		return number;
	}
}