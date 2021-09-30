
// Name Cannon Flinders          Program: Inches to metric 
// Description: This is a program designed to helped 
// convert inches to millimeters and cetimeters
import java.util.Scanner;

public class ownconversion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // these are my varibles I will use later
        double milli;
        double centi;
        double inches;
        // this is asking for the users input
        System.out.println("Please enter the amount of inches ");
        // this converts the users input into the varibles 'inches'
        inches = reader.nextDouble();

        // these are the calculations
        milli = inches * 25.4;
        centi = inches * 2.54;

        // this prints the answers
        System.out.print("In " + inches);
        System.out.print(" inches, there are " + milli);
        System.out.print(" millimeters and " + centi);
        System.out.print(" centimeters ");

    }

}
