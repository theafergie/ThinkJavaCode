import java.util.HashMap;

public class SimpleMap
{
    private void demo()
    {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("USA", "United States");
        hashMap.put("MEX", "Mexico");
        hashMap.put("CAN", "Canada");

        System.out.println("Value at USA is " + hashMap.get("USA"));
    }


    public static void main(String[] args)
    {
        SimpleMap simpleMap = new SimpleMap();

        simpleMap.demo();
    }
}
