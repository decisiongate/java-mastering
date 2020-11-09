package mastering;

import java.util.HashSet;

public class HashSetImpl {

    public void task() {

        HashSet<String> paramNames = new HashSet<>();
        paramNames.add("P1");
        paramNames.add("P2");
        paramNames.add("P3");
        paramNames.add("P4");
        paramNames.remove("P4");

        System.out.println(paramNames.contains("P3"));

        System.out.println(paramNames.size());

        for (String i : paramNames) { System.out.println(i); }

        paramNames.clear();

        HashSet<Integer> paramValues = new HashSet<Integer>();
        paramValues.add(3);
        paramValues.add(4);
        paramValues.add(6);

        for(int i = 1; i <= 6; i++) {
            if(paramValues.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }


    }
}
