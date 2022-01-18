import java.util.Scanner;

public class Aufgabe3 {
    static void aufgabe3() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Gib mir ein Wort, was ich rückwärts wiedergebe.");
        String palindrom[] = tastatur.nextLine().split("");

        for (int i = palindrom.length -1; i >= 0; i--) {
            System.out.print(palindrom[i]);
        }
        tastatur.close();
    }
}
// Aufgabe 3
/*
 * Im Programm „Palindrom“ werden über die Tastatur 5 Zeichen eingelesen und in
 * einem geeigneten Array gespeichert. Ist dies geschehen, wird der Arrayinhalt
 * in umgekehrter Reihenfolge (also von hinten nach vorn) auf der Konsole
 * ausgegeben.
 */