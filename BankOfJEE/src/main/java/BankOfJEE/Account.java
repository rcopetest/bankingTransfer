package BankOfJEE;

import CustomersOfBOJEE.Customer;

/*
 * an abstract class that stores, retrieves and updates account information 
 */
public abstract class Account {
	private double balance;
	private double pin;
	String[] AccountHolder;
	
	public Account(double pin, Customer customer) {
		super();
		this.pin = pin;
		this.balance = 0;
	}

	abstract void accrueInterest();

	boolean withdrawAmount(double amount) throws InsufficientFundsException, InvalidWithdrawRequest {
		//checks to see if amount withdraw
		if (amount > 0) {
			if(amount > balance)
				updateBalance(amount);
			else{
				throw new InsufficientFundsException(amount, balance);
			}
			return true;
		}
		throw new InvalidWithdrawRequest();
	}

	boolean depositeAmount(double amount) {
		if (amount < 0) {
			updateBalance(amount);
			return true;
		}
		return false;
	}

	private double updateBalance(double amount) {
		return balance = balance + amount;
	}

	public double getBalance() {
		return balance;

	}
}
