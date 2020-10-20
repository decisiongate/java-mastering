package mastering;

import java.io.*;

public class MainApp {
    public static void main(String[] args) {
        try {
            stringCalculator();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void stringCalculator() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        System.out.println(substringCount(s));
        System.out.println(substringCount2(s));
        bufferedReader.close();
    }
    private static long substringCount(String s) {
        int myendIndex=s.length();
        int count=0;
        while(s.length()>0)
        {
            s=s.substring(0, myendIndex--);
            System.out.println(s);
            count++;
        }
        return count;
    }
    private static long substringCount2(String s) {
        int myendIndex=s.length();
        int count=0;
        while(s.length()>0)
        {
            s=s.substring(1, myendIndex--);
            System.out.println(s);
            count++;
        }
        return count;
    }

}
