import java.util.Scanner;

public class A2_2 {
    public static void main(String[] args) {
        // Rechnen();
        Unterhalten();
    }// Hier startet das Programm

    public static void Rechnen() {
        //A2.2.1
        // Neues Scanner-Objekt myScanner wird erstellt
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        // Die Variable zahl1 speichert die erste Eingabe
        int zahl1 = myScanner.nextInt();

        System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");
        // Die Variable zahl2 speichert die zweite Eingabe
        int zahl2 = myScanner.nextInt();
        int ergebnis;

        System.out.print("Bitte geben Sie einen Rechenoperator ein: ");
        String _operator = myScanner.next();
        System.out.println(_operator);

        if (_operator.equals("+")) {
            // Die Addition der Variablen zahl1 und zahl2
            // wird der Variable ergebnis zugewiesen.
            ergebnis = zahl1 + zahl2;
            System.out.println("\n\n\nErgebnis der Addition lautet: ");
            System.out.println(zahl1 + " + " + zahl2 + " = " + ergebnis);
        } else if (_operator == "-") {
            ergebnis = zahl1 - zahl2;
            System.out.println("\n\n\nErgebnis der Subtraktion lautet: ");
            System.out.println(zahl1 + " - " + zahl2 + " = " + ergebnis);
        } else if (_operator == "*") {
            ergebnis = zahl1 * zahl2;
            System.out.println("\n\n\nErgebnis der Multiplikation lautet: ");
            System.out.println(zahl1 + " * " + zahl2 + " = " + ergebnis);
        } else if (_operator == "/") {
            ergebnis = zahl1 / zahl2;
            System.out.println("\n\n\nErgebnis der Division lautet: ");
            System.out.println(zahl1 + " / " + zahl2 + " = " + ergebnis);
        } else if (_operator == "%") {
            ergebnis = zahl1 % zahl2;
            System.out.println("\n\n\nErgebnis der Modulo lautet: ");
            System.out.println(zahl1 + " % " + zahl2 + " = " + ergebnis);
        } else {
            System.out.println("Keinen Keks für dich. Du hast einen falschen Operator gewählt.");
        }

        myScanner.close();
    }

    public static void Unterhalten(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hallo wie ist dein Name?");
        String name = myScanner.next();
        System.out.println("Wie alt bist du?" );
        int alter = myScanner.nextInt();

        System.out.printf("Also dein Name ist %s und du bist %d Jahre alt", name, alter);
    }
}
