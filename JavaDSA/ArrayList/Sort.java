import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 9, 3, 6));
        System.out.println("Before sort- " + list);

        Collections.sort(list);

        System.out.println("After sort- " + list);

        // for descending
        Collections.sort(list, Collections.reverseOrder());
        // comparator - fnx logic
        System.out.println("desc sort- " + list);

    }
}
