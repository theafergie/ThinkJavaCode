import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    private void execute()
    {
        ArrayList<String> furniture = new ArrayList<>();

        furniture.add("Couch");
        furniture.add("Table");
        furniture.add("Bed");


        printList(furniture);

        furniture.add(furniture.size(),"Bar Stool");
        printList(furniture);

        furniture.add(0, "Beverage Station");
        printList(furniture);

        furniture.add(2, "Chaise Lounge");
        printList(furniture);

        furniture.remove(furniture.size() - 1);
        printList(furniture);

        furniture.remove(0);
        printList(furniture);

        furniture.remove(1);
        printList(furniture);

    }

    private void printList(ArrayList<String> print)
    {
        for (int i = 0; i < print.size(); i++)
        {
            System.out.print(print.get(i) + " : ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        ListDemo myFurniture = new ListDemo();
        myFurniture.execute();

//       ListDemo myPrint = new ListDemo();
//        myPrint.execute();
    }
}
