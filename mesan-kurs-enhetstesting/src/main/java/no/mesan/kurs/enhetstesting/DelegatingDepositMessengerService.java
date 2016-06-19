package no.mesan.kurs.enhetstesting;

public class DelegatingDepositMessengerService implements DepositMessengerService {

	private final MessagingProvider messagingProvider;

	public DelegatingDepositMessengerService(MessagingProvider delegate) {
		this.messagingProvider = delegate;
	}

	@Override
	public void send(String owner, int amount) {
		messagingProvider.sendMessage(
				"Dear " + owner + ",\n\nThe amount of " + amount + " was deposited to your account.\n\n- The Bank");
	}

}