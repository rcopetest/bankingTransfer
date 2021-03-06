package BankOfJEE;

public class Receipt {
	double currentBalance;
	double amount;
	int transactionAmount;
	boolean transactionSuccess;
	int transactionID;
	
	public Receipt(double amount, boolean transactionSuccess, double currentBalance){
		this.amount = amount;
		this.currentBalance = currentBalance;
		this.transactionSuccess = transactionSuccess;
	}
	
	public void printReceipt(){
		System.out.println("***** Your Receipt *****");
		System.out.println("Transaction Request amount: " + amount);
		System.out.println("Current Balance: " + currentBalance);
		System.out.println("Transaction Made: " + transactionSuccess);
	}

	
}
