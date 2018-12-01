package Chapter10.TenSeven;

public class Accounts {
	static double[] accounts = new double[10];

	Accounts() {
		Menu.main(null);
	}

	static void setAccounts() {
		int i = 0;
		do {
			accounts[i] = 100;
			i++;
		} while (i < 9);
	System.out.println();
	}

	static void getBalance(int id) {
		System.out.println("$" + accounts[id]);
		System.out.println();
	}

	static void deposit(int id) {
		System.out.println("Deposit Ammount: $");
		accounts[id] += Valet.doubleParser();
		System.out.println("New Balance: $" + accounts[id]);
		System.out.println();
	}

	static void withdraw(int id) {
		System.out.println("Withdrawal Ammount: $");
		accounts[id] -= Valet.doubleParser();
		System.out.println("New Balance: $" + accounts[id]);
		System.out.println();
	}

	static void exit() {
		System.out.println("Exiting...");
		System.out.println();
		Menu.main(null);
	}
}