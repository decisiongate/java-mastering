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

        for (int g = 0; g < 10; g++) {
            if (g == 4) {
                break;
            }
            System.out.println(g);
        }

        for (int h = 0; h < 10; h++) {
            if (h == 4) {
                continue;
            }
            System.out.println(h);
        }

        int param = 10;
        switch (param) {
            case 4:
                System.out.println("Param is 4th.");
                break;
            case 8:
                System.out.println("Param is 8th.");
                break;
            default:
                System.out.println("Another param...");
        }

        int paramValue = 42;
        if (paramValue < 20) {
            System.out.println("paramValue < 20");
        } else if (paramValue < 30) {
            System.out.println("paramValue < 30");
        } else {
            System.out.println("paramValue...");
        }

    }
}
