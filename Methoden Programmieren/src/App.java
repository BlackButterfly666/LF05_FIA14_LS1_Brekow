public class App {
    public static void main(String[] args) throws Exception 
    {
        // A 3.2
        // Aufgabe 1
        double m;
        double x = 2.0;
        double y = 4.0;
        
        m = berechneMittelwert(x, y);
        System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", x, y, m);
    }

    // Methode von Aufgabe 1
    private static double berechneMittelwert(double x, double y)
    {
        return (x + y) / 2.0; 
    }

    // Methode von Aufgabe 3
    private static double reihenschaltung(double r1, double r2) { return r1 + r2;}
}
