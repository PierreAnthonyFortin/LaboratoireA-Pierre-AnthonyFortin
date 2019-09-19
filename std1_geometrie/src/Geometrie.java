public class Geometrie {

    public static void main(String[] args) {

    // Variables
        //Circle
        int radiusCircle = 10;
        double areaCircle;

        //Cube
        double areaCube;
        double volumeCube;
        int lengthCube = 7;

        // Cylinder
        int radiusCylinder = 10;
        int heightCylinder = 5;
        double areaCylinder;
        double volumeCylinder;

        // Cone
        int radiusCone = 3;
        int heightCone = 7;
        double apothemCone = 7.1589108;
        double areaCone;
        double volumeCone;




//Circle

    System.out.println("The circle");

        System.out.println("- Radius  : 10.0");

    //Calcul
        areaCircle = radiusCircle *radiusCircle * Math.PI;

        System.out.println("- Area    : " + areaCircle );

// Cube
    System.out.println("The Cube");
        System.out.println("- Length  : 7.0");

    //Calcul

     areaCube = (Math.pow(lengthCube,2)*6);

     volumeCube = (Math.pow(lengthCube,3));


        System.out.println("- Area    : " + areaCube);
        System.out.println("- Volume  : " + volumeCube);


// Cylinder
    System.out.println("The Cylinder");

        System.out.println("- Radius  : 10.0");
        System.out.println("- Height  : 5.0");

        //Calcul

        areaCylinder = (Math.PI)*(Math.pow(radiusCylinder,2));
        volumeCylinder = (Math.PI)*(Math.pow(radiusCylinder,2)*heightCylinder);



        System.out.println("- Area    : " + areaCylinder);
        System.out.println("- Volume  : " + volumeCylinder);


// Cone
    System.out.println("The cone");
        System.out.println("- Radius  : 3.0");
        System.out.println("- Height  : 7.0");
        System.out.println("- Apothem : 7.1589108");

       //Calcul

       areaCone = (Math.PI)*(Math.pow(radiusCone,2))+ (Math.PI)*(radiusCone)*(apothemCone);

       volumeCone = (Math.PI)*(Math.pow(radiusCone,2)* (heightCone)) / 3;


       System.out.println("- Area    : " + areaCone);
        System.out.println("- Volume  : " + volumeCone);


}



}
