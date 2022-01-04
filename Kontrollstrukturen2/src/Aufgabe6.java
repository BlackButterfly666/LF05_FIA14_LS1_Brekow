import java.util.Scanner;

public class Aufgabe6 {
    public static void aufgabe6() {
        Scanner tastatur = new Scanner(System.in);
        while (!inputZahl(tastatur)) {
        }
        tastatur.close();
    }

    // ------------ wandelt den String in eine Zahl
    public static int rom2dez(String rom) {
        char[] glyphen = rom.toCharArray();
        int ergebnis = 0;

        for (int i = 0; i < glyphen.length; i++) {
            int rechterWert = 0;
            int linkerWert = glyphenWert(glyphen[i]);

            // 1. Additionsregel und 3. Subtraktionsregel
            if (i < glyphen.length - 1) {
                rechterWert = glyphenWert(glyphen[i + 1]);
            }
            if (linkerWert < rechterWert) {
                ergebnis -= linkerWert;
            } else {
                ergebnis += linkerWert;
            }
        }
        return ergebnis;
    }

    // ------------ gibt Glyphenwert von übergebenem char zurück
    public static int glyphenWert(char glyphe) {
        if (glyphe == 'I') {
            return 1;
        } else if (glyphe == 'V') {
            return 5;
        } else if (glyphe == 'X') {
            return 10;
        } else if (glyphe == 'L') {
            return 50;
        } else if (glyphe == 'C') {
            return 100;
        } else if (glyphe == 'D') {
            return 500;
        } else if (glyphe == 'M') {
            return 1000;
        } else {
            System.out.println("Error - glyphenWert()");
            return 0;
        }
    }

    // ------------ nimmt Tastatur input auf und prüft ob valide
    public static boolean inputZahl(Scanner tastatur) {

        System.out.println("Bitte gib ein, welche römische Zahl umgerechnet werden soll.");
        System.out.println("Es gibt dafür folgende Regeln:");
        System.out.println("Nr. 1: Beginne mit der größten Zahl. Bsp.: XVII");
        System.out.println("Nr. 2: Ein 'I' darf nur vor 'V' oder 'X' stehen. Bsp.: XIV");
        System.out.println("Ein 'X' darf nur vor 'L' oder 'C' stehen. Bsp.: DXC");
        System.out.println("Ein 'C' darf nur vor 'D' oder 'M' stehen. Bsp.: LC");
        System.out.println("Nr. 3: Ein Zeichen darf maximal drei mal hintereinander stehen. Bsp.: XXXVIII");
        System.out.println("Bitte tippe eine römische Zahl ein. (I, V, X, L, C, D, M)");
        String inputStr = tastatur.next().toUpperCase();

        if (istValide(inputStr)) {
            System.out.println(rom2dez(inputStr));
        } else {
            System.out.println("inkorrekte Eingabe.");
            System.out.println("eingegebene Zahl: " + inputStr);
            return false;
        }
        return true;
    }

    // ------------ prüft den String ob alle Regeln eingehalten wurden
    public static boolean istValide(String inputString) {
        char[] input = inputString.toCharArray();
        int length = input.length;

        for (int i = 0; i < length; i++) {
            if (!istValiderChar(input[i])) {
                return false;
            }
        }
        if (!darfSubtrahieren(input)) {
            return false;
        }
        if (!countGlyphe(input)) {
            return false;
        }
        return true;
    }

    // ------------ prüft ob chars zu oft hintereinander sind
    public static boolean countGlyphe(char[] input) {
        for (int i = 0; i < input.length - 3; i++) {
            if (input[i] == input[i + 1] && input[i + 1] == input[i + 2] && input[i + 2] == input[i + 3]) {
                return false;
            }
        }
        return true;
    }

    // ------------ prüft Subtraktionsregel
    public static boolean darfSubtrahieren(char[] input) { // 4. Reihenfolge bei Subtraktion
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == 'I') {
                if (input[i + 1] == 'I' || input[i + 1] == 'V' || input[i + 1] == 'X') {
                } else {
                    return false;
                }
            } else if (input[i] == 'X') {
                if (input[i + 1] == 'I' || input[i + 1] == 'V' || input[i + 1] == 'X' || input[i + 1] == 'L'
                        || input[i + 1] == 'C') {
                } else {
                    return false;
                }
            } else if (input[i] == 'C') {
                if (input[i + 1] == 'I' || input[i + 1] == 'V' || input[i + 1] == 'X' || input[i + 1] == 'L'
                        || input[i + 1] == 'C' || input[i + 1] == 'D' || input[i + 1] == 'M') {
                } else {
                    return false;
                }
            } 
        }
        return true;
    }

    // ------------ prüft ob eingegebener char valide ist
    public static boolean istValiderChar(char zeichen) {
        char[] rom = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };

        for (int i = 0; i < rom.length; i++) {
            if (zeichen == rom[i]) {
                return true;
            }
        }
        System.out.println("istValiderChar " + zeichen);
        return false;
    }
}

// Aufgabe 6: Römische Zahlen 2
/*
 * Erstellen Sie eine Konsolenanwendung Rom. Das Programm Rom soll nach der
 * Eingabe einer römischen Zahl, bestehend aus mehreren römischen Zeichen die
 * entsprechende Dezimalzahl ausgeben (I = 1, V = 5, X = 10, L = 50, C = 100, D
 * = 500, M = 1000). Eine Verarbeitung soll bis zur Dezimalzahl 3999 möglich
 * sein. Eine weitere Herausforderung besteht darin, die eingegebene römische
 * Zahl auf Korrektheit zu prüfen.
 * 
 * Die Regeln für römische Zahlen lauten:
 * 1. Additionsregel: Alle Zeichen nebeneinander werden addiert.
 * Kleinere Zahlen folgen größeren, also zum Beispiel XVII = 10+5+1+1 = 17.
 * 2. Maximal 3 gleiche Zeichen: Es dürfen nur maximal 3 gleiche Zeichen
 * aufeinander folgen (also: III, XXX, CCC oder MMM).
 * Die Zahlzeichen V, L, D stehen nie mehrfach, denn bspw. VV wäre ja X.
 * 3. Subtraktionsregel: Steht ein kleines Zahlzeichen (wie I) vor einem
 * größeren (wie V), so wird es abgezogen. Also 4 wäre IV (1 vor 5).
 * Es darf immer nur ein Zeichen vorangestellt werden (erlaubt sind I, X und C).
 * 4. Reihenfolge bei Subtraktion: Eine bestimmte Reihenfolge ist bei der
 * Subtraktion einzuhalten:
 * • I (1) darf nur von V (5) und X (10) abgezogen werden. Erlaubt sind also nur
 * IV und IX.
 * • X (10) darf nur von L (50) und C (100) abgezogen werden. Erlaubt sind also
 * nur XL und XC.
 * • C (100) darf nur von D (500) und M (1000) abgezogen werden. Erlaubt sind
 * also nur CD und CM.
 */
