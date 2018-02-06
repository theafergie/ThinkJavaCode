
import java.util.HashMap;

public class TimeZoneDemo
{
    private HashMap<String, Integer> hashMap = new HashMap<>();

    private void demo()
    {
        //HashMap<String, Integer> hashMap = new HashMap<>();moved to the main scope to be visible to rest of methods

        hashMap.put("EST", -5);
        hashMap.put("CST", -6);
        hashMap.put("MST", -7);
        hashMap.put("PST", -8);
        hashMap.put("GMT", 0);

        System.out.println(getTimeDiff("EST","CST"));
        System.out.println(getTimeDiff("PST", "EST"));

    }

    private int getTimeDiff(String timeZone1, String timeZone2)
    {
        int time1 = hashMap.get(timeZone1);
        int time2 = hashMap.get(timeZone2);

    return time1 - time2;
    }

    public static void  main(String[] args)
    {
        TimeZoneDemo timeZoneDemo = new TimeZoneDemo();
        timeZoneDemo.demo();

       // timeZoneDemo.getTimeDiff();

    }
}
