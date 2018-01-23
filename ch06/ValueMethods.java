public class ValueMethods
{
    public static void  main(String[] args)
    {

        boolean isItDivisible = isDivisible(10, 5);
        System.out.println(isItDivisible);

        System.out.println();

        boolean isATriangle = isTriangle(12, 6, 6);
        System.out.println(isATriangle);


    }
    public static boolean isDivisible(int n, int m)
    {
        boolean divisible;
        if (n % m == 0)
        {
            divisible = true;
        }
        else
        {
            divisible = false;
        }
        return divisible;
    }
    public static boolean isTriangle(int a, int b, int c)
    {
        boolean threeSides;
        if (a + b < c || b + c < a || a + c < b)
        {
            threeSides = false;
        }
        else
        {
            threeSides = true;
        }
        return threeSides;
    }
}
