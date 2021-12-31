import java.util.Scanner;

// A 3.2 - Aufgabe 6
public class Fahrsimulator 
{
	public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        double geschwindigkeit = 0;
        int count = 0;
        while (count < 10) {
            
            System.out.println("Was ist deine Geschwindigkeit?");
            geschwindigkeit = beschleunige(geschwindigkeit, myScanner.nextDouble());
            System.out.println(geschwindigkeit);
            count++;
        }
    }

    private static double beschleunige(double v, double dv)
    {
        double x = v + dv;

        if (x > 130) { x = 130;} 
        else if (x < 0) { x = 0;}

        return x;
    }
}
