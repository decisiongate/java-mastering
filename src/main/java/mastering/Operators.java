package mastering;

public class Operators {

    public void Tasks() {

        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false

        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );
        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

        String name = "Test";
        boolean result = name instanceof String;
        System.out.println( result );

    }
}
