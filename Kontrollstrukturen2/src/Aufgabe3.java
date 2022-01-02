import java.util.Scanner;

public class Aufgabe3 {
    public static void aufgabe3() {
        Scanner tastatur = new Scanner(System.in);
        // char zeichen = tastatur.next().charAt(0);

        System.out.println("Bitte gib ein i, v, x, l, c, d oder m ein.");
        char zeichen = Character.toLowerCase(tastatur.next().charAt(0));
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {

            switch (zeichen) {
                case 'i':
                    System.out.println("1,00");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 'v':
                    System.out.println("5,00");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 'x':
                    System.out.println("10,00");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 'l':
                    System.out.println("50,00");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 'c':
                    System.out.println("100,00");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 'd':
                    System.out.println("500,00");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 'm':
                    System.out.println("1000,00");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                default:
                    System.out.println("Das war kein korrektes Zeichen. Bitte gib ein i, v, x, l, c, d oder m ein.");
                    zeichen = Character.toLowerCase(tastatur.next().charAt(0));
                    break;
            }
            tastatur.close();
        }
    }
}
// Aufgabe 3: Römische Zahlen
/*
 * Erstellen Sie die Konsolenanwendung Rom. Das Programm Rom soll nach der
 * Eingabe eines römischen Zahlzeichens die entsprechende Dezimalzahl ausgeben
 * (I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000). Falls ein anderes
 * Zeichen eingegeben wird, soll ein entsprechender Hinweis ausgegeben werden.
 */
