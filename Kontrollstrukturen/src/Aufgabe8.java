import java.util.Scanner;

public class Aufgabe8 {
    public static void aufgabe8() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Welches Jahr möchtest du prüfen, ob es ein Schaltjahr ist?");
        int jahr = tastatur.nextInt();

        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                if (jahr % 400 == 0) {
                System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
                }
            }
            else {
                System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr.");
            }
        }
        tastatur.close();
    }
}

// Aufgabe 8: Schaltjahr
/*
 * Entwickeln Sie ein Programm, welches ausgibt, ob das eingegebene Jahr ein
 * Schaltjahr ist.
 * Regel 1: Ist eine Jahreszahl ganzzahlig durch 4 teilbar, dann ist das Jahr
 * ein
 * Schaltjahr mit 366 Tagen.
 * Beispiele: 1980, 1972, 1720 waren Schaltjahre
 * 
 * Regel 2: Ausnahme von Regel 1 sind alle Jahreszahlen, die nach Regel 1 ein
 * Schaltjahr
 * sind, aber deren Jahreszahl ganzzahlig durch 100 teilbar sind.
 * Beispiele: 1700, 1800 und 1900 oder ferner 2100 sind keine Schaltjahre.
 * 
 * Regel 3: Ausnahme von Regel 2 sind alle Jahreszahlen, die nach Regel 2 kein
 * Schaltjahr
 * sind, aber deren Jahreszahl ganzzahlig durch 400 teilbar.
 * Beispiele: 1600 und 2000 waren Schaltjahre zu 366 Tagen.
 * 
 * oder eine einfach zu merkende Regel:
 * 
 * - Ein Schaltjahr ist alle vier Jahre (1992 und 1996 waren z.B. Schaltjahre),
 * - alle hundert Jahre nicht (1700 und 1800 waren keine Schaltjahre),
 * - und alle vierhundert Jahre doch (2000 war doch ein Schaltjahr),
 * - Dummerweise wurde diese Regelung erst 1582 eingeführt, d.h. davor galt nur
 * Regel1,
 * - Eingeführt wurden Schaltjahre im heutigen Sinne durch Julius Cäsar 45 v.
 * Chr.
 * 
 * Das Programm soll vom Benutzer eine Jahreszahl abfragen. Am Ende des
 * Programms soll
 * ausgegeben werden, ob es sich um ein Schaltjahr handelt oder nicht.
 */