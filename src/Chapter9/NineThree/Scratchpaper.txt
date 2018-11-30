import java.util.Date;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-3
 * @date Oct. 24, 2018
 * @summary (Use the Date class) Write a program that creates a Date object,
 *          sets its elapsed time to 10000, 100000, 1000000, 10000000,
 *          100000000, 1000000000, 10000000000, and 100000000000, and displays
 *          the date and time using the toString() method, respectively.
 **/
class NineThree {
	public static void main(String[] args) {
		Date date1 = new Date();
		date1.setTime(10000);
		System.out.println(date1.toString());
		date1.setTime(100000);
		System.out.println(date1.toString());
		date1.setTime(1000000);
		System.out.println(date1.toString());
		date1.setTime(10000000);
		System.out.println(date1.toString());
		date1.setTime(100000000);
		System.out.println(date1.toString());
		date1.setTime(1000000000);
		System.out.println(date1.toString());
		date1.setTime(1000000000);
		System.out.println(date1.toString());

		// date1.setTime(10000000000);
		System.out.println(date1.toString());
	}
}