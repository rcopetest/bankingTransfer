package BankOfJEE;

import CustomersOfBOJEE.Customer;

public abstract class Teller {

	private double currentBalance;
	private boolean transactionSuccess;

	boolean processSavingsAccCreation(Customer customer, int pin) {
		return false;
	}

	boolean processCheckingAccCreation(Customer customer) {
		return false;
	}

	/*
	 * teller will take the account number and the requested amount from a
	 * customer and process the transaction using methods in the account class
	 */

	public Receipt processWithdrawalRequest(int accountNumber, double amount,
			Bank bank) {
		// teller pulls account based on accountNumber provided
		Account currentAccount = bank.getCustomerAccount(accountNumber);

		// if the account exist, continue
		if (currentAccount != null) {

			// teller attempts to withdraw amount. If successful, set
			// transactionFlag to successful.
			try {
				if (currentAccount.withdrawAmount(amount)) {
					currentBalance = currentAccount.getBalance();
					transactionSuccess = true;
					// if withdraw is not successful, set flag to false.
				} else {
					// amount cannot be withdrawn -- get balance and set success to
					// false
					currentBalance = currentAccount.getBalance();
					transactionSuccess = false;
				}
			} catch (InsufficientFundsException e) {
				e.printStackTrace();
			} catch (InvalidWithdrawRequest e) {
				e.printStackTrace();
			}
		} else {
			// account does not exist, set balance to 0
			System.out.println("Account does not exist");
			currentBalance = 0;
			transactionSuccess = false;
		}
		Receipt transactionReceipt = new Receipt(amount, transactionSuccess,
				currentBalance);
		transactionReceipt.printReceipt();
		return transactionReceipt;
	}

	/*
	 * teller will take the account number and the requested amount from a
	 * customer and process the transaction using methods in the account class
	 */
	public Receipt processDepositeRequest(int accountNumber, double amount,
			Bank bank) {
		// if the request is valid (account.depositeAmout returns true) then
		// complete the transaction

		Account currentAccount = bank.getCustomerAccount(accountNumber);

		// if the account exist, continue
		if (currentAccount != null) {
			// if the amount can be deposited, continue
			if (currentAccount.depositeAmount(amount)) {
				// amount can be deposited -- get balance and set success to
				// true
				currentBalance = currentAccount.getBalance();
				transactionSuccess = true;
			} else {
				// amount cannot be deposited -- get balance and set success to
				// true
				currentBalance = currentAccount.getBalance();
				transactionSuccess = false;
			}
		} else {
			// account does not exist, set balance to 0
			System.out.println("Account does not exist");
			currentBalance = 0;
			transactionSuccess = false;
		}
		Receipt transactionReceipt = new Receipt(amount, transactionSuccess,
				currentBalance);
		transactionReceipt.printReceipt();
		return transactionReceipt;
	}

	public Receipt checkAccountBalance(int accountNumber, Bank bank) {
		Account currentAccount = bank.getCustomerAccount(accountNumber);
		Receipt currentBalanceReceipt = new Receipt(0, true,
				currentAccount.getBalance());
		System.out.println("Your current balance is: "
				+ currentAccount.getBalance());
		return currentBalanceReceipt;

	}
}
