import java.util.Scanner;

public class Aufgabe3 {
    public static void aufgabe3() {
        Scanner tastatur = new Scanner(System.in);
        int anzahlMaus;
        double einzelPreis;
        double gesamtNettoPreis;
        double bruttoPreis;

        System.out.println("Wieviele Mäuse werden bestellt?");
        anzahlMaus = tastatur.nextInt();
        System.out.println("Der Preis einer einzelnen Maus?");
        einzelPreis = tastatur.nextDouble();

        gesamtNettoPreis = einzelPreis * anzahlMaus;
        bruttoPreis = (gesamtNettoPreis / 100) * 119;
        if (anzahlMaus >= 10) {
            System.out.printf("Der Bruttopreis beträgt %.2f Euro", bruttoPreis);
        }
        else {
            bruttoPreis += 10;
            System.out.printf("Der Bruttopreis beträgt %.2f Euro", bruttoPreis);
        }
        tastatur.close();
    }
}

// Aufgabe 3: Hardware-Großhändler
/*
 * Ein Hardware-Großhändler möchte den Rechnungsbetrag einer Bestellung für
 * PC-Mäuse mit
 * einem Programm ermitteln. Wenn der Kunde mindestens 10 Mäuse bestellt,
 * erfolgt die
 * Lieferung frei Haus, bei einer geringeren Bestellmenge wird eine feste
 * Lieferpauschale von
 * 10 Euro erhoben. Vom Großhändler werden die Anzahl der bestellten Mäuse und
 * der
 * Einzelpreis eingegeben. Das Programm soll den Rechnungsbetrag (incl. MwSt.)
 * ausgeben.
 */