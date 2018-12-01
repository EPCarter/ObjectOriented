package Chapter9.NineOne;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-1
 * @date Nov. 29, 2018
 * @summary (The Rectangle class) Following the example of the Circle class in
 *          Section 9.2, design a class named Rectangle to represent a
 *          rectangle. The class contains:
 * 
 *          Two double data fields named width and height that specify the width
 *          and height of the rectangle. The default values are 1 for both width
 *          and height. A no-arg constructor that creates a default rectangle. A
 *          constructor that creates a rectangle with the specified width and
 *          height. A method named getArea() that returns the area of this
 *          rectangle. A method named getPerimeter() that returns the perimeter.
 *          Draw the UML diagram for the class and then implement the class.
 *          Write a test program that creates two Rectangle objects—one with
 *          width 4 and height 40 and the other with width 3.5 and height 35.9.
 *          Display the width, height, area, and perimeter of each rectangle in
 *          this order.
 **/
class Rectangle {
	double height = 1;
	double width = 1;
	double area;
	double perimeter;

	Rectangle() {
	}

	Rectangle(double newWidth, double newHeight) {
		height = newHeight;
		width = newWidth;
	}

	double getPerimeter() {
		return ((height * 2) + (width * 2));
	}

	double getArea() {
		return height * width;
	}

	public void printer() {
		System.out.println("Width: " + this.width);
		System.out.println("Height: " + this.height);
		System.out.println("Area: " + this.getArea());
		System.out.println("Perimeter: " + this.getPerimeter());
		System.out.println();
	}
}