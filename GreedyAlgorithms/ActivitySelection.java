import java.util.*;

public class ActivitySelection {
    public static void actSelection(int s[], int e[]) {
        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = e[0];

        // Counting activity
        for (int i = 1; i < e.length; i++) {
            if (s[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = e[i];
            }
        }

        System.out.println("Max activities = " + maxAct);

        System.out.println("Ans list-" + ans);
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        // Here the end time is already sorted
        int end[] = { 2, 4, 6, 7, 9, 9 };

        actSelection(start, end);
    }
}
