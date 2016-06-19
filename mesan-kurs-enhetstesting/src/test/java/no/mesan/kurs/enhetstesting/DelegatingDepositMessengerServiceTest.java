package no.mesan.kurs.enhetstesting;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DelegatingDepositMessengerServiceTest {

	private DepositMessengerService depositMessengerService;

	@Mock
	private MessagingProvider delegate;

	@Before
	public void setUp() {
		depositMessengerService = new DelegatingDepositMessengerService(delegate);
	}

	@Test
	public void nonNullMessageWasSent() throws Exception {
		depositMessengerService.send("Foo Bar", 3000);
		verify(delegate).sendMessage(anyString());
	}
}