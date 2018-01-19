public class Time
{
    public static void main(String args[])
    {
        System.out.println("Time 2.3");
        int hour = 15;
        int minute = 4;
        //int second = (hour * 60 + minute) * 60;
        int second = 16;

        int secondsPerMinute = 60;
        int minutesPerHour = 60;

        int secondsSinceMidnight = (hour * minutesPerHour * secondsPerMinute) +(minute * secondsPerMinute) + second;


        System.out.println("Number of seconds since midnight: " + secondsSinceMidnight);

        int hoursPerDay = 24;
        int secondsInDay = hoursPerDay * minutesPerHour * secondsPerMinute;
        int secondsRemainingInDay = secondsInDay - secondsSinceMidnight;
        System.out.println("Number of seconds remaining in the day: " + secondsRemainingInDay);

        int percentageDayPassed = secondsSinceMidnight * 100 / secondsInDay;
        System.out.println("Percentage of the day that has passed: " + percentageDayPassed);


        int hour2 = 15;
        int minute2 = 55;
        int second2 = 25;

        int endingTime = (hour2 * minutesPerHour * secondsPerMinute) + (minute2 * secondsPerMinute) + second2;

        int timeElapsed = endingTime - secondsSinceMidnight;
        System.out.print("Time elapsed in seconds since starting: " + timeElapsed);

    }
}
