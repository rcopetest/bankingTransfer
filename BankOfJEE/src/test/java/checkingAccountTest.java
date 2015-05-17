import static org.junit.Assert.assertEquals;

import org.junit.Test;

import BankOfJEE.CheckingAccount;


public class checkingAccountTest {

	
	
	@Test
	public void getBalance() {
		CheckingAccount testCheckingAccount = new CheckingAccount(0, 0, null);
		double currentBalance = testCheckingAccount.getBalance();
		assertEquals(currentBalance == 0, 0 == 0);
	}
}
