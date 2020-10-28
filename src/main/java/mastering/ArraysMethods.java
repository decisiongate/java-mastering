package mastering;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysMethods {

    public void Tasks() {

        String[] aArray = new String[5];
        String[] bArray = {"a","b","c", "d", "e"};
        String[] cArray = new String[]{"a","b","c","d","e"};

        int[] intArray = { 1, 2, 3, 4, 5 };
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);

        // Create an ArrayList from an array:
        String[] stringArray = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);

        // Check if an array contains a certain value:
        String[] stringArray2 = { "a", "b", "c", "d", "e" };
        boolean b = Arrays.asList(stringArray2).contains("a");
        System.out.println(b);

        // Concatenate two arrays:
        int[] intArray3 = { 1, 2, 3, 4, 5 };
        int[] intArray4 = { 6, 7, 8, 9, 10 };
        int[] combinedIntArray = ArrayUtils.addAll(intArray3, intArray4);

        // Joins the elements of the provided array into a single String:
        String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
        System.out.println(j);

        /// Covnert an ArrayList to an array:
        String[] stringArray3 = { "a", "b", "c", "d", "e" };
        ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(stringArray3));
        String[] stringArr = new String[arrayList2.size()];
        arrayList2.toArray(stringArr);
        for (String s : stringArr)
            System.out.println(s);

        // Convert an array to a set:
        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
        System.out.println(set);

        // Reverse an array:
        int[] intArray5 = { 1, 2, 3, 4, 5 };
        ArrayUtils.reverse(intArray5);
        System.out.println(Arrays.toString(intArray5));

        // Remove element of an array:
        int[] intArray6 = { 1, 2, 3, 4, 5 };
        int[] removed = ArrayUtils.removeElement(intArray6, 3);//create a new array
        System.out.println(Arrays.toString(removed));

        // Convert int to byte array:
        byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();

        for (byte t : bytes) {
            System.out.format("0x%x ", t);
        }

    }

}
