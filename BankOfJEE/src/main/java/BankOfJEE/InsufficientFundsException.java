package BankOfJEE;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super();
	}

	public InsufficientFundsException(double amount, double balance) {
		super("Insufficient Funds: " + amount + " is unavailable \n Current balance: " + balance);
	}
}
