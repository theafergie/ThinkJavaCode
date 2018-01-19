public class Date
{
    public static void main(String args[])
    {
        System.out.println("Date Exercise 2.2/4.3");

        System.out.println("American format:");
        printAmerican("Friday", 19, "January", 2018);

        System.out.println("European format:");
        printEuropean("Thursday", 19, "January", 2018);
    }

    private static void printAmerican(String day, int date, String month, int year)
    {
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.print(year);
        System.out.println();
    }

    private static void printEuropean(String day, int date, String month, int year)
    {
        System.out.print(day);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(year);
        System.out.println();
    }
}
