import java.util.Scanner;

public class ConvertTemp
{
    public static void main(String[] args)
    {

        double f;

        Scanner in = new Scanner(System.in);

        System.out.print("How many Celsius: ");
        f = in.nextDouble();

        double fahrenheit = f * 9 / 5 + 32;

        System.out.print(f);
        System.out.print(" C = ");
        System.out.print(fahrenheit);
        System.out.println(" F");
    }
}
