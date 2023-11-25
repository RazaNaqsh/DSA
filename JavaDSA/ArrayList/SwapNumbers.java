import java.util.*;

public class SwapNumbers {

    // flex but unoptimized
    public static ArrayList<Integer> swap(ArrayList<Integer> list, int idx1, int idx2) {
        int el1 = list.get(idx1);
        int el2 = list.get(idx2);

        list.set(idx1, el2);
        list.set(idx2, el1);

        // a three line solution wud be
        // ? int temp = list.get(idx1);
        // ? list.set(idx1, list.get(idx2));
        // ? list.set(idx2,temp);

        // Also no need to return arraylist since the original list wudve already
        // changed.
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> result = swap(list, 1, 3);

        System.out.println(result);
    }

}
