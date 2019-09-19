import java.util.Scanner;

public class BoiteNoire {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //Variables

        //Sphere
        double mVolSphere = 3517;
        double weightSphere;
        double radiusSphere = 2.15;
        double volumeSphere;

        //Insulating substance
        double dInsulatingSubstance = 135445.88;
        double weightInsulatingSubstance;
        double volumeInsulatingSubstance;
        double quantityInsulatingSubstance;

        //Box
        double weightBox = 375;
        double volumeBox = 125;
        double totalWeight;

        //Calculs

        //Sphere
        volumeSphere = (4.0/3)*Math.PI*Math.pow(radiusSphere,3);
        weightSphere = mVolSphere/volumeSphere;

        //Insulating substance
        volumeInsulatingSubstance = volumeBox - volumeSphere;
        quantityInsulatingSubstance = volumeInsulatingSubstance * 1000;
        weightInsulatingSubstance = quantityInsulatingSubstance*volumeInsulatingSubstance;

        //Total weight
        totalWeight = weightSphere + weightInsulatingSubstance + weightBox;

        //Information report
        System.out.println("-------------------------------------------");
        System.out.println("- Information Report");
        System.out.println(" Sphere");
        System.out.println(" * Density : " + mVolSphere + " kg/m3");
        System.out.println(" * Weight : " + weightSphere + " kg");
        System.out.println(" * Radius : " + radiusSphere + " m");
        System.out.println(" * Volume : " + volumeSphere + " m3");
        System.out.println(" Insulating substance");
        System.out.println(" * Density : " + dInsulatingSubstance + " kg/m3");
        System.out.println(" * Weight : " + weightInsulatingSubstance + " kg");
        System.out.println(" * Volume : " + volumeInsulatingSubstance + " m3");
        System.out.println(" * Quantite : " + quantityInsulatingSubstance + " l");
        System.out.println(" Black Box");
        System.out.println(" * Weight : " + weightBox + " kg");
        System.out.println(" * Volume : " + volumeBox + " m3");
        System.out.println(" * Total Weight : " + totalWeight + " kg");
        System.out.println("-------------------------------------------");

        //Closing Scanner
        sc.close();
    }
}
