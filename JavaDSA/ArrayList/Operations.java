
import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        // Insert elements : takes O(1)
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        // inserting element at an index. Takes O(n)
        intList.add(1, 9);

        System.out.println(intList);

        // // Get Elements - O(1)
        // int element = intList.get(2);
        // System.out.println(element);

        // // Delete - O(N) linear time, resizing happens internally in java
        // intList.remove(2);
        // System.out.println(intList);

        // // Set Elements at an Index = O(n)
        // intList.set(2, 10);
        // System.out.println(intList);

        // // Check if element exists or not (contains) gives true or false
        // System.out.println(intList.contains(1));
        // System.out.println(intList.contains(11));

    }
}
