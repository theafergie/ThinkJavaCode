import java.util.Random;
import java.util.Scanner;

public class GuessStarter
{

    public static void main(String[] args)
    {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int input;

        Scanner in = new Scanner(System.in);


        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        System.out.print("Type a number: ");
        input = in.nextInt();

        System.out.println("Your guess is: " + input);

        System.out.println("The number I was thinking of is: " + number);
        System.out.print("You were off by: ");
        System.out.println(input - number);
    }

}
