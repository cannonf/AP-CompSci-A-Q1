
/*
Name: Cannon Flinders        Program: Sphere
Description: This program takes the radius as an input and finds the diameter, 
circumference, area, and volume of a sphere
*/
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // I kept pi as a constant in this
        double pi = 3.14;
        double radius;

        System.out.println("Please enter the radius ");
        radius = reader.nextDouble();

        // easier to start with the most basic operation at the top and work down
        double diameter = radius * 2;
        double circumference = diameter * pi;
        double area = 4 * pi * (radius * radius);
        double volume = ((double) 4 / 3) * pi * (radius * radius * radius);

        // printing the output
        System.out.println("The diameter is " + diameter);
        System.out.println("The circumference is " + circumference);
        System.out.println("the area is " + area + " and the volume is " + volume);

    }

}
