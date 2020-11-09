package mastering;

import java.util.HashMap;

public class HashMapImpl {

    public void task() {
        HashMap<String, Double> paramSet = new HashMap<>();
        paramSet.put("parameter P1", 8572.43353);
        paramSet.put("parameter P2", 34883.5453234);
        paramSet.put("parameter P3", 8472423.868546);
        System.out.println(paramSet);
        System.out.println(paramSet.size());

        System.out.println(paramSet.get("parameter P2"));

        paramSet.remove("parameter P3");

        for (String i : paramSet.keySet()) { System.out.println("key: " + i + " value: " + paramSet.get(i)); }

        for (String i : paramSet.keySet()) System.out.println(i);

        for (Double i : paramSet.values()) System.out.println(i);

        for (String i : paramSet.keySet()) System.out.println("key: " + i + " value: " + paramSet.get(i));

        paramSet.clear();

    }
}
