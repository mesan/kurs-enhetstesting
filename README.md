#Oppgaver til kurs i enhetstesting

##Forutsetninger

 - [Git](https://git-scm.com/)
 - [JDK 8+](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
 - [Maven](https://maven.apache.org/)

## Ressurser

 - [https://en.wikipedia.org/wiki/JUnit](https://en.wikipedia.org/wiki/JUnit)
 - [https://joel-costigliola.github.io/assertj/assertj-core-quick-start.html](https://joel-costigliola.github.io/assertj/assertj-core-quick-start.html)
 - [http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html)
 - [http://martinfowler.com/articles/mocksArentStubs.html](http://martinfowler.com/articles/mocksArentStubs.html)

## [Oppgave 1] [oppgave-1]

##Oppgave 2:

Vi vil nå kunne sjekke at en konto har tilstrekkelig høy balanse til å ta ut et gitt beløp. Derfor må vi skrive tester og handlermetoden

	 public boolean hasSufficientFunds(int amount)

For denne funksjonaliteten så trenger handleren vår en avhengighet i form av en `BankAccount`. Denne skal initialiseres gjennom handleren sin konstruktør.

####Skriv to tester:

 1. Der du verifiserer at dersom man initialiserer handleren med en konto som er `null`, så skal handleren kaste en `NullPointerException`.
 2. Der du verifiserer at handleren kan sjekke om kontoen den er initialisert med har tilstrekkelige midler til å ta ut et gitt beløp. Du kan trenge å lage en stub for `BankAccount.balance`.

Hint:  [https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#exception-assertion](https://joel-costigliola.github.io/assertj/assertj-core-features-highlight.html#exception-assertion)  
Hint: [http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#2](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#2)

## [Oppgave 3] [oppgave-3]
## [Oppgave 4] [oppgave-4]
## [Oppgave 5] [oppgave-5]
----------

> Written with [StackEdit](https://stackedit.io/).

[oppgave-1]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-1
[oppgave-2]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-2
[oppgave-3]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-3
[oppgave-4]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-4
[oppgave-5]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-5
