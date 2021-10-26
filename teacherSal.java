/*
Name: Cannon Flinders        Program: Teacher Salary 
Description: This program asks the user for inputs relating to a teachers salary and outputs
how much it increases based on the inputs
*/

import java.util.Scanner;

public class teacherSal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // these are getting the inputs from the user
        System.out.print("Please enter the starting salary: ");
        double startSal = reader.nextInt();

        System.out.print("Please enter the percentage increase: ");
        double perc = reader.nextInt();
        // this gets the percentage
        perc = perc / 100;

        System.out.print("Please enter the number of years you would like: ");
        int years = reader.nextInt();

        System.out.println("Year      Salary");

        for (int i = 1; i <= years; i++) {
            // this if loop is because since a number > 10 has 2 digits the table doesnt
            // line up so I removed a space
            if (i >= 10) {
                System.out.println(i + "         " + startSal);
                // this adds the original to the remainder of the percentage
                startSal = startSal + (startSal * perc);

            } else if (i < 10) {
                System.out.println(i + "          " + startSal);
                startSal = startSal + (startSal * perc);

            }

        }
    }

}
