public class Aufgabe3 {
    static void aufgabe3() {
        int zahlenArr[] = { 123, 234, 345, 456, 567, 678, 789, 890 };
        System.out.println(zahlUmdrehen(zahlenArr)); 
    }

    static int[] zahlUmdrehen(int arr[]) {
        int[] zahl = new int[arr.length];
        String ganzeZahl = "";

        for (int i = 0; i < arr.length; i++) {
            String[] nummer = String.valueOf(arr[i]).split("");
            int ziffern[] = new int[nummer.length];

            for (int j = 0; j < nummer.length; j++) {
                ziffern[j] = Integer.parseInt(nummer[j]);
            }

            ziffern = wertetauschen(ziffern);

            for (int j = 0; j < ziffern.length; j++) {
                String buffer = String.valueOf(ziffern[j]);
                ganzeZahl += buffer;
            }

            zahl[i] = Integer.parseInt(ganzeZahl);
        }
        return zahl;
    }

    static int[] wertetauschen(int[] zahlenArr) {
        for (int i = 0; i < (zahlenArr.length / 2); i++) {
            int arrlength = zahlenArr.length - i - 1;
            int buffer = zahlenArr[i];

            zahlenArr[i] = zahlenArr[arrlength];
            zahlenArr[arrlength] = buffer;
        }

        for (int i = 0; i < zahlenArr.length; i++) {
            System.out.print(zahlenArr[i] + " ");
        }
        return zahlenArr;
    }
}
// Aufgabe 3
/*
 * Schreiben Sie wiederum eine Methode, die die Werte eines Feldes mit
 * ganzzahligen Werten umdreht (vgl. Aufgabe 2.1). Diesmal soll jedoch das
 * Ergebnis in ein neues Feld abgelegt werden. Dieses Feld soll Rückgabewert der
 * Methode sein.
 */