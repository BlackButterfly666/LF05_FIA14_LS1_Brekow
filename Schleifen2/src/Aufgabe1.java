import java.util.Scanner;

public class Aufgabe1 {
    public static void aufgabe1() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Nenne eine Zahl.");
        int zahlN = tastatur.nextInt();
        int count = 1;

        while (count < zahlN + 1) {
            System.out.print(count + " ");
            count++;
        }

        System.out.println(" ");

        count = zahlN;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        tastatur.close();
    }
}
// Aufgabe 1: Zählen
/*
 * Geben Sie in der Konsole die natürlichen Zahlen von 1 bis n heraufzählend
 * (bzw. von n bis 1 herunterzählend) aus. Ermöglichen Sie es dem Benutzer die
 * Zahl n festzulegen. Nutzen Sie zur Umsetzung eine while-Schleife.
 * a) 1, 2, 3, …, n while-Schleife
 * b) n, …, 3, 2, 1 while-Schleife
 */