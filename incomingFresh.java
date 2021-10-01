/*
Name: Cannon Flinders        Program: Incoming Freshman
Description: This program takes the name, class year, and school phone from the user
and prints it at the end
*/
import java.util.*;
import java.util.Scanner;
//I used 2 imports because I didnt know how to get the one I usally use to work so I found a different one that was easier

class incomingFresh {
    public static void main(String[] args) {
        // this puts it into the program
        Scanner sc = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        // these are the opening questions
        System.out.print("What is your first name: ");
        String firstNa = sc.nextLine(); // reads string
        System.out.print("Please enter your last name:  ");
        String lastNa = sc.nextLine();
        System.out.print("Please enter your Class year:  ");
        int classYear = reader.nextInt();
        System.out.print("Please enter your school phone:  ");
        int schoolNum = reader.nextInt();

        // this prints out what I got with some "" for formating
        System.out.println("You entered ");
        System.out.println(firstNa + " " + lastNa + ", class of: " + classYear + ", school phone: " + schoolNum);

    }
}
