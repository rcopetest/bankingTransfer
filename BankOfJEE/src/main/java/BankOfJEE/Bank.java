package BankOfJEE;

import java.util.HashMap;
import java.util.Map;

public class Bank {
	// collection of banks accounts mapped to an account number
	private Map<Integer, Account> banksAccounts;

	public Bank() {
		banksAccounts = new HashMap<Integer, Account>();
	}

	/*
	 * Creates a Key, Value pair of AccountNumbers to accounts.
	 */
	private int addAccount(Account account) {
		// multiply random by 10,000 to get for digit integer
		int generateAccountNumber = (int) (Math.random() * 10000);
		System.out.println(generateAccountNumber);
		if (!banksAccounts.containsKey(generateAccountNumber)) {
			this.addAccount(account);
		}
		banksAccounts.put(generateAccountNumber, account);

		return generateAccountNumber;
	}

	public Account getCustomerAccount(int accountNumber) {
		if (banksAccounts.containsKey(accountNumber)) {
			return banksAccounts.get(accountNumber);
		}
		return null;
	}

}
