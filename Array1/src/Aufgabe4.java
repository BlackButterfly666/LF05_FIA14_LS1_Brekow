public class Aufgabe4 {
    static void aufgabe4() {
        int lottozahlen[] = {3, 7, 12, 18, 37, 42};
        boolean ist12 = false;
        boolean istnicht13 = false;

        for (int i = 0; i < lottozahlen.length; i++) {
            // System.out.print(lottozahlen[i] + " ");
            if ( lottozahlen[i] == 12){
                ist12 = true;
            }
            else if(lottozahlen[i] != 13){
                istnicht13 = true;
            }
        }

        if (ist12){System.out.println("Die Zahl 12 ist in der Ziehung enthalten.");}
        if (istnicht13){System.out.println("Die Zahl 13 ist nicht in der Ziehung enthalten.");}
    }
}
// Aufgabe 4
/*
 * Jetzt wird Lotto gespielt. In der Klasse „Lotto“ gibt es ein ganzzahliges
 * Array, welches 6 Lottozahlen von 1 bis 49 aufnehmen kann. Konkret sind das
 * die Zahlen 3, 7, 12, 18, 37 und 42. Tragen Sie diese im Quellcode fest ein.
 * 
 * a) Geben Sie zunächst schleifenbasiert den Inhalt des Arrays in folgender
 * Form aus: [ 3 7 12 18 37 42 ]
 * b) Prüfen Sie nun nacheinander, ob die Zahlen 12 bzw. 13 in der Lottoziehung
 * vorkommen.
 * 
 * Geben Sie nach der Prüfung aus:
 * Die Zahl 12 ist in der Ziehung enthalten.
 * Die Zahl 13 ist nicht in der Ziehung enthalten.
 */