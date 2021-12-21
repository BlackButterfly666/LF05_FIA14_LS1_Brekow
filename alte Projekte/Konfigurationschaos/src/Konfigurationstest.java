public class Konfigurationstest {
public static void main(String[] args){

        //Ubung 1
        /*Nutzen  Sie  Ihre  Entwicklungsumgebung  und  erstellen Sie  ein Java-Projekt  mit  dem  Namen Konfigurationschaos und eine Klasse
        mit dem Namen Konfigurationstest.

         a) Deklarieren Sie eine Variable mit dem Bezeichner cent. Danach initialisieren Sie die Variable mit dem Wert 70 und weisen anschließend
         den Wert 80 zu.

         b) Deklarieren Sie eine Variable mit dem Bezeichner maximum und initialisieren Sie die Variable mit dem Wert 95,50.
       */

        int cent = 70;
        float _maximum = 95.50f;
        //cent = 80;

        //Ubung 2
        /*Deklarieren Sie Variablen für folgende Werte und versuchen Sie dabei möglichst wenig Speicherplatz zu verbrauchen: true | -1000 | 1,255 | #
*/
        boolean bool = true;
        int number01 = -1000;
        float number02 = 1.255f;
        char zeichen = '#';

        //Ubung 3
        /*a) Speichern Sie in einer Variablen einen Satz mit drei Wörtern
        b) Deklarieren Sie eine Konstante mit dem Bezeichner check_nr und weisen Sie ihr den Wert 8765 zu.
        */

        String satz = "Hallo du da.";
        final int check_nr = 8765;

        //Ubung 4
        /* Überlegen Sie sich Gründe, warum die Verwendung von Datentypen in Programmiersprachen sinnvoll ist.*/

        // Datentypen machen klarer worum es genau geht. der PC kann Text addieren wie Zahlen
        // Zahlen können wie Strings behandelt werden

        //____________________________________________________________________

        /*Übung 1: Arbeiten Sie in der Klasse an dem Konfigurationstest weiter.
                a) Berechnen Sie 4 + 8 * 9 – 1 und speichern Sie das Ergebnis in der Variablen ergebnis. Geben Sie das Ergebnis
        mit Hilfe der Anweisung System.out.println(ergebnis) aus.
                b) Deklarieren Sie eine Variable zaehler und initialisieren Sie diese mit dem Wert 1. Inkrementieren Sie die
        Variable zaehler um 1 und geben Sie dann das Ergebnis aus.
                c) Berechnen Sie das Ergebnis als Ganzzahldivision 22 : 6 und geben Sie es aus.
                        */

        int x = 4 + 8*9 -1;
        int y =4 + (8*9) -1;
        System.out.println(x);
        System.out.println(y);

        int zaehler = 1;
        zaehler++;
        System.out.println(zaehler);

        int _div = 22/6;
        System.out.println(_div);

         /*       Übung 2: Geben Sie das Ergebnis in der Konsole aus
        a) Erzeugen Sie eine Variable schalter und weisen Sie dieser den Wert 10 zu. Prüfen Sie anschließend, ob die
        Variable schalter größer als 7 und kleiner als 12 ist und geben Sie das Ergebnis der Bedingung aus. Nutzen Sie
        dazu die System.out.println( ) Anweisung.
                b) Prüfen Sie, ob die Variable schalter ungleich dem Wert 10 oder gleich dem Wert 12 ist und geben Sie das
        Ergebnis aus.
         */

        int schalter = 10;
        boolean gr_als = false;

        gr_als = schalter> 7 && 10 < 12;
        System.out.println(gr_als);
        boolean vergleich = false;
        vergleich = schalter != 10 || schalter == 12;
        System.out.println(vergleich);
/*
        Übung 3:
        Verketten Sie die Zeichenketten "Meine Oma ", "fährt im " und "Hühnerstall Motorrad.". */

        String teil01=  "Meine Oma ";
        String teil02=  "fährt im ";
        String teil03=  "Hühnerstall Motorrad.";

        System.out.println(teil01+teil02+teil03);



    }
}
