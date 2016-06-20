package no.mesan.kurs.enhetstesting;

public class BankAccountHandler {

	private final DepositMessengerService depositMessengerService;
	private final BankAccount account;

	public BankAccountHandler(BankAccount account, DepositMessengerService depositMessengerService) {
		if (account == null || depositMessengerService == null) {
			throw new NullPointerException();
		}

		this.account = account;
		this.depositMessengerService = depositMessengerService;
	}

	public boolean hasSufficientFunds(int amount) {
		return account.balance() >= amount;
	}

	public void deposit(int amount) {
		if (account.minimumDepositAmount() <= amount) {
			account.deposit(amount);
			depositMessengerService.send(account.owner(), amount);
		}
	}

	public void withdraw(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount.");
		} else if (amount <= account.balance()) {
			account.withdraw(amount);
		}
	}

}