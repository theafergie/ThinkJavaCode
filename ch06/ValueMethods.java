public class ValueMethods
{
    public static void  main(String[] args)
    {

        boolean isItDivisible = isDivisible(10, 5);
        System.out.println(isItDivisible);


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

}
