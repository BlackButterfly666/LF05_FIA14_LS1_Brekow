public class App {
    public static void main(String[] args) throws Exception 
    {
        // A1.6
		// Aufgabe 1

		System.out.println("\n\n");
		System.out.println("   **\n"
				+ "*      *\n"
				+ "*      *\n"
				+ "   **");
		
		// Aufgabe 2

        String templ = "%-5s=%-19s=%4s\n";
        System.out.printf( templ , "0!", "", "1" );
        System.out.printf( templ , "1!", " 1 ", "1" );
        System.out.printf( templ , "2!", " 1 * 2 ", "2" );
        System.out.printf( templ , "3!", " 1 * 2 * 3 ", "6" );
        System.out.printf( templ , "4!", " 1 * 2 * 3 * 4 ", "24" );
        System.out.printf( templ , "5!", " 1 * 2 * 3 * 4 * 5", "120" );

        // Aufgabe 3

        String temp2 = "%-12s|%10s\n";
        System.out.printf( temp2, "Fahrenheit", "Celsius");
        System.out.print( "------------------------\n");
        System.out.printf( temp2, "-20", "-28.8889");
        System.out.printf( temp2, "-10", "-23.3333");
        System.out.printf( temp2, "0", "-17.7778");
        System.out.printf( temp2, "20", "-6.6667");
        System.out.printf( temp2, "30", "-1.1111");
    }
}
