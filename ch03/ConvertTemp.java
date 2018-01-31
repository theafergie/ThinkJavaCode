import java.util.Scanner;

public class ConvertTemp
{
    public static void main(String[] args)
    {

        double c;

        Scanner in = new Scanner(System.in);

        System.out.print("How many Celsius: ");
        c = in.nextDouble();

        double fahrenheit = c * 9 / 5 + 32;

        System.out.print(c);
        System.out.print(" C = ");
        System.out.print(fahrenheit);
        System.out.println(" F");
    }
}
