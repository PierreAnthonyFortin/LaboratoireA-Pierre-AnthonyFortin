import java.util.Scanner;

public class Salutation {

    public static void main(String[] args) {

        String name;

        Scanner sc = new Scanner(System.in);

        // Question
        System.out.println("What's your name?");

        //Answer
        name = sc.next();
        System.out.println();

        //Hi + name
        System.out.println("Hi " + name);

        //CLosing Scanner
        sc.close();
    }
}
