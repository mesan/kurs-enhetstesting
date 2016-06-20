package no.mesan.kurs.enhetstesting;

import static org.assertj.core.api.Assertions.*;
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

	@Before
	public void setUp() {
		handler = new BankAccountHandler(account);
	}

	@Test
	public void testIsInitialized() throws Exception {
		assertThat(handler).isNotNull();
	}

	@Test
	public void initializedWithNullThrowsException() throws Exception {
		assertThatThrownBy(() -> new BankAccountHandler(null))
				.isInstanceOf(NullPointerException.class);
	}

	@Test
	public void canCheckForSufficientFunds() throws Exception {
		when(account.balance()).thenReturn(2000);

		assertThat(handler.hasSufficientFunds(1000)).isTrue();
	}

	@Test
	public void depositLegalAmount() throws Exception {
		fail("Løs oppgave 3.");
	}

	@Test
	public void depositIllegalAmount() throws Exception {
		fail("Løs oppgave 3.");
	}
}