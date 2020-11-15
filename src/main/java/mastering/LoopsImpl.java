package mastering;

public class LoopsImpl {
    public void task() {

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x++;
        }
        while (x < 5);

        for (int y = 0; y < 5; y++) {
            System.out.println(y);
        }

        String[] params = {"param1", "param2", "param3"};
        for (String z : params) {
            System.out.println(z);
        }

    }
}
