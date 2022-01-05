public class Aufgabe4 {
    public static void aufgabe4() {

        // // * a) 99, 96, 93, … 12, 9
        for (int i = 33; i > 2; i--) {
            int x = i * 3;
            System.out.print(x + " ");
        }
        
        System.out.println(" \n");
        
        int summe = 0;
        // // * b) 1, 4, 9, 16, 25, … 361, 400
        for (int j = 0; j < 20; j++) {
            int x = (j * 2) + 1;
            summe += x;
            System.out.print(summe + " ");
        }
        
        System.out.println(" \n");

        // * c) 2, 6, 10, 14, … 98, 102
        for (int k = 0; k < 26; k++) {
            int x = (k * 2) + 1;
            System.out.print((x = x * 2) + " ");
        }
        
        System.out.println(" \n");

        // * d) 4, 16, 36, 64, 100 … 900, 1024
        for (int l = 1; l < 33; l++) {
            if (l % 2 == 0) {
                int x = l * l;
                System.out.print(x + " ");
            }
        }
        
        System.out.println(" \n");

        // * e) 2, 4, 8, 16, 32, …, 16384, 32768
        for (int m = 1; m < 16; m++) {
            double potenz = m;
            double x = Math.pow(2.0, potenz);
            System.out.printf("%.0f ", x);
        }
    }
}
// Aufgabe 4: Folgen
/*
 * Programmieren Sie Schleifen, welche die folgenden Folgen ausgeben:
 * a) 99, 96, 93, … 12, 9
 * b) 1, 4, 9, 16, 25, … 361, 400
 * c) 2, 6, 10, 14, … 98, 102
 * d) 4, 16, 36, 64, 100 … 900, 1024
 * e) 2, 4, 8, 16, 32, …, 16384, 32768
 */