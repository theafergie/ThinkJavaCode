package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        customerChoice();
       // secretNumber(99);
    }

    private static void customerChoice()
    {
        final int SECRET_NUMBER = 99;
        final int MAX_MEAL_OPTIONS = 5;
        final int MAX_DAILY_SALES_ALLOWED = 10;

        Scanner in = new Scanner(System.in);



        int [] total = new int[MAX_DAILY_SALES_ALLOWED];

        int currentTotal = 1;
        int totalZero = 1;
        int totalOne = 1;
        int totalTwo = 1;
        int totalThree = 1;
        int totalFour = 1;




        for(int i = 0; i < total.length; i++)
        {
            System.out.println("Choose from 0 - 4");
            int choice = in.nextInt();

            if(choice == 0)
            {
                System.out.println("We've sold " + totalZero + " of " + choice);
                totalZero++;
            }
            if(choice == 1)
            {
                System.out.println("We've sold " + totalOne + " of " + choice);
                totalOne++;
            }
            if(choice == 2)
            {
                System.out.println("We've sold " + totalTwo + " of " + choice);
                totalTwo++;
            }
            if(choice == 3)
            {
                System.out.println("We've sold " + totalThree + " of " + choice);
                totalThree++;
            }
            if(choice == 4)
            {
                System.out.println("We've sold " + totalFour + " of " + choice);
                totalFour++;
            }
             }

    }



    private static void secretNumber(int secret)
    {
        final int SECRET_NUMBER = 99;

        Scanner in = new Scanner(System.in);


        secret = in.nextInt();
        if(secret == SECRET_NUMBER)
        {
            System.out.println("Goodbye");
        }
    }


}
