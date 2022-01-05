public class Aufgabe5 {
    public static void aufgabe5() {

        int zaehler1 = 0;
        int zaehler2 = 0;

        while (zaehler1 < 10) {
            zaehler1 = zaehler1 + 1;
            zaehler2 = 0;
            while (zaehler2 < 10) {
                zaehler2 = zaehler2 + 1;
                System.out.print("  " + zaehler1 * zaehler2);
            }
            System.out.println();
        }
    }
}
// Aufgabe 5: Einmaleins
/*
 * Sie sollen ein Programm entwickeln, welches das kleine
 * Einmaleins (1x1, 1x2 … bis 10x10) auf dem Bildschirm
 * ausgibt.
 */