import java.util.Scanner;

public class Aufgabe9 {
    static void aufgabe9() {
        Scanner tastatur = new Scanner(System.in);
        char stern = '*';
        System.out.println("Wie hoch soll die Treppe sein?");
        int h = tastatur.nextInt();
        System.out.println("Stufenbreite?");
        int b = tastatur.nextInt();
        int stufen = b;
        int zeichenAnzahl = b * h;

        for (int i = 0; i < h; i++) {
            System.out.print(stern);
            char[] reihe = new char[zeichenAnzahl];
            for (int j = 0; j < zeichenAnzahl; j++) {
                if (j < stufen) {
                    reihe[j] = '#';
                } else {
                    reihe[j] = ' ';
                }
            }
            String treppe = "";
            for (int j = 0; j < reihe.length; j++) {
                treppe = reihe[j] + treppe;
            }
            System.out.println(treppe);
            stufen += b;
            System.out.println();
        }
        tastatur.close();
    }
}
// Aufgabe 9: Treppe
/*
 * Schreiben Sie ein Programm, das eine Treppe aus h Stufen einer bestimmten
 * Breite b in der folgenden Form zeichnet (Ausgabe von Leerzeichen und "*" auf
 * der Konsole): In diesem Beispiel ist h = 4 und b = 3. Nutzen Sie Schleifen.
 * Nur durch Änderung von h und b soll die Treppenform angepasst werden.
 * Beispiel:
 * Treppenhöhe: 4
 * Stufenbreite: 3
 * **
 * *****
 * ********
 * ***********
 */
