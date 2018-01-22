public class LogicMethods
{
    public static void main(String[] args)
    {
        System.out.println("Start of Program");
        printIsLarge(1);
        printIsLarge(99);
        printIsLarge(100);
        printIsLarge(200);
    }

    private static void printIsLarge(int number)
    {
        System.out.println("printIsLarge");
        System.out.println("Number is: " + number);

        if (number > 99)
        {
            System.out.println("The number is large");

        }
        System.out.println();

    }
}

