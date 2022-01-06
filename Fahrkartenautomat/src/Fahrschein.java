public class Fahrschein {
    // Falls sich die gesamt Ticketanzahl ändert, dann diese Zahl anpassen
    public static byte ticketGesamtAnzahl = 10;
    String bezeichnung;
    double preis;

    public Fahrschein(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    /*
     * man könnte eine Ticketart (Einzelfahrschein + Kurzstrecke), (Tageskarte
     * einzeln), (Gruppenticket) ergänzen. Das bringt die Möglickeit bei größer
     * werdender Anzahl von verschiedenen Tickets das ganze übersichtlich zu halten
     * und auch eine übersichtliche Eingabe zu gestalten, in dem man zuerst die Art
     * (Einzelfahrt & Kurzstrecke, Tagesticket, Gruppenkarte, evtl auch Tickets für
     * Fahrräder / Hunde / etc) auswählt und dann spezifisch auswählt ob die
     * Tageskarte für Berlin AB, Berlin BC oder Berlin ABC sein soll.
     */

    static String fahrkartenBezeichnungAusgeben(int index) {
        String[] fahrkartenbezeichnung = { "Einzelfahrschein Berlin AB",
                "Einzelfahrschein Berlin BC",
                "Einzelfahrschein Berlin ABC",
                "Kurzstrecke",
                "Tageskarte Berlin AB",
                "Tageskarte Berlin BC",
                "Tageskarte Berlin ABC",
                "Kleingruppen-Tageskarte Berlin AB",
                "Kleingruppen-Tageskarte Berlin BC",
                "Kleingruppen-Tageskarte Berlin ABC" };
        return fahrkartenbezeichnung[index];
    }

    static double fahrkartenPreiseAusgeben(int index) {
        double[] fahrkartenpreise = { 2.90, 3.30, 3.60, 1.90, 8.60, 9.00, 9.60, 23.50, 24.30, 24.90 };
        return fahrkartenpreise[index];
    }
}

// static String fahrkartenBezeichnungAusgeben(int index) {
// String[] fahrkartenbezeichnung = { "Einzelfahrschein Berlin AB",
// "Einzelfahrschein Berlin BC",
// "Einzelfahrschein Berlin ABC",
// "Kurzstrecke",
// "Tageskarte Berlin AB",
// "Tageskarte Berlin BC",
// "Tageskarte Berlin ABC",
// "Kleingruppen-Tageskarte Berlin AB",
// "Kleingruppen-Tageskarte Berlin BC",
// "Kleingruppen-Tageskarte Berlin ABC" };
// return fahrkartenbezeichnung[index];
// }

// static double fahrkartenPreiseAusgeben(int index) {
// double[] fahrkartenpreise = { 2.90, 3.30, 3.60, 1.90, 8.60, 9.00, 9.60,
// 23.50, 24.30, 24.90 };
// return fahrkartenpreise[index];
// }