import java.util.Scanner;

public class Aufgabe5 {
    public static void aufgabe5() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Wieviele Jahre soll angelegt werden?");
        double jahre = tastatur.nextDouble();
        System.out.println("Wieviele Geld soll angelegt werden?");
        double anlageMenge = tastatur.nextDouble();
        System.out.println("Wie ist der Zinssatz p.A");
        double zinssatzPA = tastatur.nextDouble();
        double kapital = anlageMenge;
        double zinsen = 0;
        int counter = 0;

        while (counter < jahre) {
            zinsen = (kapital * zinssatzPA) / 100;
            kapital = zinsen + kapital;
            counter++;
        }
        System.out.printf("Ausgezahltes Kapital: %.2f Euro \n", kapital);

        tastatur.close();
    }
}
// Aufgabe 5: Zinseszins
/*
 * Es ist ein Programm zu erstellen, mit dem das Endkapital eines Sparvertrages
 * berechnet werden kann. Es wird einmalig, zu Beginn des Sparvertrags, eine
 * bestimmte Kapitalsumme angelegt. Der Sparvertrag läuft über eine bestimmte
 * Anzahl von Jahren, die neben der Anlagesumme und dem jährlichen Zinssatz, vom
 * Anwender einzugeben ist. Am Ende eines Jahres werden die Zinsen dem jeweils
 * vorhandenem Kapital zugeschlagen. Im darauffolgenden Jahr wird das gesamte
 * Kapital des Vorjahres (also mit den im Vorjahr erhaltenen Zinsen:
 * Zinseszinseffekt!) erneut verzinst, usw.
 * 
 * Beispielhafte Bildschirmausgabe des Programms:
 * 
 * Laufzeit (in Jahren) des Sparvertrags: 20
 * Wie viel Kapital (in Euro) möchten Sie anlegen: 10000
 * Zinssatz: 1,4
 * Eingezahltes Kapital: 10000.00 Euro
 * Ausgezahltes Kapital: 13205,63 Euro
 */