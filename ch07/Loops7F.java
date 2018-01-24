import java.util.Scanner;

public class Loops7F
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int num = 0;
        int runningTotal = 0;

         while (runningTotal <= 1000)
         {
             System.out.println("Enter a number: ");
             num = in.nextInt();
             runningTotal += num;
             System.out.println(runningTotal);

         }
        System.out.println("You have exceeded 1000");
    }


}
