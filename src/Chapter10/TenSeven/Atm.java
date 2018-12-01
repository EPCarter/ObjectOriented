package Chapter10.TenSeven;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 10-
 * @date Nov. 29, 2018
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
class Atm {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	Calendar dateCreated;

	Atm() {
	}

	Atm(int newID, double newBalance, double newAnnualInterestRate, Calendar newDateCreated) {
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = newDateCreated;
	}

	public String getDateCreated() {
		java.util.Date date1 = new java.util.Date();
		return date1.toString();
	}

	public int idAccessor() {
		int idAccessor = this.id;
		return idAccessor;
	}

	public double balanceAccessor() {
		double balance = this.balance;
		return balance;
	}

	public double annualInterestRateAccessor() {
		double annualInterestRate = this.annualInterestRate;
		return annualInterestRate;
	}

	public void setId(int givenID) {
		System.out.println("ID: ");
		this.id = givenID;
	}

	public void setBalance(double givenBalance) {
		System.out.println("Balance Set: ");
		this.balance = givenBalance;
	}

	public void setAnnualInterestRate(double givenAnnualInterestRate) {
		System.out.println("Annual Interest Rate Set: ");
		this.annualInterestRate = givenAnnualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}

	public void withdraw(double ammount) {
		this.balance = this.balance - ammount;
		System.out.println("$" + ammount + " withdrawn. New Balance: $" + this.balance);
	}

	public void deposit(double ammount) {
		this.balance = this.balance + ammount;
		System.out.println("$" + ammount + " deposited. New Balance: $" + this.balance);
	}

	public void getMonthlyInterest() {
		System.out.println(this.balance * getMonthlyInterestRate());
	}
}


public class AtmTest {
	public static void main(String[] args) {
		Atm account1 = new Atm(1122, 20000.00, 4.5, Calendar.getInstance());
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