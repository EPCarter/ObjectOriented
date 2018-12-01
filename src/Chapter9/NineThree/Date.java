package Chapter9.NineThree;
import java.util.Date.*;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-3
 * @date Nov. 29, 2018
 * @summary (Use the Date class) Write a program that creates a Date object,
 *          sets its elapsed time to 10000, 100000, 1000000, 10000000,
 *          100000000, 1000000000, 10000000000, and 100000000000, and displays
 *          the date and time using the toString() method, respectively.
 **/
class Date {
	long time;

	void setTime(long timeGiven) {
		time = timeGiven;
	}

		void getTime() {
		System.out.println(this.time.toString());
		}
	
}