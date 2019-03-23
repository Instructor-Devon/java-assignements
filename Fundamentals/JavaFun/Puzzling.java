import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Puzzling {
    public static ArrayList<Integer> TrimArray(int[] numbers, int bound) {
        // returns array list with values greater than bound
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int num : numbers) {
            if(num < bound)
                newList.add(num);
        }
        return newList;
    }

    public static int[] RandomIntArray(int lowerBound, int upperBound) {
        int[] arr = new int[10];
        int offset = upperBound - lowerBound;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(offset) + lowerBound;
        }
        Arrays.sort(arr);
        return arr; 
    }
    public static String[] RandomStringArr() {
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = StringManipulator.RandomString(5);
        return arr;
    }
}