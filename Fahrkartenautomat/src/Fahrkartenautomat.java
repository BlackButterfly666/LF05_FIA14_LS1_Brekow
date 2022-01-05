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
        double gesamtPreis = 0;
        boolean genug = false;

        while (!genug) {
            boolean korrekteEingabe = false;
            System.out.println(" ");
            System.out.println("Fahrkartenbestellvorgang:");
            System.out.println("=========================");
            System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:");
            System.out.println("Einzelfahrschein Regeltarif AB = 2,90 EUR drücken Sie [ 1 ]");
            System.out.println("Tageskarte Regeltarif AB = 8,60 EUR drücken Sie [ 2 ]");
            System.out.println("Kleingruppen-Tageskarte Regeltarif AB = 23,50 EUR drücken Sie [ 3 ]");
            System.out.println("Bezahlen [ 9 ]");

            byte ticket = tastatur.nextByte();

            while (!korrekteEingabe) {
                switch (ticket) {
                    case 1:
                        gesamtPreis = kalkulierePreis(tastatur, ticket, 2.90, gesamtPreis);
                        korrekteEingabe = !korrekteEingabe;
                        break;
                    case 2:
                        gesamtPreis = kalkulierePreis(tastatur, ticket, 8.60, gesamtPreis);
                        korrekteEingabe = !korrekteEingabe;
                        break;
                    case 3:
                        gesamtPreis = kalkulierePreis(tastatur, ticket, 23.50, gesamtPreis);
                        korrekteEingabe = !korrekteEingabe;
                        break;
                    case 9:
                        genug = !genug;
                        korrekteEingabe = !korrekteEingabe;
                        System.out.println(gesamtPreis);
                        break;
                    default:
                        System.out.println("Ihre Wahl: " + ticket);
                        System.out.print(" >>falsche Eingabe<<");
                        ticket = tastatur.nextByte();
                        break;
                }
            }
        }

        return gesamtPreis;
    }

    static double kalkulierePreis(Scanner tastatur, byte ticket, double ticketPreis, double gesamtPreis) {
        System.out.println("Ihre Wahl: " + ticket);
        byte anzahlTickets = ticketAnzahl(tastatur);
        double zuZahlenderBetrag = anzahlTickets * ticketPreis;
        gesamtPreis += zuZahlenderBetrag;
        System.out.println("Zwischenpreis: " + gesamtPreis);
        return gesamtPreis;
    }

    static byte ticketAnzahl(Scanner tastatur) {
        boolean korrekt = false;

        // Auswahl Ticketanzahl ------------------------------------
        System.out.println("Wieviele Tickets werden benötigt? min. 1 - max. 10");
        byte anzahlTickets = tastatur.nextByte();

        while (!korrekt) {
            if (anzahlTickets >= 1 && anzahlTickets <= 10) {
                korrekt = !korrekt;
            } else {
                System.out.println("Wählen Sie bitte eine Anzahl von 1 bis 10 Tickets aus.");
                anzahlTickets = tastatur.nextByte();
            }
        }
        return anzahlTickets;
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