import java.util.Scanner;

public class Aufgabe4 {
    public static void aufgabe4() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Wie lautet der Bestellwert?");
        double bestellwert = tastatur.nextDouble();
        double bruttowert;

        bruttowert = (bestellwert / 100) * 119;

        if (bestellwert > 0 && bestellwert <= 100){
            bruttowert = (bruttowert/100) * 90;
        }
        else if (bestellwert > 100 && bestellwert < 500){
            bruttowert = ( bruttowert/ 100) * 85;
        }
        else {
            bruttowert = ( bruttowert/ 100) * 80;
        }

        System.out.printf("Der Bruttopreis beträgt %.2f Euro", bruttowert);
        tastatur.close();
    }
}
// Aufgabe 4: Rabattsystem
/*
 * Der Hardware-Großhändler führt ein Rabattsystem ein: Liegt der Bestellwert zwischen 0 und
 * 100 €, erhält der Kunde einen Rabatt von 10 %. Liegt der Bestellwert höher, aber insgesamt
 * nicht über 500 €, beträgt der Rabatt 15 %, in allen anderen Fällen beträgt der Rabatt 20 %.
 * Nach Eingabe des Bestellwertes soll der ermäßigte Bestellwert (incl. MwSt.) berechnet und
 * ausgegeben werden.
 */