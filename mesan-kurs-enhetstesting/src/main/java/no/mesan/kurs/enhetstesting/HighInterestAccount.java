package no.mesan.kurs.enhetstesting;

public class HighInterestAccount implements BankAccount {

	private final String owner;
	private final int minimumDepositAmount;
	
	private int balance = 0;

	public HighInterestAccount(String owner, int minimumDepositAmount) {
		if (minimumDepositAmount < 0) {
			throw new IllegalArgumentException("Minimum deposit amount must be non-negative.");
		}
		this.owner = owner;
		this.minimumDepositAmount = minimumDepositAmount;
	}

	@Override
	public int balance() {
		return balance;
	}

	@Override
	public void deposit(int amount) {
		if (amount < minimumDepositAmount()) {
			throw new IllegalArgumentException("Deposit amount smaller than minimum.");
		}
		this.balance = amount;
	}

	@Override
	public int minimumDepositAmount() {
		return minimumDepositAmount;
	}

	@Override
	public String owner() {
		return owner;
	}

	@Override
	public void withdraw(int amount) {
		if (amount > balance()) {
			throw new IllegalArgumentException("Cannot withdraw more money than current balance.");
		} else if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw negative amount.");
		}
		balance -= amount;
	}

}
