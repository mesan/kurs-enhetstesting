package no.mesan.kurs.enhetstesting;

public class BankAccountHandler {

	private final BankAccount account;

	public BankAccountHandler(BankAccount account) {
		if (account == null) {
			throw new NullPointerException();
		}

		this.account = account;
	}

	public boolean hasSufficientFunds(int amount) {
		return account.balance() >= amount;
	}

	public void deposit(int amount) {
		if (account.minimumDepositAmount() <= amount) {
			account.deposit(amount);
		}
	}

}