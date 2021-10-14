
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
        //I put this outside of the loop so I could get the loop running
        int userNum = reader.nextInt();

        while (userNum != -1) {
            System.out.print("Please enter the base: ");
            int userBase = reader.nextInt();
            double total = Math.pow(userBase, userNum);
            // You can only use the Math.pow if its a double
            System.out.println("Results " + userNum + " ^ " + userBase + " = " + total);
            //This prints out the operation
            
            System.out.print("Please enter the exponent ( -1 to quit): ");
            // I repeat it here at the end once everything else is finished so it can ask the user if
            // they wants to keep playing
            userNum = reader.nextInt();
            //re entering the value that the while loop uses
            //this makes it so it doesnt create an infinte loop

        }
    }

}
