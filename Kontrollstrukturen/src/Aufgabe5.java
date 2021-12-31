import java.util.Scanner;

public class Aufgabe5 {
    public static void aufgabe5() {
        Scanner tastatur = new Scanner(System.in);
        boolean korrekteEingabe = false;

        System.out.println("Bist du [m]ännlich oder [w]eiblich?");
        String geschlecht = tastatur.next();
        System.out.println("Wie groß bist du? (in cm)");
        double groesse = tastatur.nextDouble();
        System.out.println("Wieviel wiegst du? (in kg)");
        double gewicht = tastatur.nextDouble();

        groesse /= 100;
        double bmi = gewicht / (groesse * groesse);
        while (!korrekteEingabe) {
            if (geschlecht.equals("m") || geschlecht.equals("M")) {
                korrekteEingabe = true;
                if (bmi < 20) {
                    System.out.println("Untergewicht");
                } else if (bmi > 20 && bmi < 25) {
                    System.out.println("Normalgewicht");
                } else {
                    System.out.println("Übergewicht");
                }
            } else if (geschlecht.equals("w") || geschlecht.equals("W")) {
                korrekteEingabe = true;
                if (bmi < 19) {
                    System.out.println("Untergewicht");
                } else if (bmi > 19 && bmi < 24) {
                    System.out.println("Normalgewicht");
                } else {
                    System.out.println("Übergewicht");
                }
            } else {
                System.out.println("Falsche Eingabe. m oder w?");
                geschlecht = tastatur.next();
            }
        }
        tastatur.close();
    }
}

// Aufgabe 5: BMI
/*
 * BMI (Body Mass Index): Der BMI berechnet sich aus dem Körpergewicht [kg]
 * dividiert durch das Quadrat der Körpergröße [m2].
 * Die Formel lautet: BMI = (Körpergewicht in kg): (Körpergröße in m)2.
 * Dies bedeutet, eine Person mit einer Körpergröße von 160 cm und einem
 * Körpergewicht von 60 kg hat einen BMI von 23,4 [60: 2,56 = 23,4].
 * Der BMI einer Person wird nach folgenden Regeln klassifiziert:
 * 
 * Klassifikation m w
 * Untergewicht <20 <19
 * Normalgewicht 20-25 19-24
 * Übergewicht >25 >24
 * 
 * Das Programm soll vom Benutzer das Gewicht [in kg] die Größe [in cm] und das
 * Geschlecht [m/w] abfragen. Am Ende des Programms soll die BMI-Klassifikation
 * der Person ausgegeben werden.
 */
