import java.util.Scanner;

public class Aufgabe8 {
    public static void aufgabe8() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Bitte gib die Seitenlänge ein.");
        int seitenlaenge = tastatur.nextInt();
        // int seitenlaenge = 5;
        String stern = "* ";
        for (int i = 0; i < seitenlaenge; i++) {
            String token = "  "; //
            if (i == 0 || i == seitenlaenge - 1) {
                token = "* ";
            }
            for (int j = 0; j < seitenlaenge; j++) {
                // System.out.print(token);
                if (j == 0 || j == seitenlaenge - 1) {
                    System.out.print(stern);
                    
                } else {
                    System.out.print(token); //
                }
            }

            System.out.println("");
        }
        tastatur.close();
    }
}
// Aufgabe 8: Quadrat
/*
 * Schreiben Sie ein Programm, dass die Seitenlänge eines Quadrats erfragt und
 * dann im Textmodus ein Quadrat dieser Größe ausgibt.
 * Anzahl: 3
 * 
 * * *
 * *
 * * *
 */