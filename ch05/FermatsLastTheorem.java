public class FermatsLastTheorem
{
    public static void main(String[] args)
    {

        checkFermat(2, 4, 6, 8);
        checkFermat(4, 4, 4, 2);
        checkFermat(2, 2, 2, 2);
    }

    private static void checkFermat(int a, int b, int c, int n)
    {
        System.out.println("checkFermat");
        int result = (int) Math.pow(a,n) + (int) Math.pow(b, n);
        System.out.println(result);
        int result2 = (int) Math.pow(c, n);
        System.out.println(result2);

        if (n > 2 && result == result2)
        {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else
        {
            System.out.println("No, that doesn't work.");
        }
        System.out.println();
    }
}

