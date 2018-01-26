public class ArrayExercises
{
    public static void  main(String[] args)
    {
        int values[] = {1,2,3,4};
        printArray(values);

        int eightB[] = {10, 2, 3, 5};
        arrayTotal(eightB);

        int eightC[] = {10,40,15,2};
        arrayMax(eightC);
    }

    private static void printArray(int[] values)
    {
        for(int value : values)
        {
            System.out.print(value);
        }
    }
    private static void arrayTotal(int[] values)
    {
        int total = 0;
        for(int i = 0; i < values.length; i++)
        {
            total += values[i];
        }
        System.out.println("\nThe sum of elements: " + total);
    }
    private static void arrayMax(int[] values)
    {
        int max = values[0];

        for(int i = 0; i < values.length; i++)
        {
            if(values[i] > max)
            {
                max = values[i];
            }
        }
        System.out.println("Max number is: " + max);
    }
}
