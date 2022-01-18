import java.util.Scanner;

public class Aufgabe8 {
    public static void aufgabe8() {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Zahl zwischen 2 und 9 ein: ");
        int eingabe = tastatur.nextInt();
        String input = String.valueOf(eingabe);

        int reihe = 0;
        int spalte = 0;
        int counter = 0;

        while (spalte <= 9) {
            while (reihe <= 9) {
                int quersumme = spalte + reihe;

                if (String.valueOf(counter).contains(input)) {
                    System.out.printf(" %2s ", "*");
                } else if (counter % eingabe == 0) {
                    System.out.printf(" %2s ", "*");
                } else if (quersumme == eingabe) {
                    System.out.printf(" %2s ", "*");
                } else {
                    System.out.printf(" %2d ", counter);
                }
                counter++;
                reihe++;
            }
            System.out.println("");
            spalte++;
            reihe = 0;
        }
        tastatur.close();
    }
}