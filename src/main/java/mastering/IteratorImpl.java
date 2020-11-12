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

    }
}
