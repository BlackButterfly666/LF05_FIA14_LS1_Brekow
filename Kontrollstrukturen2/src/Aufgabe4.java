import java.util.Scanner;

public class Aufgabe4 {
    public static void aufgabe4() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Bitte gib die erste Zahl ein.");
        double zahl1 = tastatur.nextDouble();
        System.out.println("Bitte gib die zweite Zahl ein.");
        double zahl2 = tastatur.nextDouble();
        System.out.println("Bitte gib Rechenoperator ein. (+, -, *, /)");
        String operator = tastatur.next();
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {
            switch (operator) {
                case "+":
                    System.out.println("Das Ergebnis ist " + (zahl1 + zahl2));
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case "-":
                    System.out.println("Das Ergebnis ist " + (zahl1 - zahl2));
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case "*":
                    System.out.println("Das Ergebnis ist " + (zahl1 * zahl2));
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case "/":
                    System.out.println("Das Ergebnis ist " + (zahl1 / zahl2));
                    korrekteEingabe = !korrekteEingabe;
                    break;
                default:
                    System.out.println("Bitte gib Rechenoperator ein. (+, -, *, /)");
                    operator = tastatur.next();
                    break;
            }
        }
        tastatur.close();
    }
}

// Aufgabe 4: Taschenrechner
/*
 * Der Benutzer soll zwei Zahlen in das Programm eingeben, danach soll er
 * entscheiden, ob die Zahlen addiert, subtrahiert, multipliziert oder dividiert
 * werden, diese Entscheidung soll über die Eingabe der folgenden Symbole
 * getätigt werden: +, -, *, / Nach der Auswahl soll das Ergebnis der Rechnung
 * ausgegeben werden, bzw. eine Fehlermeldung, falls eine falsche Auswahl
 * getroffen wurde.
 */
