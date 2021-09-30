import java.util.*;
import java.util.Scanner;

class incomingFresh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your first name: ");
        String firstNa = sc.nextLine(); // reads string
        System.out.print("Please enter your last name:  ");
        String lastNa = sc.nextLine(); // reads string
        System.out.print("Please enter your Class year:  ");
        int classYear = reader.nextInt();
        System.out.print("Please enter your school phone:  ");
        int schoolNum = reader.nextInt();

        System.out.println("You entered ");
        System.out.println(firstNa + " " + lastNa + ", class of: " + classYear + ", school phone: " + schoolNum);

    }
}