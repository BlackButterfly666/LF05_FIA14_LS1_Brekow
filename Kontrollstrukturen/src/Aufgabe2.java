import java.util.Scanner;
public class Aufgabe2 {
    // Aufgabe 2: Steuersatz
    /*
    Nach der Eingabe des Nettowertes soll abgefragt werden, ob der ermäßigte oder der volle
    Steuersatz angewendet werden soll. Der Anwender entscheidet sich über die Eingabe von „j“
    für den ermäßigten Steuersatz und mit Eingabe von „n“ für den vollen Steuersatz.
    Anschließend soll das Programm den korrekten Bruttobetrag auf dem Bildschirm ausgeben. 
    */
    public static void aufgabe2() {
        Scanner tastatur = new Scanner(System.in);
        boolean korrekteEingabe = false;

        System.out.println("Wie ist der Nettowert?");
        double nettowert = tastatur.nextDouble();
        System.out.println("Wenn der ermaßigte Steuersatz angewendet werden soll, gib 'j' ein. Ansonsten gib 'n' für den vollen Steuersatz ein.");
        String steuersatz = tastatur.next();

        while (!korrekteEingabe) {
            if (steuersatz.equals("j") || steuersatz.equals("J")){
                double bruttowert = (nettowert/100) * 107;
                System.out.printf("Der Bruttobetrag entspricht %.2f Euro.", bruttowert);
                korrekteEingabe = true;
            }
            else if (steuersatz.equals("n") || steuersatz.equals("N")){
                double bruttowert = (nettowert/100) * 119;
                System.out.printf("Der Bruttobetrag entspricht %.2f Euro.", bruttowert);
                korrekteEingabe = true;
            }
            else {
                System.out.println("Fehlerhafte Eingabe. Bitte gib 'j' für den ermäßigten Steuersatz ein oder 'n' für den vollen Steuersatz.");
                steuersatz = tastatur.next();
            }
            
        }

    }
}
