
import java.util.Scanner;

public class IntergalacticVending
{

    private static void customerChoice()
    {
        final int TOTAL_OPTIONS_AVAILABLE = 5;
        final int SECRET_NUMBER = 99;

        Scanner in = new Scanner(System.in);
        int choice = 0;

        int[] mealChoice = new int[TOTAL_OPTIONS_AVAILABLE];




        while (choice != SECRET_NUMBER && choice <= 4)
        {
            System.out.print("Enter Choice: ");
            choice = in.nextInt();

            if (choice == 0)
            {
                mealChoice[0]++;
                printArray(mealChoice);
            }
            if (choice == 1)
            {
               mealChoice[1]++;
               printArray(mealChoice);
            }
            else if (choice == 2)
            {
                mealChoice[2]++;
                printArray(mealChoice);
            }
            else if (choice == 3)
            {
                mealChoice[3]++;
                printArray(mealChoice);

            }
            else if (choice == 4)
            {
                mealChoice[4]++;
                printArray(mealChoice);

            }
            else if (choice == SECRET_NUMBER)
            {
                System.out.println("Goodbye");
                printArray(mealChoice);
            }

        }

    }

    private static void printArray(int[] meals)
    {
        System.out.print("{" + meals[0]);
        for (int i = 1; i < meals.length; i++)
        {
            System.out.print(", " + meals[i]);
        }
        System.out.println("}");
    }

    public static void main(String[] args)
    {
        System.out.println("Intergalactic Vending Machine");
        System.out.println();

        customerChoice();
    }

}




