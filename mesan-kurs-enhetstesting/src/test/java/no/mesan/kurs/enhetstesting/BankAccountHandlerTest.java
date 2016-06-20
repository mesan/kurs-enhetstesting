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
		fail("Løs oppgave 2.");
	}

	@Test
	public void canCheckForSufficientFunds() throws Exception {
		fail("Løs oppgave 2.");
	}
}