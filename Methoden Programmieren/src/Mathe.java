public class Mathe
{
    private static double quadrat(double x) { return x * x;}

    // Aufgabe 7
    public static double hypotenuse(double kathete1, double kathete2) 
    {
        double h = Math.sqrt(quadrat(kathete1) + quadrat(kathete2));

        // h = wurzel aus ( k1 ² + k2 ²)
        // Math.sqrt
        return h;
    }
}