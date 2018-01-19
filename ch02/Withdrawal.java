public class Withdrawal
{
    public static void main(String args[])
    {
        int withdrawal = 137;

        int twenties = withdrawal / 20;

        System.out.println("$20: " + twenties);

        int remainder = withdrawal - (20 * twenties);

        //System.out.println(remainder + " left to go.");

        int tens = remainder / 10;
        remainder = withdrawal - (twenties * 20) - (tens * 10);

        System.out.println("$10: " + tens);

        //System.out.println(remainder + " left to go.");
        int fives = remainder / 5;
        remainder = withdrawal - (twenties * 20) - (tens * 10) - (fives * 5);

        System.out.println("$5: " + fives);
        //System.out.println(remainder + " left to go.");

        System.out.println("$1: " + remainder);
    }
}
