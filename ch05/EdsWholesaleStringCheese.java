import java.util.Scanner;

public class EdsWholesaleStringCheese
{
    public static void main(String[] args)
    {
        int handlingCharge = 5;

        System.out.println("Welcome to Crazy Ed's Wholesale String Cheese!");
        System.out.println("What can we get for you today?");
        System.out.println("Select from 1 inch, 2 inch or 3 inch");

        int order;
        Scanner in = new Scanner(System.in);
        order = in.nextInt();

        System.out.println("How many yards would you like?");
        int yards;
        yards = in.nextInt();

        int oneInch = (2 * yards) + (2 * yards) + handlingCharge;
        int twoInch = (4 * yards) + (2 * yards) + handlingCharge;
        int threeInch = (6 * yards) + (4 * yards) + handlingCharge;
        int freeShip = 2 * yards;
        int freeShip3 = 4 * yards;

        if (order == 1 && yards <= 50)
        {
            System.out.println("$2/yd plus $2/yd shipping");
            System.out.println("Your total with shipping and handling fees is $" + oneInch);
        }
        else if (order == 1 && yards > 50)
        {
            System.out.println("$2/yd with FREE shipping!");
            System.out.println("Your total delivery charge with FREE shipping is $" + (oneInch - freeShip));
        }
        else if (order == 2 && yards <= 75)
        {
            System.out.println("$4/yard plus $2/yd shipping");
            System.out.println("Your total with shipping and handling fees is $" + twoInch);
        }
        else if (order == 2 && yards > 75)
        {
            System.out.println("$4/yd with FREE shipping!");
            System.out.println("Your total delivery charge with FREE shipping is $" + (twoInch - freeShip));

        }
        else if (order == 3 && yards <=25)
        {
            System.out.println("$6/yd plus $4/yd shipping");
            System.out.println("Your total with shipping and handling fees is $" + threeInch);

        }
        else if (order == 3 && yards > 25)
            {
            System.out.println("$6/yd with FREE shipping");
                System.out.println("Your total delivery charge with FREE shipping is $" + (threeInch - freeShip3));

            }
            else
        {
            System.out.println("Your order is too crazy!!!");
        }

    }
}
