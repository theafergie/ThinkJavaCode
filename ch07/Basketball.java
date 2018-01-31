import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

public class Basketball
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Ultimate Basketball Game!");
        play();
    }

    public static void play()
    {
        final int WINNING_SCORE = 21;

        boolean gameOver = false;
        int homeScore = 0; //starting score for each team
        int visitorScore = 0;

        while(!gameOver)
        {
            //Play a round
            homeScore += getPlayScore();
            visitorScore += getPlayScore();



            System.out.println("Home: " + homeScore + "  Visitor: " + visitorScore);

            if(homeScore >= WINNING_SCORE || visitorScore >= WINNING_SCORE)
            {
                gameOver = true;
            }
        }
        if (homeScore >= visitorScore)
        {
            System.out.println("Home Team Wins!");
        }
        else
        {
            System.out.println("Visitor Team Wins!");
        }
    }

    private static int getPlayScore()
    {
        int diceRoll= twoDieRoll();

        int score = 0;

        if (diceRoll == 2 || diceRoll == 10 || diceRoll == 12)
        {
            score = 3;
        }
        else if(diceRoll == 4 || diceRoll == 6 || diceRoll == 8)
        {
            score = 2;
        }
        else if(diceRoll == 5)
        {
            score = 1;
        }

        return score;
    }
    private static int twoDieRoll()
    {

        int die1 = dieRoll();
        int die2 = dieRoll();

        int dieTotal = die1 + die2;
        return dieTotal;
    }
    private static int dieRoll()
    {
        final int DIE_SIZE = 6;

        Random random = new Random();

        return random.nextInt(DIE_SIZE) + 1;
    }
}
