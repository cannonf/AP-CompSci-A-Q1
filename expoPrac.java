
/*
Name: Cannon Flinders        Program: Raised to the Power
Description: This program asks the user for an input to raise the base to a power but if the 
user enters -1 then the program will stop 
*/
import java.util.Scanner;

public class expoPrac {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Please enter the exponent ( -1 to quit): ");
        int userNum = reader.nextInt();

        while (userNum != -1) {
            System.out.print("Please enter the base: ");
            int userBase = reader.nextInt();
            double total = Math.pow(userBase, userNum);
            System.out.println("Results " + userNum + " ^ " + userBase + " = " + total);

            System.out.print("Please enter the exponent ( -1 to quit): ");
            userNum = reader.nextInt();

        }
    }

}