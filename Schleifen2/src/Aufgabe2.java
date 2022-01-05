import java.util.Scanner;

public class Aufgabe2 {
    public static void aufgabe2() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl zwischen 0 und 20 ein.");
        int zahlN = tastatur.nextInt();
        int fakultaet = 1; // außerhalb der Schleife anlegen und Wert zuweisen
        boolean korrekteEingabe = false;

        while (!korrekteEingabe){
            if (zahlN >= 0 && zahlN <= 20){
                
                for (int i = 1; i <= zahlN; ++i) {
                    fakultaet = fakultaet * i;
                }
                System.out.println("Die Fakultät ist: " + fakultaet);
                korrekteEingabe = !korrekteEingabe;
            }
            else {
                System.out.println("Die Zahl soll zwischen 0 und 20 liegen.");
                zahlN = tastatur.nextInt();
            }
        }
        tastatur.close();
    }

}
// Aufgabe 2: Fakultät
/*
 * Schreiben Sie ein Programm, das zu einer Zahl n <= 20 die Fakultät n!
 * ermittelt. Es gilt:
 * n! = 1 * 2 * ... * (n-1) * n sowie 0! = 1
 * z.B. ist 3! = 1 * 2 * 3 = 6
 */