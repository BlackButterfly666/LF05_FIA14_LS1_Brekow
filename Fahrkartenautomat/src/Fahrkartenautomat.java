import java.util.Scanner;

class Fahrkartenautomat {
    public static void main(String[] args) {
        double offenerBetrag = fahrkartenbestellungErfassen(); // return offener Betrag
        double gezahlterBetrag = fahrkartenBezahlen(offenerBetrag); // return eingezahltes Geld
        fahrkartenAusgeben(); // print ticket
        rueckgeldAusgeben(gezahlterBetrag, offenerBetrag); //print rückgeld
    }

    static double fahrkartenbestellungErfassen() {
        Scanner tastatur = new Scanner(System.in);

        double zuZahlenderBetrag;
        byte anzahlTickets;

        System.out.print("Zu zahlender Betrag (EURO): ");
        zuZahlenderBetrag = tastatur.nextDouble();
        System.out.print("Wieviele Tickets werden benötigt? ");
        anzahlTickets = tastatur.nextByte();

        // Berechnung Gesamtpreis der Tickets -----------------------
        zuZahlenderBetrag *= anzahlTickets;

        return zuZahlenderBetrag;
    }

    static double fahrkartenBezahlen(double zuZahlenderBetrag) {
        Scanner tastatur = new Scanner(System.in);

        double eingezahlterGesamtbetrag;
        double eingeworfeneMünze;

        // Geldeinwurf ----------------------------------------------
        eingezahlterGesamtbetrag = 0.0;
        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
            System.out.printf("Noch zu zahlen: %.2f EURO\n", zuZahlenderBetrag - eingezahlterGesamtbetrag);
            System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
            eingeworfeneMünze = tastatur.nextDouble();
            eingezahlterGesamtbetrag += eingeworfeneMünze;
        }
        return eingezahlterGesamtbetrag;
    }

    static void fahrkartenAusgeben() {
        // Fahrscheinausgabe ----------------------------------------
        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");
    }

    static void rueckgeldAusgeben(double eingezahlterGesamtbetrag, double zuZahlenderBetrag) {
        double rückgabebetrag;

        // Rückgeldberechnung und -Ausgabe --------------------------
        rückgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        if (rückgabebetrag > 0.0) {
            System.out.printf("Der Rückgabebetrag in Höhe von %.2f EURO \n", rückgabebetrag);
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while (rückgabebetrag >= 2.0) // 2 EURO-Münzen
            {
                System.out.println("2 EURO");
                rückgabebetrag -= 2.0;
            }
            while (rückgabebetrag >= 1.0) // 1 EURO-Münzen
            {
                System.out.println("1 EURO");
                rückgabebetrag -= 1.0;
            }
            while (rückgabebetrag >= 0.5) // 50 CENT-Münzen
            {
                System.out.println("50 CENT");
                rückgabebetrag -= 0.5;
            }
            while (rückgabebetrag >= 0.2) // 20 CENT-Münzen
            {
                System.out.println("20 CENT");
                rückgabebetrag -= 0.2;
            }
            while (rückgabebetrag >= 0.1) // 10 CENT-Münzen
            {
                System.out.println("10 CENT");
                rückgabebetrag -= 0.1;
            }
            while (rückgabebetrag >= 0.05)// 5 CENT-Münzen
            {
                System.out.println("5 CENT");
                rückgabebetrag -= 0.05;
            }
        }

        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" +
                "vor Fahrtantritt entwerten zu lassen!\n" +
                "Wir wünschen Ihnen eine gute Fahrt.");

    }
}

// Aufgabe A 2.5 in txt ausgelagert