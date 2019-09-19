import java.util.Scanner;

public class Resolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        double a1;
        double b1;
        double c1;
        double discriminant;
        double x1;
        double x2;

        //Values
        System.out.println("Enter values : ");

        System.out.println("a > ");
        a1 = sc.nextDouble();

        System.out.println("b > ");
        b1 = sc.nextDouble();

        System.out.println("c > ");
        c1 = sc.nextDouble();

        // Discriminant
        discriminant = ((Math.pow(b1, 2)) - 4 * (a1 * c1));

        System.out.println("Discriminant : " + discriminant);

        x1 = (b1 * -1 + Math.sqrt(discriminant)) / (2 * a1);

        System.out.println("X1 : " + x1);

        x2 = (b1 * -1 - Math.sqrt(discriminant)) / (2 * a1);

        System.out.println("X2 : " + x2);

        //Closing scanner
        sc.close();
    }
}
