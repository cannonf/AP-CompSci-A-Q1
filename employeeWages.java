import java.util.Scanner;

public class employeeWages {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double hourWage;
        double regHours;
        double overTime;
        double total;
        System.out.println("Please enter your hourly wage ");
        hourWage = reader.nextDouble();

        System.out.println("Please enter total regular hours ");
        regHours = reader.nextDouble();

        System.out.println("Please enter overtime hours ");
        overTime = reader.nextDouble();
        overTime = (hourWage * overTime) * 1.5;

        total = (regHours * hourWage) + overTime;

        System.out.println("Your total is " + total);

    }
}
