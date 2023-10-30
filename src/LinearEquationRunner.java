import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[]args) {
        //GET COORDINATE PAIRS

        System.out.println("\nLINEAR EQUATION CALCULATOR");
        Scanner scan = new Scanner(System.in);

        System.out.println("\nENTER COORDINATE 1 (x, y): ");
        String coordinatePair1 = scan.nextLine();
        System.out.println("ENTER COORDINATE 2: (x, y)");
        String coordinatePair2 = scan.nextLine();

        String stringX1 = coordinatePair1.substring(coordinatePair1.indexOf("(") + 1, coordinatePair1.indexOf(","));
        String stringY1 = coordinatePair1.substring(coordinatePair1.indexOf(",") + 2, coordinatePair1.indexOf(")"));

        String stringX2 = coordinatePair2.substring(coordinatePair2.indexOf("(") + 1, coordinatePair2.indexOf(","));
        String stringY2 = coordinatePair2.substring(coordinatePair2.indexOf(",") + 2, coordinatePair2.indexOf(")"));

        int x1 = Integer.parseInt(stringX1);
        int y1 = Integer.parseInt(stringY1);
        int x2 = Integer.parseInt(stringX2);
        int y2 = Integer.parseInt(stringY2);

        //CALCULATIONS

        LinearEquation coordinatePairEquation = new LinearEquation(x1, y1, x2, y2);

        System.out.println(coordinatePairEquation.equationInfo());

        System.out.println("\nENTER X VALUE: ");
        double xvalue = scan.nextDouble();

        System.out.println("THE POINT ON THE LINE IS:" + coordinatePairEquation.xToCoord(xvalue));

    }

}
