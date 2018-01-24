import java.util.Scanner;

public class Loops7E
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x;

        System.out.print("Enter a number 0 to 10\t");
        x = in.nextInt();

        while(x != 0)
        {
            System.out.print("Enter a number 0 to 10\t");
            x = in.nextInt();
        }
    }


}

