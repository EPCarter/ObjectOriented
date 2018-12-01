package Chapter10.TenSeven;

public class Menu {
	public static void main(String[] args) {
		System.out.println("Please Enter ID: ");
		int id = Valet.intParser();
		if (id > Accounts.accounts.length) {
			System.out.println("Please Enter A Correct ID");
			System.out.println();
			Menu.main(null);
		}
		System.out.println();
		System.out.println("Please Enter Your Choice: ");
		System.out.println("1: Balance");
		System.out.println("2: Withdraw");
		System.out.println("3: Deposit");
		System.out.println("4: Exit");
		System.out.println("5: Set Accounts");
		int choice = Valet.intParser();

		switch (choice) {
		case 1:
			Accounts.getBalance(id);
			break;
		case 2:
			Accounts.withdraw(id);
			break;
		case 3:
			Accounts.deposit(id);
			break;
		case 4:
			Accounts.exit();
			break;
		case 5:
			Accounts.setAccounts();
			break;
		default:
			System.out.println("Please enter a correct choice");
			Menu.main(null);
			break;
		}
		Menu.main(null);
	}
}