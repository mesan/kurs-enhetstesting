package no.mesan.kurs.enhetstesting;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BankAccountHandlerTest {

	private BankAccountHandler handler;

	@Mock
	private BankAccount account;

	@Mock
	private MessengerService messengerService;

	@Before
	public void setUp() {
		handler = new BankAccountHandler(account, messengerService);
	}

	@Test
	public void testIsInitialized() throws Exception {
		assertThat(handler).isNotNull();
	}

	@Test
	public void initializedWithNullThrowsException() throws Exception {
		assertThatThrownBy(() -> new BankAccountHandler(null, messengerService))
				.isInstanceOf(NullPointerException.class);

		assertThatThrownBy(() -> new BankAccountHandler(account, null))
				.isInstanceOf(NullPointerException.class);
	}

	@Test
	public void retrievesBalanceWhileCheckingForSufficientFunds() throws Exception {
		when(account.balance()).thenReturn(2000);

		assertThat(handler.hasSufficientFunds(1000)).isTrue();

		verify(account).balance();
	}

	@Test
	public void depositLegalAmount() throws Exception {
		when(account.minimumDepositAmount()).thenReturn(100);

		handler.deposit(500);

		verify(account).deposit(500);
	}

	@Test
	public void depositIllegalAmount() throws Exception {
		when(account.minimumDepositAmount()).thenReturn(1000);

		handler.deposit(500);

		verify(account, never()).deposit(anyInt());
	}

	@Test
	public void messageIsSentToOwnerOnDeposit() throws Exception {
		when(account.minimumDepositAmount()).thenReturn(1000);
		when(account.owner()).thenReturn("Foo Bar");

		handler.deposit(5000);

		verify(messengerService).send("Foo Bar", 5000);
	}

	@Test
	public void withdrawLegalAmount() throws Exception {
		when(account.balance()).thenReturn(500);

		// handler.withdraw(account, 100);
	}

}
