import java.util.Scanner;

public class Aufgabe1 {
    public static void aufgabe1() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl als Note ein. (Eingabe Zahlen: 1-6)");
        int note = tastatur.nextInt();
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {
            switch (note) {
                case 1:
                    System.out.println("Sehr gut");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 2:
                    System.out.println("Gut");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 3:
                    System.out.println("Befriedigend");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 4:
                    System.out.println("Ausreichend");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 5:
                    System.out.println("Mangelhaft");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 6:
                    System.out.println("Ungenügend");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                default:
                    System.out.println("Falsche Eingabe. Bitte gib eine Zahl zwischen 1 und 6 ein.");
                    note = tastatur.nextInt();
                    break;
            }
            tastatur.close();
        }
    }
}

// Aufgabe 1: Noten
/*
 * Erstellen Sie die Konsolenanwendung Noten. Das Programm Noten soll nach der
 * Eingabe einer Ziffer die sprachliche Umschreibung ausgeben
 * (1 = Sehr gut, 2 = Gut, 3 = Befriedigend, 4 = Ausreichend, 5 = Mangelhaft, 6
 * = Ungenügend).
 * Falls eine andere Ziffer eingegeben wird, soll ein entsprechender
 * Fehlerhinweis ausgegeben werden.
 */