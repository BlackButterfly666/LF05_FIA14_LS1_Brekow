public class ArrayHelper { // zu Aufgabe1
    public static String convertArrayToString(int[] zahlen){
        String zahlenString = "";

        for (int i = 0; i < zahlen.length; i++) {
            zahlenString = zahlenString + zahlen[i] + ",";
        }
        return zahlenString;
    }
}
// Aufgabe 1
/*
 * Schreiben Sie in der zu erstellenden Klasse ArrayHelper die Methode
 * public static String convertArrayToString(int[] zahlen). Die Methode soll zu
 * dem im Parameter übergebenen Array eine mit Komma getrennte Auflistung der
 * Werte als String zurückgeben. Testen Sie Ihre Methode in der main-Methode.
 */