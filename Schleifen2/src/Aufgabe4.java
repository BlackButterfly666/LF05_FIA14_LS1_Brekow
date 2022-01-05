import java.util.Scanner;

public class Aufgabe4 {
    public static void aufgabe4() {
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Bitte den Startwert in Celsius eingeben:");
        double startWertC = tastatur.nextDouble();
        System.out.println("Bitte den Endwert in Celsius eingeben:");
        double endWertC = tastatur.nextDouble();
        System.out.println("Bitte die Schrittweite in Grad Celsius eingeben:");
        double schrittweiteC = tastatur.nextDouble();
        double wertF = 0;

        System.out.println(startWertC + " " + vonCzuF(startWertC));

        while (startWertC != endWertC) {
            if (startWertC < endWertC) {
                if ((startWertC += schrittweiteC) > endWertC){startWertC = endWertC;}
                else {startWertC += schrittweiteC;}
                wertF = vonCzuF(startWertC);
                System.out.println(startWertC + " " + wertF);
            } 
            else {
                if ((startWertC -= schrittweiteC) < endWertC){startWertC = endWertC;}
                else {startWertC -= schrittweiteC;}
                wertF = vonCzuF(startWertC);
                System.out.println(startWertC + " " + wertF);
            }
        }
        tastatur.close();
    }

    public static double vonCzuF(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
}
// Aufgabe 4: Temperaturumrechnung
/*
 * Erstellen und testen Sie ein Java-Programm, das dem dargestellten Beispiel
 * entsprechend Temperaturwerte von Celsius nach Fahrenheit umrechnet.
 * Bitte den Startwert in Celsius eingeben: -10
 * Bitte den Endwert in Celsius eingeben: 20
 * Bitte die Schrittweite in Grad Celsius eingeben: 5
 * 
 * -10,00°C 14,00°F
 * -5,00°C 23,00°F
 * 0,00°C 32,00°F
 * 5,00°C 41,00°F
 * 10,00°C 50,00°F
 * 15,00°C 59,00°F
 * 20,00°C 68,00°F
 * 
 */