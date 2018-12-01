package Chapter9.NineSeven;

import java.util.Calendar;

public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account(1122, 20000.00, 4.5, Calendar.getInstance());
		System.out.println("ID: " + account1.idAccessor() + " - Balance: $" + account1.balanceAccessor()
				+ " - Annual Interest: " + account1.annualInterestRateAccessor() + "% - Monthly Interest:"
				+ account1.getMonthlyInterestRate() + "% - Date Opened: " + account1.dateCreated);
		account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("Monthly Interest: " + (account1.getMonthlyInterestRate() * 10) + "%");
		System.out.println("Account Created on: " + account1.getDateCreated());
		System.out.println("Currrent Balance: $" + account1.balanceAccessor());
	}
}