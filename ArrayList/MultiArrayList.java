import java.util.*;

public class MultiArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4));

        mainList.add(list);
        mainList.add(list2);
        System.out.println(mainList);

    }
}
