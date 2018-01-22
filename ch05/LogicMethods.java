public class LogicMethods
{
    public static void main(String[] args)
    {
        System.out.println("Start of Program");
        printIsLarge(1);
        printIsLarge(99);
        printIsLarge(100);
        printIsLarge(200);

        printIsLargeOrSmall(1);
        printIsLargeOrSmall(50);
        printIsLargeOrSmall(195);
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
    private static void printIsLargeOrSmall(int number)
    {
        System.out.println("printIsLargeOrSmall");
        System.out.println("Number is: " + number);

        if (number > 99)
        {
            System.out.println("The number is large");
        }
        else if (number < 10)
        {
            System.out.println("The number is small");
        }
        System.out.println();
    }
}

