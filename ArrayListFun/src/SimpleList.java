import java.util.ArrayList;

public class SimpleList
{
    private void demo()
    {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Indigo");
        colors.add("Black");
        colors.add("Gray");

        for (int i = 0; i < colors.size(); i++)
        {
            System.out.println(colors.get(i));
        }

        for(String element: colors)
        {
            System.out.println(element);
        }
    }

    public static void main(String[] args)
    {
        SimpleList myColors = new SimpleList();
        myColors.demo();

    }
}
