public class Aufgabe1 {
    static void aufgabe1() {
        int zahlen[] = new int[10];

        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = i;
        }

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}

// Aufgabe 1
/*
 * Schreiben Sie ein Programm „Zahlen“, in welchem ein ganzzahliges Array der
 * Länge 10 deklariert wird. Anschließend wird das Array mittels Schleife mit
 * den Zahlen von 0 bis 9 gefüllt. Zum Schluss geben Sie die Elemente des Arrays
 * wiederum mit einer Schleife auf der Konsole aus.
 */