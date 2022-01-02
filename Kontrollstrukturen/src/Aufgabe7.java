import java.util.Scanner;

public class Aufgabe7 {
    public static void aufgabe7() {
        Scanner tastatur = new Scanner(System.in);

        System.out.println("Möchtest du [B]uchstaben oder [Z]ahlen eingeben?");
        String inputArt = tastatur.next();
        System.out.println("Gib bitte ein Zeichen (Buchstabe, Ziffer) ein. ( 0 / 3)");
        String zeichen1 = tastatur.next();
        System.out.println("Gib bitte ein Zeichen (Buchstabe, Ziffer) ein. ( 1 / 3)");
        String zeichen2 = tastatur.next();
        System.out.println("Gib bitte ein Zeichen (Buchstabe, Ziffer) ein. ( 2 / 3)");
        String zeichen3 = tastatur.next();

        // if (zeichen1 > zeichen2 && zeichen1 > zeichen3) {
        //     // zeichen1 am größten
        //     if (zeichen2 > zeichen3) {
        //         // zeichen1 > zeichen2 > zeichen3;
        //     } else
        //         // zeichen1 > zeichen3 > zeichen2;
        //         System.out.println();
        // }
        // else
        // {

        // }
        tastatur.close();
    }
}

// Aufgabe 7: Sortieren
/*
 * Erstellen Sie die Konsolenanwendung Sortiere_abc. Das Programm Sortiere_abc
 * soll drei Zeicheneingaben (z. B. Buchstaben, Ziffern) vom Benutzer erwarten.
 * Anschließend soll das Programm die drei eingegebenen Zeichen in aufsteigender
 * Reihenfolge ausgeben.
 */