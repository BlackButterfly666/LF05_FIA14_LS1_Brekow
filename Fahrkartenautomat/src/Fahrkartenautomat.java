import java.util.Scanner;

class Fahrkartenautomat {
    public static void main(String[] args) {
        double offenerBetrag = fahrkartenbestellungErfassen(); // return offener Betrag
        double gezahlterBetrag = fahrkartenBezahlen(offenerBetrag); // return eingezahltes Geld
        fahrkartenAusgeben(); // print ticket
        rueckgeldAusgeben(gezahlterBetrag, offenerBetrag); // print rückgeld
    }

    static double fahrkartenbestellungErfassen() {
        Scanner tastatur = new Scanner(System.in);

        double zuZahlenderBetrag;
        byte anzahlTickets;

        anzahlTickets = gibTicket(tastatur);
        zuZahlenderBetrag = zuZahlen(tastatur, anzahlTickets);

        return zuZahlenderBetrag;
    }

    static byte gibTicket(Scanner tastatur) {
        System.out.print("Wieviele Tickets werden benötigt? min. 1 - max. 10");
        byte anzahlTickets = tastatur.nextByte();
        if (anzahlTickets >= 1 && anzahlTickets <= 10) {
            return anzahlTickets;
        } else {
            System.out.println("Der Eingabewert lag nicht zwischen 1 und 10. Als Ticketanzahl wurde 1 ausgewählt. ");
            return 1;
        }
    }

    static double zuZahlen(Scanner tastatur, int anzahlTickets) {
        System.out.print("Zu zahlender Betrag (EURO): ");
        double zuZahlenderBetrag = tastatur.nextDouble();
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {
            if (zuZahlenderBetrag < 0) {
                System.out.print("Zu kleiner Betrag. Zu zahlender Betrag (EURO): ");
                zuZahlenderBetrag = tastatur.nextDouble();
            } else {
                korrekteEingabe = !korrekteEingabe;
            }
        }
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
            warte(250);
        }
        System.out.println("\n\n");
    }

    static void warte(int millisekunde) {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void rueckgeldAusgeben(double eingezahlterGesamtbetrag, double zuZahlenderBetrag) {
        double rückgabebetrag;

        // Rückgeldberechnung und -Ausgabe --------------------------
        rückgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        if (rückgabebetrag > 0.0) {
            System.out.printf("Der Rückgabebetrag in Höhe von %.2f EURO \n", rückgabebetrag);
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            muenzeAusgeben(rückgabebetrag, "EURO");
        }

        System.out.println("\nVergessen Sie nicht, den Fahrschein\n" +
                "vor Fahrtantritt entwerten zu lassen!\n" +
                "Wir wünschen Ihnen eine gute Fahrt.");
    }

    static void muenzeAusgeben(double betrag, String einheit)
    // beim Betrag macht eine int gar keinen Sinn, man könnte die double vorher *100
    // rechnen, dann in eine int casten per '(int)rückgabebetrag'
    // und in der Methode wieder durch 100 teilen, aber das gibt fehlerhafte
    // Abweichungen, die nicht notwendig sind
    {
        double rückgabebetrag = betrag;
        while (rückgabebetrag >= 2.0) // 2 EURO-Münzen
        {
            System.out.println("2 " + einheit);
            rückgabebetrag -= 2.0;
        }
        while (rückgabebetrag >= 1.0) // 1 EURO-Münzen
        {
            System.out.println("1 " + einheit);
            rückgabebetrag -= 1.0;
        }
        while (rückgabebetrag >= 0.5) // 50 CENT-Münzen
        {
            System.out.println("0,50 " + einheit);
            rückgabebetrag -= 0.5;
        }
        while (rückgabebetrag >= 0.2) // 20 CENT-Münzen
        {
            System.out.println("0,20 " + einheit);
            rückgabebetrag -= 0.2;
        }
        while (rückgabebetrag >= 0.1) // 10 CENT-Münzen
        {
            System.out.println("0,10 " + einheit);
            rückgabebetrag -= 0.1;
        }
        rückgabebetrag = Math.round(rückgabebetrag * 100.0) / 100.0;

        while (rückgabebetrag >= 0.05)// 5 CENT-Münzen
        {
            System.out.println("0,05 " + einheit);
            rückgabebetrag -= 0.05;
        }
    }
}

// Aufgabe A 2.5 in txt ausgelagert