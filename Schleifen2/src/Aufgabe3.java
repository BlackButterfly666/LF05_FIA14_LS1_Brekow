import java.util.Scanner;

public class Aufgabe3 {
    public static void aufgabe3() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Quersumme von ");
        String[] summe = tastatur.next().split("");

        int zahl;
        int quersumme = 0;;

        for (int i = 0; i < summe.length; i++) {
            zahl = Integer.parseInt(summe[i]);
            quersumme += zahl;
        }
        System.out.println("Die Quersumme lautet " + quersumme);
        tastatur.close();
    }
}

// Aufgabe 3: Quersumme
/*
 * Berechnen Sie die Quersumme einer vorgegebenen ganzen Zahl. Die Quersumme
 * einer Zahl ist die Summe aller ihrer Ziffern.
 * Tipp: Nutzen Sie den Modulo Operator.
 * Geben sie bitte eine Zahl ein: 12345
 * Die Quersumme beträgt: 15
 */