public class Player
{
    private String name;
    private int score;

    public Player(String name)
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
