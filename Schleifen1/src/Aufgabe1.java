import java.util.Scanner;

public class Aufgabe1 {
    public static void aufgabe1() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Bis wohin soll ich zählen. Gib mir eine Zahl.");
        int zahlenBis = tastatur.nextInt();

        for (int i = 1; i < zahlenBis; i++) {
            System.out.print(i + ", " );
        }
        System.out.print(zahlenBis + "\n");
        for (int i = zahlenBis; i > 1; i--) {
            System.out.print(i + ", ");
        }
        System.out.print(1);

        tastatur.close();
    }
}
// Aufgabe 1: Zählen
/*
 * Geben Sie in der Konsole die natürlichen Zahlen von 1 bis n heraufzählend
 * (bzw. von n bis 1 herunterzählend) aus. Ermöglichen Sie es dem Benutzer die
 * Zahl n festzulegen. Nutzen Sie zur Umsetzung eine for-Schleife.
 * a) 1, 2, 3, …, n for-Schleife
 * b) n, …, 3, 2, 1 for-Schleife
 */