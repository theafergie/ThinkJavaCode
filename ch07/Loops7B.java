public class Loops7B
{
    public static void main(String[] args)
    {
        System.out.println("sevenBForLoop");
        sevenBForLoop();
        System.out.println("sevenBWhileLoop");
        sevenBWhileLoops();
        System.out.println("sevenBDoWhileLoop");
        sevenBDoWhileLoop();

    }

    public static void sevenBForLoop()
    {
        for(int x = 0; x <= 100; x += 10)
        {
            System.out.println(x);
        }
    }

    public static void sevenBWhileLoops()
    {
        int y = 0;
        while(y <= 100)
        {
            System.out.println(y);
            y += 10;
        }
    }

    public static void sevenBDoWhileLoop()
    {
        int z = 0;
        do {
            {
                System.out.println(z);
                z += 10;
            }
        }while (z <= 100);
    }
}
