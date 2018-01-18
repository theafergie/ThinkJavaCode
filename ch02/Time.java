public class Time
{
    public static void main(String args[])
    {
        System.out.println("Time 2.3");
        int hour = 15;
        int minute = 4;
        int second = (hour * 60 + minute) * 60;

        System.out.print("Number of seconds since midnight: ");
        System.out.println(second);

        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(86400 - second);

        System.out.print("Percentage of the day that has passed: ");
        System.out.println(second * 100 / 86400);

        int hour2 = 15;
        int minute2 = 55;
        int second2 = (hour2 * 60 + minute2) * 60;

        System.out.print("Time elapsed in seconds since starting: ");
        System.out.println(second2 - second);

    }
}
