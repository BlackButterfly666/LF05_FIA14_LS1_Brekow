import java.util.Scanner;

public class Aufgabe2 {
    public static void aufgabe2() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Bitte gibt eine Zahl zwischen 1 und 12 ein.");
        int monat = tastatur.nextInt();

        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {
            switch (monat) {
                case 1:
                    System.out.println("Januar");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 2:
                    System.out.println("Februar");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 3:
                    System.out.println("März");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 4:
                    System.out.println("April");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 5:
                    System.out.println("Mai");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 6:
                    System.out.println("Juni");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 7:
                    System.out.println("Juli");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 8:
                    System.out.println("August");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 9:
                    System.out.println("September");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 10:
                    System.out.println("Oktober");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 11:
                    System.out.println("November");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                case 12:
                    System.out.println("Dezember");
                    korrekteEingabe = !korrekteEingabe;
                    break;
                default:
                    System.out.println("Falsche Eingabe. Bitte gib eine Zahl zwischen 1 und 12 ein.");
                    monat = tastatur.nextInt();
                    break;
            }
            tastatur.close();
        }
    }
}
// Aufgabe 2: Monate
/*
 * Der Benutzer gibt eine Ziffer zwischen 1 und 12 ein. Ihr Java-Programm
 * ermittelt den entsprechenden Monat.
 */