#Oppgaver til kurs i enhetstesting

##Oppgave 3:

Vi vil nå kunne sette inn penger på kontoen vår. Derfor må vi skrive tester og handlermetoden

	 public void deposit(int amount)

####Skriv 2 tester:

 1. Der man setter inn et lovlig beløp. Verifisér at metoden `deposit` blir kalt på kontoobjektet med det gitte beløpet.
 2. Der man setter inn mindre penger enn kontoen sin `minimumDepositAmount`. Dette skal medføre at ingen deposit-metode blir kalt på kontoobjektet vårt.

Hint:  [http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#exact_verification](http://site.mockito.org/mockito/docs/current/org/mockito/Mockito.html#exact_verification)

----------

> Written with [StackEdit](https://stackedit.io/).
