
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        play();
    }

    private static void play()
    {
        System.out.println("Welcome to the ultimate number guessing game!");


        int randomNumber = getRandomNumber();
       //System.out.println("My secret number is: " + randomNumber); //USE AS A TEST FOR RANDOM

        Scanner in = new Scanner(System.in);
        int guess;


        do {
            System.out.println("Enter your guess: ");
            guess = in.nextInt();

            if (isCold(guess, randomNumber))
            {
                System.out.println("Cold!");
            }
            else if (isHot(guess, randomNumber))
            {
                System.out.println("Hot!");
            }
        }
        while (guess != randomNumber);
        {


            System.out.println("You got it!");
        }
    }

    private static boolean isCold(int guess, int randomNumber)
    {
        final int COLD_DIFFERENCE = 10;
        boolean cold = false;
        if (guess > randomNumber + COLD_DIFFERENCE || guess < randomNumber - COLD_DIFFERENCE)
        {
            cold = true;
        }
        return cold;
    }
    private static boolean isHot(int guess, int randomNumber)
    {
        final int HOT_DIFFERENCE = 10;
        boolean hot = false;
        if (guess <= randomNumber + HOT_DIFFERENCE && guess != randomNumber || guess <= randomNumber - HOT_DIFFERENCE && guess != randomNumber)
        {
            hot = true;
        }
        return hot;
    }
    private static int getRandomNumber()
    {
        final int MAX_NUMBER = 100;

        Random random = new Random();
        //int randomNumber = random.nextInt(MAX_NUMBER) + 1;
        //return randomNumber;
        return random.nextInt(MAX_NUMBER) + 1;

    }
}