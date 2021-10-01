/*
Name: Cannon Flinders         Program: Clock
Description: This is a clock program that finds the time from midnight, the seconds remaining in the day, and 
the percentage of the day that has passed all from the input put into the varibles
*/
public class time {
    public static void main(String[] args) {
        // 24hr clock
        int hour = 12;
        int minute = 45;
        int second = 34;

        // HR:MN:SC
        System.out.println("The time is " + hour + ":" + minute + ":" + second);

        // sec since midnight
        int secMinute = 60;
        int secHour = 60 * secMinute;
        int secMN = hour * secHour + minute * secMinute + second;
        System.out.println("Seconds since midnight: " + secMN);

        // seconds remaining in the day
        int secondInDay = secHour * 24;
        int secondLeft = secondInDay - secMN;
        System.out.println("There are " + secondLeft + " seconds left in the day");

        // how much of the day has passed
        double dayPercentage = (double) secMN / secondInDay;
        // printf is so the percentage doesnt countinue after 2 decimal points
        System.out.printf("%.2f out of 1 of the day has passed", dayPercentage);

    }
}
