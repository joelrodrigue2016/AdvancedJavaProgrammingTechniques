package multithreading_in_Java;

/**
 * 
 * @author Joel
 *
 */
public class ATM {
	/**
	 * the synchronized keyword was added in order to run on thread at the time
	 * 
	 * @param account
	 * @param amount
	 */
	static synchronized void withdraw(BankAccount account, int amount) {
		int balance = account.getBalance();
		if ((balance - amount) < -account.getOverdraft()) {
			System.out.println("Transaction denied!");
		} else {
			account.debit(amount);
			System.out.println("$" + amount + " successfully withdrawn");
		}
		System.out.println("Current balance: " + account.getBalance());

	}

}
