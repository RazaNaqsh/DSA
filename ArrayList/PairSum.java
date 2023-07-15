import java.util.*;

public class PairSum {
    public static boolean isPair(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int target = 6;

        if (isPair(list, target)) {
            System.out.println("Pair exists");
        } else {
            System.out.println("Pairs do not exist");
        }
    }
}
