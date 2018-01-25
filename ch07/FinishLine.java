import java.util.Random;
import java.util.Scanner;

public class FinishLine
{
    public static void main(String[] args)
    {
        System.out.println("Let's play Finish Line\n");

        mainPlay();
    }
    private static void mainPlay()
    {

       //System.out.println("Random roll is: " + die()); //test string

        final int MAX_SCORE = 10;
        final int STARTING_SCORE = 1;

        int player1 = STARTING_SCORE;
        int player2 = STARTING_SCORE;

        while(player1 < MAX_SCORE && player2 < MAX_SCORE) {
            int next = player1 + 1;

            int player1RollOne = die();
            int player1RollTwo = die();
            int player1RollTotal = player1RollOne + player1RollTwo;

            System.out.println("Player One rolled " + player1RollOne + " and " + player1RollTwo);

            if (player1RollTotal == next || (player1RollOne == next) || player1RollTwo == next)
            {
                System.out.println("Player 1 moves up!");

            player1++;
            System.out.println("New Score P1 " + player1);
            System.out.println();
            }

            int next2 = player2 + 1;

            int player2RollOne = die();
            int player2RollTwo = die();
            int player2RollTotal = player2RollOne + player2RollTwo;

            System.out.println("Player Two rolled " + player2RollOne + " and " + player2RollTwo);

            if (player2RollTotal == next2 || (player2RollOne == next2) || player2RollTwo == next2) {
                System.out.println("Player 2 moves up!");

                player2++;
                System.out.println("New Score P2 " + player2);
                System.out.println();
            }
        }
        if(player1 == 10)
        {
            System.out.println("Player 1 Wins!");
        }
        else
        {
            System.out.println("Player 2 Wins!");
        }
    }



    private static int die()
    {
        final int DIE_SIZE = 6;

        Random random = new Random();

        return random.nextInt(DIE_SIZE) + 1;


    }
}

