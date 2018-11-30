/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 11-1
 * @date Oct. 24, 2018
 * @summary (The Triangle class) Design a class named Triangle that extends
 *          GeometricObject. The class contains:
 * 
 *          Three double data fields named side1, side2, and side3 with default
 *          values 1.0 to denote three sides of the triangle.
 * 
 *          A no-arg constructor that creates a default triangle.
 * 
 *          A constructor that creates a triangle with the specified side1,
 *          side2, and side3.
 * 
 *          The accessor methods for all three data fields.
 * 
 *          A method named getArea() that returns the area of this triangle.
 * 
 *          A method named getPerimeter() that returns the perimeter of this
 *          triangle.
 * 
 *          A method named toString() that returns a string description for the
 *          triangle. For the formula to compute the area of a triangle, see
 *          Programming Exercise 2.19. The toString() method is implemented as
 *          follows: return "Triangle: side1 = " + side1 + " side2 = " + side2 +
 *          " side3 = " + side3; Draw the UML diagrams for the classes Triangle
 *          and GeometricObject and implement the classes. Write a test program
 *          that prompts the user to enter three sides of the triangle, a color,
 *          and a Boolean value to indicate whether the triangle is filled. The
 *          program should create a Triangle object with these sides and set the
 *          color and filled properties using the input. The program should
 *          display the area, perimeter, color, and true or false to indicate
 *          whether it is filled or not.
 **/
class ElevenOne {
	public static void main(String[] args) {

	}

	public class GeometricObject {

	}

	public class Triangle extends GeometricObject {
		double side1;
		double side2;
		double side3;
		double area;
		double perimeter;
		String color;
		Boolean filled;
	}

	public static double setSide1() {
		double side1 = 1;
		return side1;
	}

	public static double setSide2() {
		double side2 = 1;
		return side2;
	}

	public static double setSide3() {
		double side3 = 1;
		return side3;
	}

	public static double getSide1() {
		double side1 = 0;
		return side1;
	}

	public static double getSide2() {
		double side2 = 0;
		return side2;
	}

	public static double getSide3() {
		double side3 = 0;
		return side3;
	}

	public double getArea(double side1, double side2, double side3) {
		double area = 0;
		return area;
	}

	public double getPerimeter(double side1, double side2, double side3) {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	public String getColor() {
		String color = "";
		return color;
	}

	public boolean getFilled() {
		boolean filled = false;
		return filled;
	}

	public String toString(double side1, double side2, double side3) {
		String output = "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		System.out.println(output);
		return output;
	}
}