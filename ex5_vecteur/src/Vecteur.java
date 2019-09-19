import java.util.Scanner;

public class Vecteur {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        double xa;
        double ya;
        double za;
        double xb;
        double yb;
        double zb;
        double distance;

        //Questions
        //Coordinates of A
        System.out.println("What are the coordinates of A?");

        System.out.println("xa : ");
        xa = sc.nextDouble();
        System.out.println();

        System.out.println("ya : ");
        ya = sc.nextDouble();
        System.out.println();

        System.out.println("za : ");
        za = sc.nextDouble();
        System.out.println();

        System.out.println("The point A (" + xa + "," + ya + "," + za + ")");

        //Coordinates of B
        System.out.println("What are the coordinates of B?");

        System.out.println("xb : ");
        xb = sc.nextDouble();
        System.out.println();

        System.out.println("yb : ");
        yb = sc.nextDouble();
        System.out.println();

        System.out.println("zb : ");
        zb = sc.nextDouble();
        System.out.println();

        System.out.println("The point B (" + xb + "," + yb + "," + zb + ")");

        //Calcul distance
        distance = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2) + Math.pow(zb - za, 2));
        System.out.println("The distance is : " + distance);

        //Scanner close
        sc.close();
     }
}
