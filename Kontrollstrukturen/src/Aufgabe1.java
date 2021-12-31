import java.util.Scanner;

public class Aufgabe1 {
    static Scanner tastatur = new Scanner(System.in);

    public static void aufgabe1() {
        int number1;
        int number2;
        int number3;

        System.out.print("Gib bitte Zahl 1 ein.");
        number1 = tastatur.nextInt();
        System.out.print("Gib bitte Zahl 2 ein.");
        number2 = tastatur.nextInt();
        System.out.print("Gib bitte Zahl 3 ein.");
        number3 = tastatur.nextInt();

        // 2. Wenn beide Zahlen gleich sind, soll eine Meldung ausgegeben werden (If)
        wennGleich(number1, number2);
        // 3. Wenn die 2. Zahl größer als die 1. Zahl ist, soll eine Meldung ausgegeben
        // werden (If)
        wennKleiner(number1, number2);
        // 4. Wenn die 1. Zahl größer oder gleich als die 2. Zahl ist, soll eine Meldung
        // ausgegeben werden, ansonsten eine andere Meldung (If-Else)
        wennGroesserGleich(number1, number2);
        // 1. Wenn die 1.Zahl größer als die 2.Zahl und die 3. Zahl ist, soll eine
        // Meldung ausgegeben werden (If mit && / Und)
        groesserAlsAndere(number1, number2, number3);
        // 2. Wenn die 3.Zahl größer als die 2.Zahl oder die 1. Zahl ist, soll eine Meldung
        // ausgegeben werden (If mit || / Oder)
        grosserAlsEine(number1, number2, number3);
        // 3. Geben Sie die größte der 3 Zahlen aus. (If-Else mit && / Und)
        findeGroesste(number1, number2, number3);
    }

    // Aufgabe 1: Eigene Bedingungen
    // 1. Nennen Sie Wenn-Dann-Aktivitäten aus ihrem Alltag.
    // WENN ich eine Schulwoche habe,
    // DANN muss ich früher aufstehen

    // WENN ich früher aufstehen sage,
    // DANN meine ich 4.30 Uhr

    // WENN ich hunger habe,
    // DANN esse ich etwas

    // WENN ich morgens mit dem Auto fahre UND es sehr kalt ist,
    // DANN muss ich meine Scheiben kratzen

    // 2.
    static void wennGleich(int Zahl1, int Zahl2) {
        if (Zahl1 == Zahl2) {
            System.out.println("beide Zahlen sind gleich");
        }
    }

    // 3.
    static void wennKleiner(int Zahl1, int Zahl2) {
        if (Zahl2 > Zahl1) {
            System.out.println("Zahl 2 ist größer als Zahl 1");
        }
    }

    // 4.
    static void wennGroesserGleich(int Zahl1, int Zahl2) {
        if (Zahl1 >= Zahl2) {
            System.out.println("Zahl 1 ist größer oder gleich groß wie Zahl 2");
        } else {
            System.out.println("Zahl 1 ist nicht größer oder gleich groß wie Zahl 2");
        }
    }

    // 1.
    static void groesserAlsAndere(int Zahl1, int Zahl2, int Zahl3) {
        if (Zahl1 > Zahl2 && Zahl1 > Zahl3) {
            System.out.println("Zahl 1 ist größer als die anderen beiden");
        }
    }

    // 2.
    static void grosserAlsEine(int Zahl1, int Zahl2, int Zahl3) {
        if (Zahl3 > Zahl2 || Zahl3 > Zahl1) {
            System.out.println("Zahl 3 ist größer als Zahl 2 oder Zahl 1");
        }
    }

    // 3.
    static void findeGroesste(int Zahl1, int Zahl2, int Zahl3) {
        if (Zahl1 >= Zahl2 && Zahl1 >= Zahl3) {
            System.out.println("Zahl 1 ist die Groesste Zahl");
        } else if (Zahl2 >= Zahl1 && Zahl2 >= Zahl3) {
            System.out.println("Zahl 2 ist die Groesste Zahl");
        } else {
            System.out.println("Zahl 3 ist die Groesste Zahl");
        }
    }
}
