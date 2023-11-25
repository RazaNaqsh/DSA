import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 6, 8));

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            // if (max < list.get(i)) {
            // max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }
        System.out.println("max is: " + max);
    }
}
