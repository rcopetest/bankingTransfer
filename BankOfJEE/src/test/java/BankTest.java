
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import BankOfJEE.Account;
import BankOfJEE.Bank;

public class BankTest {

	@Test
	public void testAddAccount() {
		// create a mock Bank
		Bank bank = new Bank();
		// create a mock account to put into a new bank account
		Account acc1 = Mockito.mock(Account.class);
		// add the new account account into bank and store the new account
		// number in a var to test.
		int newAccountNumber = bank.addAccount(acc1);
		//test pass if addAccount returns int
		System.out.println(newAccountNumber);
		assertTrue(newAccountNumber == (int)newAccountNumber);

	}
	
	@Test
	public void testExistingAccount() {
		// create a mock Bank
		Bank bank = new Bank();
		// create a mock account to put into a new bank account
		Account acc1 = Mockito.mock(Account.class);
		// add the new account account into bank and store the new account
		// number in a var to test.
		int newAccountNumber = bank.addAccount(acc1);
		//test pass if addAccount returns int
		System.out.println(newAccountNumber);
		assertTrue(newAccountNumber == (int)newAccountNumber);

	}

}
