public class Demo
{
    public static void main(String[] args)
    {


       /* final int DAYS_IN_WEEK = 7;
        int daysUntilSpringBreak = 30;

        System.out.println(daysUntilSpringBreak);

        daysUntilSpringBreak = daysUntilSpringBreak - 1;

        System.out.println(daysUntilSpringBreak);

        // Call the awesome method I wrote
        printDaysLeft(daysUntilSpringBreak);

        daysUntilSpringBreak = 1;
        printDaysLeft(daysUntilSpringBreak);

        printIsEvenOrOdd(4);
        printIsEvenOrOdd(11);


        getBeer(17);
        getBeer(55);
    }

    /*private static void printDaysLeft(int daysLeft)
    {
        if (daysLeft >= 10)
        {
            System.out.println("THERE ARE WAY TOO MANY DAYS TO GO!");
        } else if (daysLeft == 1)
        {
            System.out.println("There is only " + daysLeft + " day to go! Woot!");
        }
        else
            {
            System.out.println("There are only " + daysLeft + " days to go! Woot!");
            System.out.println("I am so excited!");
        }*/
    printIsEqual(4,5, 6);
    printIsEqual(7, 7, 7);


}


    private static void printIsEqual(int x, int y, int z)
    {
        System.out.println("The value of x is: "+ x);
        System.out.println("The value of y is: "+ y);
        System.out.println("The value of z is: "+ z);


        if (x == y && y == z)
        {

            System.out.println("The numbers are equal");
        }

    }
    /*private static void printIsEvenOrOdd(int someNumber)
    {
        int remainder = someNumber % 2;

        if (remainder == 1) {
            System.out.println(someNumber + " is odd");
        } else {
            System.out.println(someNumber + " is even");
        }
    }

    private static void getBeer(int age)
    {
        final int DRINKING_AGE = 21;
        if (age >= DRINKING_AGE) {
            System.out.println("You are " + age + " so you get beer!");
        } else {
            int yearsToWait = (DRINKING_AGE - age);

            System.out.println("You are only " + age + " so no beer for you!");
            System.out.println("Come back in " + yearsToWait + " years!");
        }
    }*/
}
