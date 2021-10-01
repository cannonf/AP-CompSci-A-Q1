/*
Project: Calculator        Group: Cannon and Dominic

Cannon: I texted Dominic when I saw this assinment on Tuesday and we decided it would be fair if I did the 
first 3 operations and the opening questions and he did the final one and the closing statements. We worked 
pretty well together on this and communicated on it well.
*/

import java.util.Scanner;

public class calcGroup {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // this is the intro text for the user
        System.out.println("Hello there user!");
        System.out.println("Hope you are having a wonderful day.");
        System.out.println("This is a calculator program");
        System.out.print("Please enter the first number: ");
        int numOne = reader.nextInt();

        System.out.print("Please enter the second number: ");
        int numTwo = reader.nextInt();

        // this is the additon part of it
        // I found it easier to read if I made a var for it instead of putting it in the
        // System.out
        int add = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + add);
        // there are + in "" to show those in the text

        // this is the subtraction part of it
        int sub = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + sub);

        // this is the mulitplaction part of it
        int mult = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + mult);

        System.out.println("Thank you for your input!");
        System.out.println("We hope to see you again");

    }
}

// our weekly plan is too text eachother when ever we see that we have a group
// project together and then find out who needs to do
// what and figure out what to do once one of us sees it, we have eachothers
// phone numbers so its easy for us to communicate

// to get to know eachother we played 'what would you bring to an island' and i
// learned that Dominic does martial arts in his free time
