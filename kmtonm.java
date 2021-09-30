
// Name: Cannon Flinders        Program: Kilometers to nautical miles
// Description: This program will have you input the number of kilometers
// you would like to convert to nautical miles
import java.util.Scanner;

public class kmtonm {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // these are my varibles I will use later
        double degrees;
        double minutes;
        double kilometer;
        double nauticalm;
        // this is asking for the users input
        System.out.println("Please enter the amount of kilometers ");
        // this converts the users input into the varibles 'inches'
        kilometer = reader.nextDouble();

        // these are the calculations
        degrees = 90;
        minutes = 60 * degrees;

        // Since a kilometer is 1/10,000 of the distance and there are 5,600 minutes
        // Between the northpole and the equator then dividing the 2 will give me
        // the amount needed
        nauticalm = (minutes / 10000) * kilometer;
        // this prints the answers
        System.out.print("There are " + nauticalm);
        System.out.print(" nautical miles in " + kilometer);
        System.out.print(" kilometers");
    }

}
