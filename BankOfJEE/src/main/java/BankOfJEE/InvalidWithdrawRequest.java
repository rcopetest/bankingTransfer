package BankOfJEE;

public class InvalidWithdrawRequest extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidWithdrawRequest() {
		super("Cannot withdraw Negative amount");
	}
}
