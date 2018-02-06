import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingList
{
    private Scanner in  = new Scanner(System.in);
    private int total = 0;
    private ArrayList <String> addToList = new ArrayList<>();

    private void run()
    {
        ArrayList<String> myList = new ArrayList<>();
        Scanner in  = new Scanner(System.in);
        String command;


        do {
            System.out.println("Enter Command(Add, Print, Remove, Clear, Sort, Find or Exit");

            command = in.nextLine();

            if(command.equalsIgnoreCase("Add"))
            {
               add();
                //System.out.println(addToList.size());
            }
            else if(command.equalsIgnoreCase("Remove"))
            {
                remove();

                //System.out.println(addToList.size());
            }
            else if(command.equalsIgnoreCase("Print"))
            {
                printList(addToList);
            }
            else if (command.equalsIgnoreCase("Clear"))
            {
                clear();
            }
            else if (command.equalsIgnoreCase("Sort"))
            {
                sort();
                printList(addToList);
            }
            else if (command.equalsIgnoreCase("Find"))
            {
                find();
            }
            else
            {
                messageError();
            }
            //System.out.println("The current total is: " + total);
        }
        while(!command.equalsIgnoreCase("exit"));
        {
            System.out.println("Now exiting...");
            System.out.println("Goodbye");

        }
        printList(addToList);


    }
    private void add()
    {
        System.out.print("Enter the item to be added: ");
        String item = in.nextLine();
        addToList.add(item);
        System.out.println("Item added: " + item);
    }

    private void remove()
    {
        System.out.println("Enter the item number to removed: ");
        int number = in.nextInt();
       in.nextLine();
        addToList.remove(number);

        System.out.println("Item removed: " + number);
    }

    private void printList(ArrayList<String> print)
    {
        for(int i = 0; i < print.size(); i++)
        {
            System.out.println(i + ". " + print.get(i));
        }
    }

    private void clear()
    {
        addToList.clear();
    }

    private void messageError()
    {
        System.out.println("Invalid entry. Please try again.");
    }

    private void sort()
    {
        Collections.sort(addToList);
    }
    private void find()
    {
        System.out.println("Enter item to be searched: ");
        String findItem = in.nextLine();
        if(addToList.contains(findItem))
        {
            System.out.println("Found it!");
        }
        else
        {
            System.out.println("No such item!");
        }
    }

    public static void main(String[] args)
    {
        ShoppingList myShoppingList = new ShoppingList();
        myShoppingList.run();
    }
}
