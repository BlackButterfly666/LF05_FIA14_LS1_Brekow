import java.util.Scanner;

public class Aufgabe6 {
    public static void aufgabe6() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Wie groß ist x?");
        double x = tastatur.nextDouble();
        double e = 2.718;

        if (x <= 0) {
            x = e * x;
            System.out.printf("x = %.2f, exponentiell", x);
        } 
        else if (x > 0 && x <= 3) {
            x = (x * x) + 1;
            System.out.printf("x = %.2f, quadratisch", x);
        } 
        else {
            x = 2 * x + 4;
            System.out.printf("x = %.2f, linear", x);
        }
        tastatur.close();
    }
}

//
/*
 * Eine Funktion y = f(x) ist in folgenden Bereichen definiert:
 * x ≤ 0 | f(x) = ex | exponentiell
 * 0 < x ≤ 3 | f(x) = x2 + 1 | quadratisch
 * x > 3 | f(x) = 2  x + 4 | linear
 * Man lese einen Wert für x ein und gebe den Funktionswert zusammen mit der
 * Meldung aus, in welchem Bereich sich der Wert befindet (konstant, linear,
 * ...).
 * Für die Eulersche Zahl e verwenden sie eine Konstante mit dem Wert 2,718.
 */