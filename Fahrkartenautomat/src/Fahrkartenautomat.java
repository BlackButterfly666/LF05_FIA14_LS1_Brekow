import java.util.Scanner;

class Fahrkartenautomat
{
    public static void main(String[] args)
    {
       Scanner tastatur = new Scanner(System.in);
      
       double zuZahlenderBetrag; 
       int anzahlTickets; 
       double eingezahlterGesamtbetrag;
       double eingeworfeneMünze;
       double rückgabebetrag;

       System.out.print("Zu zahlender Betrag (EURO): ");
       zuZahlenderBetrag = tastatur.nextDouble();
       System.out.print("Wieviele Tickets werden benötigt? ");
       anzahlTickets = tastatur.nextInt();

       // Berechnung Gesamtpreis der Tickets
       // -----------
       zuZahlenderBetrag *= anzahlTickets;
       //System.out.printf("Zu zahlender Betrag (EURO): \n%.2f\n", zuZahlenderBetrag);

       // Geldeinwurf
       // -----------
       eingezahlterGesamtbetrag = 0.0;
       while(eingezahlterGesamtbetrag < zuZahlenderBetrag)
       {
    	   System.out.printf("Noch zu zahlen: %.2f EURO\n",zuZahlenderBetrag - eingezahlterGesamtbetrag);
    	   System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
    	   eingeworfeneMünze = tastatur.nextDouble();
           eingezahlterGesamtbetrag += eingeworfeneMünze;
       }

       // Fahrscheinausgabe
       // -----------------
       System.out.println("\nFahrschein wird ausgegeben");
       for (int i = 0; i < 8; i++)
       {
          System.out.print("=");
          try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       System.out.println("\n\n");

       // Rückgeldberechnung und -Ausgabe
       // -------------------------------
       rückgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
       if(rückgabebetrag > 0.0)
       {
    	   System.out.printf("Der Rückgabebetrag in Höhe von %.2f EURO \n", rückgabebetrag);
    	   System.out.println("wird in folgenden Münzen ausgezahlt:");

           while(rückgabebetrag >= 2.0) // 2 EURO-Münzen
           {
        	  System.out.println("2 EURO");
	          rückgabebetrag -= 2.0;
           }
           while(rückgabebetrag >= 1.0) // 1 EURO-Münzen
           {
        	  System.out.println("1 EURO");
	          rückgabebetrag -= 1.0;
           }
           while(rückgabebetrag >= 0.5) // 50 CENT-Münzen
           {
        	  System.out.println("50 CENT");
	          rückgabebetrag -= 0.5;
           }
           while(rückgabebetrag >= 0.2) // 20 CENT-Münzen
           {
        	  System.out.println("20 CENT");
 	          rückgabebetrag -= 0.2;
           }
           while(rückgabebetrag >= 0.1) // 10 CENT-Münzen
           {
        	  System.out.println("10 CENT");
	          rückgabebetrag -= 0.1;
           }
           while(rückgabebetrag >= 0.05)// 5 CENT-Münzen
           {
        	  System.out.println("5 CENT");
 	          rückgabebetrag -= 0.05;
           }
       }

       System.out.println("\nVergessen Sie nicht, den Fahrschein\n"+
                          "vor Fahrtantritt entwerten zu lassen!\n"+
                          "Wir wünschen Ihnen eine gute Fahrt.");
    }
}

/*  A 2.5
    Aufgabe 1: Notieren Sie die Variablen, die im Quelltext deklariert werden, und die Datentypen dieser Variablen.
        Scanner tastatur = new Scanner(System.in);  => Scanner ist eine input-Abfrage
        double zuZahlenderBetrag;                   => double (doppelt genaue Gleitkommazahl, Größe von 8 byte
        double eingezahlterGesamtbetrag;            => double (doppelt genaue Gleitkommazahl, Größe von 8 byte
        double eingeworfeneMünze;                   => double (doppelt genaue Gleitkommazahl, Größe von 8 byte
        double rückgabebetrag;                      => double (doppelt genaue Gleitkommazahl, Größe von 8 byte
   
    Aufgabe 2: Welche Operationen werden mit den Variablen ausgeführt?
        Scanner tastatur = new Scanner(System.in);  -
        double zuZahlenderBetrag;                   wird gefüllt mit der Tastatureingabe vom Scanner, wird subtrahiert (arithmetische Operatoren), 
                                                    Vergleich zu 'kleiner als' (relationale Operatoren)
        double eingezahlterGesamtbetrag;            wird subtrahiert (arithmetische Operatoren), wird addiert (arithmetische Operatoren), 
                                                    Vergleich zu 'kleiner als' (relationale Operatoren)
        double eingeworfeneMünze;                   wird gefüllt mit der Tastatureingabe vom Scanner, wird addiert (arithmetische Operatoren)
        double rückgabebetrag;                      Vergleich zu 'größer als' (relationale Operatoren)

    Aufgabe 3: Ergänzen Sie das Programm so, dass nach Eingabe des Einzelpreises die Anzahl der Fahrkarten eingegeben werden kann:
        Ticketpreis (Euro): 2.5
        Anzahl der Tickets: 2
        Noch zu zahlen: 5.00 Euro

    Aufgabe 4: Anschließend testen Sie das Programm und - wenn alle Fehler korrigiert sind - übertragen Sie die aktuelle Version in Ihr Repository (Git: push).
        commit, da push keinen Sinn macht, wenn noch 2 Aufgaben bearbeitet werden
    
*/