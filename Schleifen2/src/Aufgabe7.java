public class Aufgabe7 {
    public static void aufgabe7() {
        double distanzA = 000;
        double distanzB = 250;

        System.out.println("Distanz von A | Distanz von B");
        System.out.println(distanzA + " ....... | ....... " + distanzB);

        while (distanzA < 1000 && distanzB < 1000) {
            distanzA += 9.5;
            distanzB += 7.0;
            System.out.println(distanzA + " ....... | ....... " + distanzB);
        }
    }
}

// Aufgabe 7: Wettlauf
/*
 * Zwei Leichtathleten führen einen Wettkampf über eine Distanz von 1000 m aus.
 * Sprinter A läuft mit einer Geschwindigkeit von 9,5 m/s.
 * Sprinter B läuft mit einer Geschwindigkeit von 7 m/s, da er langsamer ist,
 * erhält er einen Vorsprung von 250 m. Zeigen Sie anhand eines Programms, ob
 * Sprinter A seinen Konkurrenten überholen kann, oder ob dieser als erster ins
 * Ziel gelangt.
 * Hinweis: Geben Sie eine Tabelle aus, die die gelaufenen Strecken der beiden
 * Läufer für jede volle Sekunde anzeigt. Die Berechnung soll abgebrochen
 * werden, sobald ein Läufer das Ziel erreicht.
 */