import java.util.Scanner;

public class MoveBooks
{
    public static void main(String[] args)
    {
        //moveBooks(9);
       // payTax(50);
        printNumbers(1, 5);
    }

    public static void payTax(int totalTax)
    {
        Scanner in = new Scanner(System.in);

        int taxPaid = 0;

        do
            {
                System.out.println("Enter amount to pay: ");
                int payment = in.nextInt();

                taxPaid = taxPaid + payment;

        } while (taxPaid < totalTax);

        System.out.println("No jail for you!");
    }

    public static void printNumbers(int min, int max)
    {
        /*int currentNumber = min;
        while (currentNumber <= max)
        {
            System.out.println(currentNumber);
            currentNumber++;
        }*/
        //FIRST int currentNumber = min initializes ONCE
        //SECOND currentNumber = currentNumber + 1 INCREMENTS BY ONE
        //THIRD currentNumber <= max RUNS UNTIL IT NO LONGER READS TRUE

        for (int currentNumber = min; currentNumber <= max; currentNumber++)
        {
            System.out.println(currentNumber);
        }

    }


    public static void moveBooks(int numberOfBooks)
    {
        int remainingBooks = numberOfBooks;

        while (remainingBooks > 0)
        {
            System.out.println("Book moved!");
            remainingBooks--;
            System.out.println("There are " + remainingBooks + " books remaining.");
        }
        System.out.println("All the books have been moved.");
    }
}
