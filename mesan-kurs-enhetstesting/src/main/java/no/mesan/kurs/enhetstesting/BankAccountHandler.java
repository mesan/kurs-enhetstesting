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

}