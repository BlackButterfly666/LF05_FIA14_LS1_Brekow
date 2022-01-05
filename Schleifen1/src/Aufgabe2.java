import java.util.Scanner;

public class Aufgabe2 {
    public static void aufgabe2() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Bis wohin soll ich zählen. Gib mir eine Zahl 'n'.");
        int zahlN = tastatur.nextInt();
        int summe = 0;

        // ---- a) 1 + 2 + 3 + 4 +…+ n
        for (int i = 1; i <= zahlN; i++) {
            summe += i;
        }
        System.out.println("Die Summe für A beträgt: " + summe);
        
        summe = 0;
        // ---- b) 2 + 4 + 6 +…+ 2n
        for (int j = 1; j < zahlN + 1; j++) {
            int x = j + j;
            summe += x;
        }
        System.out.println("Die Summe für B beträgt: " + summe);
        
        summe = 0;
        // ---- c) 1 + 3 + 5 +…+ (2n+1)
        for (int k = 0; k < zahlN; k++) {
            int x = (k * 2) + 1;
            summe += x;
        }
        System.out.println("Die Summe für C beträgt: " + summe);
        tastatur.close();
    }
}
// Aufgabe 2: Summe
/*
 * Geben Sie in der Konsole die Summe der Zahlenfolgen aus. Ermöglichen Sie es
 * dem Benutzer die Zahl n festzulegen, welche die Summierung begrenzt.
 * a) 1 + 2 + 3 + 4 +…+ n for-Schleife / while-Schleife
 * b) 2 + 4 + 6 +…+ 2n for-Schleife / while-Schleife
 * c) 1 + 3 + 5 +…+ (2n+1) for-Schleife / while-Schleife
 * Programmausgabe:
 * Geben Sie bitte einen begrenzenden Wert ein: 6
 * Die Summe für A beträgt: 21
 * Die Summe für B beträgt: 42
 * Die Summe für C beträgt: 36
 */