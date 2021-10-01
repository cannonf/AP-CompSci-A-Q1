
/*
Name: Cannon Flinders        Program: Employee wages
Description: This program take the hourly wage, regular hours, and overtime and finds
the total amount earned during that time baised off the inputs
*/
import java.util.Scanner;

public class employeeWages {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // all the var I will use
        double hourWage;
        double regHours;
        double overTime;
        double total;
        // asking the questions and storing the results
        System.out.println("Please enter your hourly wage ");
        hourWage = reader.nextDouble();

        System.out.println("Please enter total regular hours ");
        regHours = reader.nextDouble();

        System.out.println("Please enter overtime hours ");
        overTime = reader.nextDouble();
        // since over time pays more I needed to * by 1.5 and its easier to understand
        // if I kept it in a seperate var
        overTime = (hourWage * overTime) * 1.5;

        total = (regHours * hourWage) + overTime;

        System.out.println("Your total is " + total);

    }
}
