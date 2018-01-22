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

        printLargest(10, 15);
        printLargest(20, 2);
        printLargest(5, 5);

        printLargestOdd(9,3);
        printLargestOdd(9,57);
        printLargestOdd(6,4);
        printLargestOdd(7,7);


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
        } else if (number < 10)
        {
            System.out.println("The number is small");
        }
        System.out.println();
    }

    private static void printLargest(int number1, int number2)
    {
        System.out.println("printLargest");
        System.out.println("The numbers are: " + number1 + ", " + number2);

        if (number1 > number2)
            System.out.println("The largest number is: " + number1);

        else if (number1 < number2)
        {
            System.out.println("The largest number is: " + number2);
        } else {
            System.out.println("The numbers are equal");
        }
        System.out.println();
    }

    private static void printLargestOdd(int number1, int number2)
    {
        int remainder1 = number1 % 2;
        int remainder2 = number2 % 2;

        System.out.println("printLargestOdd");
        System.out.println("The numbers are: " + number1 + ", " + number2);

        if (number1 > number2 && remainder1 == 1)
        {
            System.out.println("The largest odd number is: " + number1);
        }
        else if (number1 < number2 && remainder2 == 1)
        {
            System.out.println("The largest odd number is: " + number2);
        }
        else if (remainder1 == 0 && remainder2 == 0)
        {
            System.out.println("Neither number is odd");
        }
        else
        {
            System.out.println("Two odds make an even");
            System.out.println("The sum is: " + (number1 + number2));
        }
        System.out.println();
    }
}
