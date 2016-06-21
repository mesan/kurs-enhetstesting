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
## [Oppgave 2] [oppgave-2]
## [Oppgave 3] [oppgave-3]
## [Oppgave 4] [oppgave-4]

##Oppgave 5:

Vi ønsker nå å kunne ta ut penger fra en konto, så du må skrive tester og funksjonalitet for dette. Vi vil ende opp med en metode i `BankAccountHandler` som har denne signaturen:

    public void withdraw(int amount)

####Skriv 3 tester:

 1. Der man tar ut et lovlig beløp i forhold til balansen. Dette skal medføre at man kaller `withdraw` med det lovlige beløpet på kontoobjektet.
 2. Der man tar ut et beløp som er for stort i forhold til balansen. Dette skal IKKE medføre at man kaller `withdraw` på kontoobjektet.
 3. Der man tar ut et beløp som er negativt. Dette skal medføre at det blir kastet et `IllegalArgumentException` fra handleren. Heller ikke her skal kontoobjektet røres.

## [Fullstendig løsningsforslag] [losning]
----------

> Written with [StackEdit](https://stackedit.io/).

[oppgave-1]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-1
[oppgave-2]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-2
[oppgave-3]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-3
[oppgave-4]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-4
[oppgave-5]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-5
[losning]: https://github.com/mesan/kurs-enhetstesting/tree/losning
