import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double pi = 3.14;
        double radius;

        System.out.println("Please enter the radius ");
        radius = reader.nextDouble();

        double diameter = radius * 2;
        double circumference = diameter * pi;
        double area = 4 * pi * (radius * radius);
        double volume = ((double) 4 / 3) * pi * (radius * radius * radius);

        System.out.println("The diameter is " + diameter);
        System.out.println("The circumference is " + circumference);
        System.out.println("the area is " + area + " and the volume is " + volume);

    }

}
