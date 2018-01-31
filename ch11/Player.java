public class Player
{
    String name;
    int score;

    public Player()
    {
        name = "Player 1";
        score = 0;
    }

    public void increaseScore()
    {
        score++;
    }

    public void resetScore()
    {
        score = 0;
    }
}
