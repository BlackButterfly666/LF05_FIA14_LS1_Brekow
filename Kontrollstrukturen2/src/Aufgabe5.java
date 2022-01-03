import java.util.Scanner;

public class Aufgabe5 {
    public static void aufgabe5() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Bitte gib ein, welcher Wert berechnet werden soll. ( Eingabe: R, U, I)");
        char ergebnis = Character.toLowerCase(tastatur.next().charAt(0));
        double wertR;
        double wertU;
        double wertI;
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {

            switch (ergebnis) {
                case 'r':
                    System.out.println("Bitte gib den Wert für 'U' ein.");
                    wertU = tastatur.nextDouble();
                    System.out.println("Bitte gib den Wert für 'I' ein.");
                    wertI = tastatur.nextDouble();
                    korrekteEingabe = !korrekteEingabe;
                    wertR = wertU / wertI;
                    System.out.printf("R = U/I -> %.2f = %.2f / %.2f\n", wertR, wertU, wertI);
                    System.out.println(wertR + " Ohm");
                    break;
                case 'u':
                    System.out.println("Bitte gib den Wert für 'R' ein.");
                    wertR = tastatur.nextDouble();
                    System.out.println("Bitte gib den Wert für 'I' ein.");
                    wertI = tastatur.nextDouble();
                    korrekteEingabe = !korrekteEingabe;
                    wertU = wertR * wertI;
                    System.out.printf("U = R*I -> %.2f = %.2f * %.2f\n", wertU, wertR, wertI);
                    System.out.println(wertU + " Volt");
                    break;
                case 'i':
                    System.out.println("Bitte gib den Wert für 'R' ein.");
                    wertR = tastatur.nextDouble();
                    System.out.println("Bitte gib den Wert für 'U' ein.");
                    wertU = tastatur.nextDouble();
                    korrekteEingabe = !korrekteEingabe;
                    wertI = wertU / wertR;
                    System.out.printf("I = U/R -> %.2f = %.2f / %.2f\n", wertI, wertU, wertR);
                    System.out.println(wertI + " Ampere");
                    break;
                default:
                    System.out.println("inkorrekte Eingabe. Welcher Wert soll berechnet werden. ( Eingabe: R, U, I)");
                    ergebnis = Character.toLowerCase(tastatur.next().charAt(0));
                    break;
            }
        }
        tastatur.close();
    }
}

// Aufgabe 5: Ohmsches Gesetz
/*
 * Nach dem Ohmschen Gesetz berechnet sich der Widerstand eines ohmschen
 * Widerstandes mit: 𝑅 = 𝑈 / 𝐼
 * Schreiben Sie ein Programm, in das der Benutzer zunächst über die Eingabe der
 * Buchstaben R, U oder I auswählen kann, welche Größe berechnet werden soll.
 * Gibt er einen falschen Buchstaben ein, soll eine Meldung über die Fehleingabe
 * erfolgen. Anschließend soll er die Werte der fehlenden Größen eingeben. Am
 * Ende gibt das Programm den Wert der gesuchten Größe mit der richtigen Einheit
 * aus.
 */