package Chapter10.TenThree;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 10-3
 * @date Nov. 29, 2018
 * @summary (The MyInteger class) Design a class named MyInteger. The class
 *          contains:
 * 
 *          An int data field named value that stores the int value represented
 *          by this object.
 * 
 *          A constructor that creates a MyInteger object for the specified int
 *          value.
 * 
 *          A getter method that returns the int value.
 * 
 *          The methods isEven(), isOdd(), and isPrime() that return true if the
 *          value in this object is even, odd, or prime, respectively.
 * 
 *          The static methods isEven(int), isOdd(int), and isPrime(int) that
 *          return true if the specified value is even, odd, or prime,
 *          respectively.
 * 
 *          The static methods isEven(MyInteger), isOdd(MyInteger), and
 *          isPrime(MyInteger) that return true if the specified value is even,
 *          odd, or prime, respectively.
 * 
 *          The methods equals(int) and equals(MyInteger) that return true if
 *          the value in this object is equal to the specified value.
 * 
 *          A static method parseInt(char[]) that converts an array of numeric
 *          characters to an int value.
 * 
 *          A static method parseInt(String) that converts a string into an int
 *          value.
 * 
 *          Draw the UML diagram for the class and then implement the class.
 * 
 *          Write a client program that tests all methods in the class.
 **/
class MyInteger {
	int value;

	MyInteger(int valueGiven) {
		value = valueGiven;
	}

	public int getValue() {
		return this.value;
	}

	public boolean isEven() {

		if (this.value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (this.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isPrime() {
		int i = 2;
		int count = 0;
		boolean isPrime = false;
		while (i < this.value) {
			if (this.value % i == 0) {
				count++;
				i++;
			} else {
				i++;
			}
			if (count == 0) {
				isPrime = true;
			} else {
				isPrime = false;
			}
		}
		System.out.println("Divisors: " + count);
		return isPrime;
	}

	public boolean equals(MyInteger integer2) {
		if (integer2.value == this.value) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(int compareTo) {
		if (this.value == compareTo) {
			return true;
		} else {
			return false;
		}
	}

	static int parseInt(char[] charArray) {
		String charString = new String(charArray);
		return Integer.parseInt(charString);
	}

	static int parseInt(String someString) {
		return Integer.parseInt(someString);
	}
}