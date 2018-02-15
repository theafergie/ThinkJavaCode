import java.util.Scanner;

public class TicketNumber
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);

        System.out.println("Enter ticket number: ");
        int ticketNumber;
        ticketNumber = user.nextInt();

        int lastDigit;
        lastDigit = ticketNumber % 10;
        System.out.println("lastDigit: " + lastDigit);

        int ticketPrefix = (ticketNumber - lastDigit) / 10;
        System.out.println("ticketPrefix: " + ticketPrefix);

        int remainder = ticketPrefix % 7;
        System.out.println("Remainder is: " + remainder);

        boolean result = remainder == lastDigit;
        if (result)
        {
            System.out.println("Good Number");
        }
        else
        {
            System.out.println("Bad Number");
        }
    }
}
