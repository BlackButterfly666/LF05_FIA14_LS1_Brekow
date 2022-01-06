public class Muenzen {
    static String erstelleMuenzen(double muenze) {
        boolean isit1 = false;
        String einheit = "";
        byte number = 0;

        if (muenze == 0.05) {
            number = 5;
            einheit = "cent";
            isit1 = true;
        } else if (muenze == 0.1) {
            number = 10;
            einheit = "cent";
            isit1 = false;
        } else if (muenze == 0.2) {
            number = 20;
            einheit = "cent";
            isit1 = false;
        } else if (muenze == 0.5) {
            number = 50;
            einheit = "cent";
            isit1 = false;
        } else if (muenze == 1) {
            number = 1;
            einheit = "Euro";
            isit1 = true;
        } else if (muenze == 2) {
            number = 2;
            einheit = "Euro";
            isit1 = true;
        } else {
            System.out.println("ERROR: class Muenzen / Methode erstelleMuenzen");
        }

        String muenzeString1 = "\n        * * *  \n      *       * \n     *     " + number + "   *\n     *   " + einheit
                + "  *\n      *       * \n        * * *  ";
        String muenzeString2 = "\n        * * *  \n      *       * \n     *    " + number + "   *\n     *   " + einheit
                + "  *\n      *       * \n        * * *  ";
        // " * * * \n * * \n* *\n* *\n * * \n * * * \n";

        if (isit1){return muenzeString1;}
        else {return muenzeString2;}

    }
}
