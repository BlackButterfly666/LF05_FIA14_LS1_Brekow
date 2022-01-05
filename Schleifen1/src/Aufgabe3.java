public class Aufgabe3 {
    public static void aufgabe3() {
        
        for (int i = 1; i < 201; i++) {
            int x = i;
            if (x%7 == 0){
                if (x%5 != 0 && x%4 == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}

// Aufgabe 3: Modulo
/*
 * Schreibe ein Programm, das für alle Zahlen zwischen 1 und 200 testet:
 * - ob sie durch 7 teilbar sind.
 * - nicht durch 5 aber durch 4 teilbar sind.
 * Lasse jeweils die Zahlen, auf die die Bedingungen zutreffen ausgeben.
 */