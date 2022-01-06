import java.util.Scanner;

// nicht ganz das was in der Aufgabe stand, aber nah an der Realität von DB-Fahrkartenautomaten
public class Kasse {
    static int rohlinge = 10;

    static void manageKasse(int ticketAnzahl, Scanner tastatur) {

        if (rohlinge < ticketAnzahl) {
            System.out.println(
                    "Nicht genügend Rohlinge. \nBitte nutze einen anderen Automat oder rufe das Servicepersonal.");
            System.out.println("Servicecode benötigt");
            String servicecode = tastatur.next();
            boolean korrekteEingabe = false;
            while (!korrekteEingabe) {
                System.out.println("while");
                System.out.println(servicecode);
                System.out.println(servicecode == "666rohling");
                if (servicecode.equals("666rohling")) {
                    rohlingeNachfüllen();
                    korrekteEingabe = !korrekteEingabe;
                    System.out.println("while -if");
                    manageKasse(ticketAnzahl, tastatur);
                } else {
                    System.out.println("Servicecode benötigt ++");
                    servicecode = tastatur.next();
                }
            }
        } else {
            rohlinge = gibRohling(rohlinge, ticketAnzahl);
        }
    }

    static void rohlingeNachfüllen() {
        rohlinge = 100;
    }

    static int gibRohling(int rohlinge, int ticketAnzahl) {
        rohlinge -= ticketAnzahl;
        return rohlinge;
    }
}
// Der Automat hat nur eine bestimmte Anzahl von Ticket-Rohlingen. Sollten nicht
// genügend Rohlinge vorrätig sein, um Tickets zu drucken, soll ein Kaufvorgang
// nicht möglich sein und dies dem Kunden mitgeteilt werden.