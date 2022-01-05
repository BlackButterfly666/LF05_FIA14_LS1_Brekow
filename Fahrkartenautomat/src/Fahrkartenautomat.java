import java.util.Scanner;

class Fahrkartenautomat {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        
        while (true) {
            double offenerBetrag = fahrkartenbestellungErfassen(tastatur); // return offener Betrag
            double gezahlterBetrag = fahrkartenBezahlen(tastatur, offenerBetrag); // return eingezahltes Geld
            fahrkartenAusgeben(); // print ticket
            rueckgeldAusgeben(gezahlterBetrag, offenerBetrag); // print rückgeld
        }
    }

    static double fahrkartenbestellungErfassen(Scanner tastatur) {
        int anzahlTickets;
        double zuZahlenderBetrag;

        // Auswahl Ticketart -> return Ticketpreis/Stück ------------
        double ticketPreis = ticketWaehlen(tastatur);

        // Auswahl Ticketanzahl ------------------------------------
        System.out.print("Wieviele Tickets werden benötigt? min. 1 - max. 10");
        anzahlTickets = tastatur.nextByte();
        if (anzahlTickets >= 1 && anzahlTickets <= 10) {
        } else {
            System.out.println("Der Eingabewert lag nicht zwischen 1 und 10. Als Ticketanzahl wurde 1 ausgewählt. ");
            anzahlTickets = 1;
        }

        // Berechnung Gesamtpreis der Tickets -----------------------
        zuZahlenderBetrag = anzahlTickets * ticketPreis;

        return zuZahlenderBetrag;
    }

    static double ticketWaehlen(Scanner tastatur) {
        System.out.println(" ");
        System.out.println("Fahrkartenbestellvorgang:");
        System.out.println("=========================");
        System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:");
        System.out.println("Einzelfahrschein Regeltarif AB = 2,90 EUR drücken Sie [ 1 ]");
        System.out.println("Tageskarte Regeltarif AB = 8,60 EUR drücken Sie [ 2 ]");
        System.out.println("Kleingruppen-Tageskarte Regeltarif AB = 23,50 EUR drücken Sie [ 3 ]");

        byte ticket = tastatur.nextByte();
        double ticketPreis = 0;
        boolean korrekteEingabe = false;

        while (!korrekteEingabe) {
            switch (ticket) {
                case 1:
                    System.out.println("Ihre Wahl: " + ticket);
                    korrekteEingabe = !korrekteEingabe;
                    ticketPreis = 2.90;
                    break;
                case 2:
                    System.out.println("Ihre Wahl: " + ticket);
                    korrekteEingabe = !korrekteEingabe;
                    ticketPreis = 8.60;
                    break;
                case 3:
                    System.out.println("Ihre Wahl: " + ticket);
                    korrekteEingabe = !korrekteEingabe;
                    ticketPreis = 23.50;
                    break;
                default:
                    System.out.println("Ihre Wahl: " + ticket);
                    System.out.print(" >>falsche Eingabe<<");
                    ticket = tastatur.nextByte();
                    break;
            }
        }
        return ticketPreis;
    }

    static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
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