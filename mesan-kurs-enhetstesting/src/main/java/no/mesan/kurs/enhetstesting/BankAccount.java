package no.mesan.kurs.enhetstesting;

public interface BankAccount {
	int balance();

	void deposit(int amount);

	int minimumDepositAmount();

	String owner();

	void withdraw(int amount);
}
