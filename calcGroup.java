import java.util.Scanner;

public class calcGroup {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello there user!");
        System.out.println("Hope you are having a wonderful day.");
        System.out.println("This is a calculator program");
        System.out.print("Please enter the first number: ");
        int numOne = reader.nextInt();

        System.out.print("Please enter the second number: ");
        int numTwo = reader.nextInt();

        int add = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + add);

        int sub = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + sub);

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