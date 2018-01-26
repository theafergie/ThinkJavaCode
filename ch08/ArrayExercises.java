public class ArrayExercises
{
    public static void  main(String[] args)
    {
//        int values[] = {1,2,3,4};
//        printArray(values);

        int eightB[] = {10, 2, 3, 5};
        arrayTotal(eightB);
    }

    private static void printArray(int[] values)
    {
        for(int value : values)
        {
            System.out.println(value);
        }
    }
    private static int arrayTotal(int[] values)
    {
        int total = 0;
        for(int i = 0; i < values.length; i++)
        {
            total += values[i];
            System.out.println("The running total of the array is: " + total);
        }
        return total;

    }
}
