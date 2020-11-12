package mastering;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorImpl {

    public void task() {

        ArrayList<String> paramNames = new ArrayList<String>();
        paramNames.add("parameter 1");
        paramNames.add("parameter 2");
        paramNames.add("parameter 3");

        Iterator<String> it = paramNames.iterator();

        System.out.println(it.next());
        System.out.println(it.next());

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> paramValues = new ArrayList<Integer>();
        paramValues.add(634);
        paramValues.add(832);
        paramValues.add(982);
        paramValues.add(524);
        Iterator<Integer> it2 = paramValues.iterator();
        while(it2.hasNext()) {
            Integer i = it2.next();
            if(i < 600) {
                it2.remove();
            }
        }
        System.out.println(paramValues);

    }
}
