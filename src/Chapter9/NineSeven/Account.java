package Chapter9.NineSeven;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: Erik Carter
 * @email Carter.Eri7200@stu.stech.edu
 * @course CSCI 1110 - Object Oriented Programming
 * @assignment 9-7
 * @date Nov. 29, 2018
 * @summary (The Account class) Design a class named Account that contains:
 * 
 *          A private int data field named id for the account (default 0). A
 *          private double data field named balance for the account (default 0).
 *          A private double data field named annualInterestRate that stores the
 *          current interest rate (default 0). Assume all accounts have the same
 *          interest rate. A private Date data field named dateCreated that
 *          stores the date when the account was created. A no-arg constructor
 *          that creates a default account. A constructor that creates an
 *          account with the specified id and initial balance. The accessor and
 *          mutator methods for id, balance, and annualInterestRate. The
 *          accessor method for dateCreated. A method named
 *          getMonthlyInterestRate() that returns the monthly interest rate. A
 *          method named getMonthlyInterest() that returns the monthly interest.
 *          A method named withdraw() that withdraws a specified amount from the
 *          account. A method named deposit() that deposits a specified amount
 *          to the account.
 * 
 *          Draw the UML diagram for the class and then implement the class.
 * 
 *          (Hint: The method getMonthlyInterest() is to return monthly
 *          interest, not the interest rate. Monthly interest is balance *
 *          monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12.
 *          Note that annualInterestRate is a percentage, e.g., like 4.5%. You
 *          need to divide it by 100.)
 * 
 *          Write a test program that creates an Account object with an account
 *          ID of 1122, a balance of $20,000, and an annual interest rate of
 *          4.5%. Use the withdraw method to withdraw $2,500, use the deposit
 *          method to deposit $3,000, and print the balance, the monthly
 *          interest, and the date when this account was created.
 **/
class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	Calendar dateCreated;

	Account() {
	}

	Account(int newID, double newBalance, double newAnnualInterestRate, Calendar newDateCreated) {
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