package no.mesan.kurs.enhetstesting;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Before;
import org.junit.Test;

public class HighInterestAccountTest {

	private BankAccount account;

	@Before
	public void setUp() {
		account = new HighInterestAccount("Gorm Hedløy", 1000);
	}

	@Test
	public void initialBalanceIsZero() throws Exception {
		assertThat(account.balance()).isEqualTo(0);
	}

	@Test
	public void minimumDepositAmountIsSet() throws Exception {
		assertThat(account.minimumDepositAmount()).isEqualTo(1000);
	}

	@Test
	public void minimumDepositAmountIsPositive() throws Exception {
		assertThatThrownBy(() -> new HighInterestAccount("Erlend Kristiansen", -1))
				.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void depositLegalAmount() throws Exception {
		account.deposit(1500);
		assertThat(account.balance()).isEqualTo(1500);
	}

	@Test
	public void depositIllegalAmount() throws Exception {
		assertThatThrownBy(() -> account.deposit(500)).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void depositNegativeAmount() throws Exception {
		assertThatThrownBy(() -> account.deposit(-500)).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	public void owner() throws Exception {
		assertThat(account.owner()).isEqualTo("Gorm Hedløy");
	}

	@Test
	public void withdrawLegalAmount() throws Exception {
		account.deposit(2000);
		assertThat(account.balance()).isEqualTo(2000);

		account.withdraw(500);
		assertThat(account.balance()).isEqualTo(2000 - 500);
	}

	@Test
	public void withdrawMoreThanBalance() throws Exception {
		account.deposit(2000);
		assertThat(account.balance()).isEqualTo(2000);

		assertThatThrownBy(() -> account.withdraw(3000)).isInstanceOf(IllegalArgumentException.class);
		assertThat(account.balance()).isEqualTo(2000);

	}

	@Test
	public void withdrawNegativeAmount() throws Exception {
		account.deposit(2000);
		assertThat(account.balance()).isEqualTo(2000);

		assertThatThrownBy(() -> account.withdraw(-500)).isInstanceOf(IllegalArgumentException.class);
		assertThat(account.balance()).isEqualTo(2000);
	}
}