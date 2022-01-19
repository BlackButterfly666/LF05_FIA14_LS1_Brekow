public class Aufgabe2 {
    static void aufgabe2(int zahlenArr[]) {

        for (int i = 0; i < (zahlenArr.length / 2); i++) {
            int arrlength = zahlenArr.length - i - 1;
            int buffer = zahlenArr[i];
            
            zahlenArr[i] = zahlenArr[arrlength];
            zahlenArr[arrlength] = buffer;
        }

        for (int i = 0; i < zahlenArr.length; i++) {
            System.out.print(zahlenArr[i] + " ");
        }
    }
}
// Aufgabe 2
/*
 * Schreiben Sie eine Methode, die einen Parameter erhält: ein Feld mit
 * ganzzahligen Werten. Die Methode soll die Reihenfolge der Elemente in dem
 * Feld umdrehen. Dabei darf kein zusätzliches Feld benutzt werden.
 * Hinweis: das erste Element muss mit dem letzten ausgetauscht werden, das
 * zweite mit dem vorletzten, ...
 */