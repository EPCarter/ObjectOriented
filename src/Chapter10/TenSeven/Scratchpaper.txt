import java.util.Scanner;

@SuppressWarnings("resource")
/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 10-
 * @date Oct. 24, 2018
 * @summary (Game: ATM machine) Use the Account class created in Programming
 *          Exercise 9.7 to simulate an ATM machine. Create ten accounts in an
 *          array with id 0, 1,..., 9, and initial balance $100.
 * 
 *          The system prompts the user to enter an id. If the id is entered
 *          incorrectly, ask the user to enter a correct id. Once an id is
 *          accepted, the main menu is displayed as shown in the sample run. You
 *          can enter a choice 1 for viewing the current balance, 2 for
 *          withdrawing money, 3 for depositing money, and 4 for exiting the
 *          main menu.
 * 
 *          Once you exit, the system will prompt for an id again. Thus, once
 *          the system starts, it will not stop.
 **/
class TenSeven {
	public static void main(String[] args) {
		double[] account = new double[] { 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100 };
		for (int i = 0; i < 100; i++) {
			menu(account);
		}
	}

	public static void menu(double[] account) {
		System.out.println("-------------------------------------");
		System.out.println("What would you like to do?");
		System.out.println();
		int menuItems = 5;
		int a = 0;
		String b = "";
		for (int j = 0; j < menuItems; j++) {
			switch (j) {
			case 0:
				b = "Menu";
				break;
			case 1:
				b = "Balance";
				break;
			case 2:
				b = "Withdraw";
				break;
			case 3:
				b = "Deposit";
				break;
			case 4:
				b = "Exit";
				break;
			default:
				b = "";
				break;
			}
			System.out.println(a + ": " + b);
			a++;
		}
		System.out.println("-------------------------------------");
		Scanner reader = new Scanner(System.in);
		int inputCleaned = Integer.parseInt(reader.nextLine());
		System.out.println("-------------------------------------");

		switch (inputCleaned) {
		case 0:
			break;
		case 1:
			int id = getID();
			getBalance(id, account);
			break;
		case 2:
			id = getID();
			withdraw(id, account);
			break;
		case 3:
			id = getID();
			deposit(id, account);
			break;
		case 4:
			System.out.println("Exiting...");
			System.exit(0);
		default:
			System.out.println("Choose a menu item.");
			menu(account);
			break;
		}
	}

	public static double getBalance(int id, double[] account) {

		System.out.println("Current Balance: $" + account[id]);
		return account[id];
	}

	public static double getInput() {
		Scanner reader = new Scanner(System.in);
		double input = reader.nextDouble();
		return input;
	}

	public static double withdraw(int id, double[] account) {
		double balance = getBalance(id, account);
		System.out.print("Withdrawal amount: $");
		double withdraw = getInput();
		if (balance - withdraw >= 0) {
			balance -= withdraw;
			System.out.println("New Balance: $" + balance);
			setBalance(id, balance, account);
			return balance;
		} else {
			System.out.println();
			System.out.println("Insufficient funds.");
			withdraw(id, account);
		}
		return balance;
	}

	public static double deposit(int id, double[] account) {
		double balance = getBalance(id, account);
		System.out.print("Deposit amount: $");
		double deposit = getInput();
		if (deposit > 10000) {
			System.out.println("Deposits of over $10,000 must be reported to the IRS.");
		}
		balance += deposit;
		setBalance(id, balance, account);
		System.out.println("New Balance: $" + balance);
		return balance;
	}

	public static int getID() {
		int id = 0;
		System.out.print("ID: ");
		int input = (int) getInput();
		if (input == -1) {
			System.exit(0);
		} else if (input <= 10 && input >= 0) {
			id = input;
		} else {
			System.out.println("Please enter a correct ID.");
			getID();
		}
		return id;
	}

	public static void setBalance(int id, double balance, double[] account) {
		account[id] = balance;
	}
}