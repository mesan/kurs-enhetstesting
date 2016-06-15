package no.mesan.kurs.enhetstesting;

public class BankAccountHandler {

	private final MessengerService messengerService;
	private final BankAccount account;

	public BankAccountHandler(BankAccount account, MessengerService messengerService) {
		if (account == null || messengerService == null) {
			throw new NullPointerException();
		}
		
		this.account = account;
		this.messengerService = messengerService;
	}

	public boolean hasSufficientFunds(int amount) {
		return account.balance() >= amount;
	}

	public void deposit(int amount) {
		if (account.minimumDepositAmount() <= amount) {
			account.deposit(amount);
			messengerService.send(account.owner(), amount);
		}
	}

}
