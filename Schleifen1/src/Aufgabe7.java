public class Aufgabe7 {
    public static void aufgabe7() {
        for (int i = 0; i < 100; i++) {
            if (i == 1 || i == 2 || i == 3|| i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
