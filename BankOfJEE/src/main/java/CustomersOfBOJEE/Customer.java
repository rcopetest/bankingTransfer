package CustomersOfBOJEE;

import BankOfJEE.ATM;
import BankOfJEE.Account;
import BankOfJEE.DeskTeller;
import BankOfJEE.Teller;
import BankOfJEE.Bank;

public class Customer {
	private int customerID;
	private String customerName;
	private Bank customerBank;
	private int accountNumber;

	public Customer(int customerID, String customerName, Bank bank) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerBank = bank;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	
	

	boolean makeWithdrawalRequest(int accountNumber, double amount, Teller teller) {
		teller.processDepositeRequest(accountNumber, amount, customerBank);
		return false;
	}

	boolean makeDepositeRequest(int accountNumber, double amount, Teller teller) {
		teller.processDepositeRequest(accountNumber, amount, customerBank);
		return true;
	}

	void requestAccountBalance(int accountNumber, Teller teller) {
		teller.checkAccountBalance(accountNumber, customerBank);
	}

	boolean requestNewSavingsAccount() {
		
		return false;

	}

	boolean requestNewCheckingAccount() {

		return false;

	}

}
