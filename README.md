#Oppgaver til kurs i enhetstesting

##Oppgave 2:

Vi vil nå kunne sjekke at en konto har tilstrekkelig høy balanse til å ta ut et gitt beløp. Derfor må vi skrive tester og handlermetoden

	 public boolean hasSufficientFunds(int amount)

For denne funksjonaliteten så trenger handleren vår en avhengighet i form av en `BankAccount`. Denne skal initialiseres gjennom handleren sin konstruktør.

####Skriv 2 tester:

 1. Der du verifiserer at dersom man initialiserer handleren med en konto som er `null`, så skal handleren kaste en `NullPointerException`.
 2. Der du verifiserer at handleren kan sjekke om kontoen den er initialisert med har tilstrekkelige midler til å ta ut et gitt beløp. Du kan trenge å lage en stub for `BankAccount.balance`.

Hint:  [https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#exception-assertion](https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#exception-assertion)
Hint: [http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#2](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#2)

----------

> Written with [StackEdit](https://stackedit.io/).
