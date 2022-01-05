public class Aufgabe6 {
    public static void aufgabe6() {
        String stern = "*";
        int count=0;
        for (int i = 1; i <= 4; i++) {
            System.out.println(" ");
            while (count < i) {
                System.out.print(stern);
                count++;
            }
            count = 0;
        }
    }
}
// Aufgabe 6: Sterne
/*
 * Schreiben Sie ein Programm, das eine von Ihnen vorgegebene Anzahl von Sternen
 * (*) in Form eines Dreiecks auf dem Bildschirm ausgibt.
 * Tipp: Es existiert eine Lösung unter Nutzung einer Schleife und eine weitere
 * Lösung mit zwei verschachtelten Schleifen. Beispielhafte Ausgabe für 4
 * Schleifendurchläufe:
 *
 **
 ***
 ****
 * 
 */