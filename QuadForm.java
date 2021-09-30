import java.util.Scanner;

public class QuadForm {
    public static void main(String[] args) {
        // this scanner reader wasnt in the orginal code and this allows for the code to
        // access it
        Scanner reader = new Scanner(System.in);
        int a, b, c;

        double x1, x2;
        // the line below didnt have a 'n' after printl
        System.out.println("This is just a simple class to test your debugging skills :)");

        System.out.println("and your knowledge of the quadratic formula! ");

        System.out.print("Enter the value of a: ");
        // this said 'nextDouble' when it needs to say 'nextInt'
        a = reader.nextInt();

        System.out.print("Enter the value of b: ");

        b = reader.nextInt();

        System.out.print("Enter the value of c: ");

        c = reader.nextInt();
        // these parts needed () in the right parts to make sure PEMDAS was followed
        x1 = (-1 * b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        x2 = (-1 * b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        System.out.println("The value of x is " + x1 + " and " + x2);
    }
}
