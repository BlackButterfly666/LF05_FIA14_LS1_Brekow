import java.util.Scanner;

// A 3.2 / Aufgabe 2
public class PCHaendler {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		// Benutzereingaben lesen
		System.out.println("was m�chten Sie bestellen?");
        String artikel = liesString(myScanner.next());

		System.out.println("Geben Sie die Anzahl ein:");
        int anzahl = liesInt(myScanner.nextInt());

		System.out.println("Geben Sie den Nettopreis ein:");
		double preis = liesDouble(myScanner.nextDouble());

		System.out.println("Geben Sie den Mehrwertsteuersatz in Prozent ein:");
		double mwst = myScanner.nextDouble();

		// Verarbeiten
        double nettogesamtpreis = berechneGesamtnettopreis(anzahl, preis);
        double bruttogesamtpreis = berechneGesamtbruttopreis(nettogesamtpreis, mwst);

		// Ausgeben
        rechungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);
	}

    public static String liesString(String text) { return text;}
    public static int liesInt(int text) { return text;}
    public static double liesDouble(double text) {return text;}
    public static double berechneGesamtnettopreis(int anzahl, double nettopreis) { return anzahl * nettopreis;}
    public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst) { return nettogesamtpreis * (1 + mwst / 100);}
    public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) 
    {
		System.out.println("\tRechnung");
		System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
		System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
    }
}
