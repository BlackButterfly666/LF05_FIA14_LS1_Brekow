import java.util.Scanner;

public class Aufgabe6 {
    public static void aufgabe6() {
        Scanner tastatur = new Scanner(System.in);

        int jahre = 0;
        double zinsen = 0;
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {
            System.out.println("Wieviele Geld soll angelegt werden?");
            double anlageMenge = tastatur.nextDouble();
            System.out.println("Wie ist der Zinssatz p.A");
            double zinssatzPA = tastatur.nextDouble();
            double kapital = anlageMenge;

            while (kapital < 1000000) {
                zinsen = (kapital * zinssatzPA) / 100;
                kapital = zinsen + kapital;
                jahre++;
            }
            System.out.println("Nur " + jahre + " bis zur Million.");

            System.out.println("Soll ein weiterer Programmdurchlauf gestartet werden?");
            String durchlauf = tastatur.next();
            System.out.println(durchlauf);
            if (durchlauf.equals("j") || durchlauf.equals("J")) {
                
            } else {
                // || tastatur.next() == "n" || tastatur.next() == "N" ||
                System.out.println("Programm wird gestoppt.");
                korrekteEingabe = !korrekteEingabe;
            }
        }

        tastatur.close();

    }
}
// Aufgabe 6: Million
/*
 * Entwickeln Sie ein Programm, welches die Anzahl der Jahre berechnet, bis Sie
 * aufgrund einer einmaligen Einlage und einem konstanten Zinssatz Millionär
 * geworden sind. Die Höhe der Einlage und der Zinssatz sollen vom Benutzer
 * eingegeben werden. Die Anzahl der Jahre (auf ganze Jahre aufgerundet) soll
 * vom Programm ausgegeben werden. Nach der Ausgabe soll der Benutzer gefragt
 * werden, ob er einen weiteren Programmdurchlauf mit anderen Werten durchführen
 * möchte. Bestätigt er mit ‚j‘, wird eine weitere Rechnung durchgeführt, eine
 * Eingabe von ‚n‘ beendet das Programm.
 */