public class MyLoops
{
    public static void main(String [] args)
    {
        System.out.println("sevenAForLoop");
        sevenAForLoop();
        System.out.println("sevenAWhileLoop");
        sevenAWhileLoop();
        System.out.println("sevenADoWhileLoop");
        sevenADoWhileLoop();
    }

    public static void sevenAForLoop()
    {
        for(int x = 0; x <= 10; x++)
        {
            System.out.println(x);
        }
        for(int x = 10; x >= 1; x--)
        {
            System.out.println(x);
        }
    }

    public static void sevenAWhileLoop()
    {int y = 0;
        while (y <= 10)
        {
            System.out.println(y);
            y++;
        }
        while (y >= 1)
        {
            System.out.println(y);
            y--;
        }
    }

    public static void  sevenADoWhileLoop()
    {
        int z = 0;
        do
        {
            System.out.println(z);
            z++;
        }
        while (z <= 10);

        int a = 10;
        do {
            {
                System.out.println(a);
                a--;
            }
        }
        while (a >= 1);

    }
}
