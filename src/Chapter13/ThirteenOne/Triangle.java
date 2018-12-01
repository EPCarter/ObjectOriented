package Chapter13.ThirteenOne;

import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 13-1
 * @date Nov. 29, 2018
 * @summary (Triangle class) Design a new Triangle class that extends the
 *          abstract GeometricObject class.
 * 
 *          Draw the UML diagram for the classes Triangle and GeometricObject
 *          and then implement the Triangle class. Write a test program that
 *          prompts the user to enter three sides of the triangle, a color, and
 *          a Boolean value to indicate whether the triangle is filled. The
 *          program should create a Triangle object with these sides and set the
 *          color and filled properties using the input. The program should
 *          display the area, perimeter, color, and true or false to indicate
 *          whether it is filled or not.
 **/
class Triangle {
	public static void main(String[] args) {

	}

	public static String getInput() {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		reader.close();
		return input;
	}
}