import java.util.ArrayList;
import java.util.Arrays;

public class PairSumRotated {

    public static boolean pairOptimized(ArrayList<Integer> list, int target) {
        // This takes O(n)

        // find pivot
        int bp = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int rp = bp;
        int lp = bp + 1;

        int n = list.size();

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target)
                return true;

            if (list.get(lp) + list.get(rp) < target)
                lp = (lp + 1) % n;
            else
                rp = (n + rp - 1) % n;

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11, 15, 6, 8, 9, 10));
        int target = 16;

        if (pairOptimized(list, target)) {
            System.out.println("Pair exists");
        } else {
            System.out.println("Pairs do not exist");
        }
    }
}
