import java.util.Scanner;

public class Typage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Variables
        int var1 = 1;
        double var2 = 1;
        char var3 = 1;

        // Conversions
        // var1 (int) to String
        Integer.toString(var1);

        // boolean bool = (var1 == 1); IMPOSSIBLE car le domaine des booleans est incompatible avec celui de int

        // var2 (double) to int
        double data = var2;
        int value = (int) data;

        // var2 rounded and converted to String
        String.valueOf(var2);
        Math.round(var2);

        // var3 converter to int
        Integer.parseInt(String.valueOf(var3));

        //Closing Scanner
        sc.close();
    }
}
