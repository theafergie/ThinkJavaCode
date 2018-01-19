import java.util.Scanner;

public class ConvertTime
{
    public static void main(String args[])
    {
        int hours;
        int minutes;
        int seconds;

        final int Hours = 60 * 60;

        int input;

        Scanner in = new Scanner(System.in);

        System.out.print("How many seconds?");
        input = in.nextInt();

        hours = input / Hours;
        minutes = input % Hours / 60;
        seconds = (input - Hours) - minutes * 60;

        System.out.print(input + " seconds = ");
        System.out.printf("%d hours, %d minutes, %d seconds", hours, minutes, seconds);

        //System.out.println(hours);
        //System.out.println(minutes);
        //System.out.println(seconds);

    }

}
