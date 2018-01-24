public class Loops7C
{
    public static void main(String[] args)
    {
        System.out.println("sevenCForLoop");
        sevenCForLoop();
        System.out.println("sevenCWhileLoop");
        sevenCWhileLoop();
        System.out.println("sevenCDoWhileLoop");
        sevenCDoWhileLoop();
    }

    public static void sevenCForLoop()
    {
        for (int x = 100; x >= -100; x -= 8) {
            System.out.println(x);
        }

    }

    public static void sevenCWhileLoop()
    {
        int y = 100;
        while (y >= -100) {
            System.out.println(y);
            y -= 8;
        }
    }

    public static void sevenCDoWhileLoop()
    {
        int z = 100;
        do {
            {
                System.out.println(z);
                z -= 8;
            }
        } while (z >= -100);

    }

}
