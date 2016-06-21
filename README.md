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

##Oppgave 3:

Vi vil nå kunne sette inn penger på kontoen vår. Derfor må vi skrive tester og handlermetoden

	 public void deposit(int amount)

####Skriv 2 tester:

 1. Der man setter inn et lovlig beløp. Verifisér at metoden `deposit` blir kalt på kontoobjektet med det gitte beløpet.
 2. Der man setter inn mindre penger enn kontoen sin `minimumDepositAmount`. Dette skal medføre at ingen deposit-metode blir kalt på kontoobjektet vårt.

Hint:  [http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#4](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#4)

## [Oppgave 4] [oppgave-4]
## [Oppgave 5] [oppgave-5]
----------

> Written with [StackEdit](https://stackedit.io/).

[oppgave-1]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-1
[oppgave-2]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-2
[oppgave-3]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-3
[oppgave-4]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-4
[oppgave-5]: https://github.com/mesan/kurs-enhetstesting/tree/oppgave-5
