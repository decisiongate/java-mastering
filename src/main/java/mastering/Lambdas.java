package mastering;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdas {

    public static void process(Runnable r){
        r.run();
    }

    public void Tasks() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(384429158);
        numbers.add(374948242);
        numbers.forEach( (n) -> { System.out.println(n); } );

        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        Runnable runnableWithLambda = () -> System.out.println("new thread inside a Lambda expression...");
        process(runnableWithLambda);

        new Thread(() -> System.out.println("new thread...")).start();

        Runnable r = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("newer thread...");
            }
        };
        new Thread(r).start();

    }
}
