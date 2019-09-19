import java.util.Scanner;

public class Convertisseur1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variable
        double rad;
        int deg;

        //Question
        System.out.println("What's the angle of the Radian?");
        rad = sc.nextDouble();
        System.out.println();

        // Value of the angle in Radian
        deg = (int) (180 * (rad / Math.PI));

        System.out.println();
        System.out.println("The value in degrees : " + deg);

        //Closing Scanner
        sc.close();
    }
}
