import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable
        double rad;
        int deg;

        //Question
        System.out.println("What's the angle in degrees?");
        deg = sc.nextInt();
        System.out.println();

        //Calcul + Answer
        rad = Math.toRadians(deg);

        System.out.println();
        System.out.print("The value in radians is : " + rad);

        //Closing Scanner
        sc.close();
    }
}
