import java.util.*;

public class FractionalKnapsack {
    public static void calcKnapsack(int w[], int v[], int cap) {
        int totalVal = 0;

        double ratio[][] = new double[v.length][2];

        for (int i = 0; i < v.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = v[i] / (double) w[i];
        }

        // ascending order sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (cap > w[idx]) {
                totalVal += v[idx];
                cap -= w[idx];
            } else {
                totalVal += (ratio[i][1] * cap);
                cap = 0;
                break;
            }
        }
        System.out.println("Total Value is " + totalVal);
    }

    public static void main(String[] args) {
        int weight[] = { 10, 20, 30 };
        int value[] = { 60, 100, 120 };
        int cap = 50;
        calcKnapsack(weight, value, cap);
    }
}
