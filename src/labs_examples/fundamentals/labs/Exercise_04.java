package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        float radius = 3.14f;
        float height = 5f;

        // V=πr2h
        float volOfCylinder = (float)(Math.PI * radius * 2 * height);
        // A=2πrh+2πr2
        float surfaceArea = (float)((2 * Math.PI * radius * height) + (2 * Math.PI * radius * 2));

        System.out.println("The volume is " + volOfCylinder + " and the surface area is " + surfaceArea);

    }
}
