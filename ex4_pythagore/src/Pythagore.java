import java.util.Scanner;

public class Pythagore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // variables
        int A;
        int B;
        double pythagore;

        // Question A
        System.out.println("What's the value of A?");
        A = sc.nextInt();
        System.out.println();

        // Question B
        System.out.println("What's the value of B?");
        B = sc.nextInt();
        System.out.println();

        // Calcul
        pythagore = (Math.pow(A, 2)) + (Math.pow(B, 2));
        pythagore = Math.sqrt(pythagore);
        System.out.println("The hypotenuse is : " + pythagore);

        //Closing Scanner
        sc.close();
    }
}
