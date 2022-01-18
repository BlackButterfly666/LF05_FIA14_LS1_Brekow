public class Aufgabe2 {
    static void aufgabe2() {
        int zahlen[] = new int[10];
        int count = 0;
        int i = 0;

        while (count < 20) {
            if (count % 2 != 0) {
                zahlen[i] = count;
                i++;
            }
            count++;
        }

        for (int j = 0; j < zahlen.length; j++) {
            System.out.print(zahlen[j] + " ");
        }
    }
}
// Aufgabe 2
/*
 * Das zu schreibende Programm „UngeradeZahlen“ ist ähnlich der Aufgabe 1. Sie
 * deklarieren wiederum ein Array mit 10 Ganzzahlen. Danach füllen Sie es mit
 * den ungeraden Zahlen von 1 bis 19 und geben den Inhalt des Arrays über die
 * Konsole aus (Verwenden Sie Schleifen!).
 */