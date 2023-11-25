import java.util.*;

public class ActivitySelection {
    public static void actSelection(int s[], int e[]) {

        // sorting
        int activities[][] = new int[s.length][3];
        for (int i = 0; i < s.length; i++) {
            activities[i][0] = i;
            activities[i][1] = s[i];
            activities[i][2] = e[i];
        }
        // Lambda function -> shortform
        // * Comparator is an interface for comparing objects in java.
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        // Counting activity
        for (int i = 1; i < e.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max activities = " + maxAct);

        System.out.println("Ans list-" + ans);
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        // Here the end time is already sorted
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // Not sorted
        int s[] = { 0, 1, 3, 5, 5, 8 };
        int e[] = { 6, 2, 4, 7, 9, 9 };

        actSelection(s, e);
    }
}
