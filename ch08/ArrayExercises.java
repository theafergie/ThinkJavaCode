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

        int eightD[] = {1, 5, 9, 50, 10};
        arrayMaxIndex(eightD);

        double eightE[] = {1.0, 1.0, 5.0, 6.0, 3.0};
        arrayAverage(eightE);
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
    private static void arrayMaxIndex(int[] values)
    {
        int maxValueIndex = 0;

        for(int i = 0; i < values.length; i++)
        {
            if(values[i] > values[maxValueIndex])
            {
                maxValueIndex = i;
            }
        }
        System.out.println("Index " + maxValueIndex + " holds the highest value element.");
    }

    private static void arrayAverage(double[] values)
    {
        double average = 0.0;
        for(double i = 0.0; i < values.length; i++)
        {
            average += values[(int) i] / values.length;
        }
        System.out.println("arrayAverage is: " + average);
    }
}
