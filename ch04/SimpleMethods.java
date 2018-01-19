public class SimpleMethods
{
    public static void main(String[] args)
    {
        printCount(5);
        printSum(7, 13);

        printSum(4, 6);
        printSum(7, 2);
    }

    private static void printCount(int count)
    {
        System.out.println("This count is: " + count);
    }

    private static void printSum(int a, int b)
    {
        System.out.print(a);
        System.out.print(" + ");
        System.out.print(b);
        System.out.print(" = ");
        System.out.println(a + b);
    }
}
