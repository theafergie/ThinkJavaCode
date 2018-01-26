public class ArrayExercises
{
    public static void  main(String[] args)
    {
        int values[] = {1,2,3,4};
        printArray(values);
    }

    private static void printArray(int[] values)
    {
        for(int value : values)
        {
            System.out.println(value);
        }
    }
}
