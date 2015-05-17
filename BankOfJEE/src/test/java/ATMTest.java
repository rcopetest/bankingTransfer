import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import BankOfJEE.ATM;
import BankOfJEE.Bank;
import BankOfJEE.CheckingAccount;
import BankOfJEE.Receipt;

public class ATMTest {
	
	
	@Test
	public void testIfATMCanCheckBalance(){
		/*
		 * Setup
		 */
		//create an instance of ATM
		ATM atm = new ATM();
		//create a mock instance of bank
		Bank bank = Mockito.mock(Bank.class);
		//expected balance
		double currentBalance = 1234.56;
		//Mock checking account. this 
		CheckingAccount ca = Mockito.mock(CheckingAccount.class);
		//these two methods are called in checkAccountBalance method and will be mocked
		Mockito.doReturn(currentBalance ).when(ca).getBalance(); //returns expected balance when invoked
		Mockito.doReturn(ca).when(bank).getCustomerAccount(2); //returns the current account when invoked
		
		/*
		 * Test
		 */
		//Receipt will be returned and not null
		assertTrue((atm.checkAccountBalance(2, bank)) instanceof Receipt);
		assertNotNull(atm.checkAccountBalance(2, bank));
	}
	
	@Test
	public void testWithdrawMethod(){
		/*
		 * Setup
		 */
		//create an instance of ATM
		ATM atm = new ATM();
		//create a mock instance of bank
		Bank bank = Mockito.mock(Bank.class);
		//balance before withdraw
		double balanceBeforeWithdraw = 2000;
		//amount requested
		double amountWithdrawn = 765.44;
		//expected balance
		double expectedBalance = 1234.56;
		//Mock checking account. this 
		CheckingAccount ca = Mockito.mock(CheckingAccount.class);
		//these two methods are called in checkAccountBalance method and will be mocked
		Mockito.doReturn(balanceBeforeWithdraw ).when(ca).getBalance(); //returns expected balance when invoked
		//Mockito.doReturn(true).when(ca).
		Mockito.doReturn(ca).when(bank).getCustomerAccount(2); //returns the current account when invoked
		
		
		atm.processWithdrawalRequest(2, amountWithdrawn, bank);
		
	}
	

}
