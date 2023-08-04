import java.util.*;

public class FractionalKnapsack {
    public static void calcKnapsack(int w[], int v[], int cap) {
        int totalVal = 0;
        // find ratio, and if its not in order then sort it.
        int ratio[] = new int[w.length];
        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = v[i] / w[i];
        }

        for (int i = 0; i < ratio.length; i++) {
            if (cap > w[i]) {
                totalVal += v[i];
                cap -= w[i];
            } else {
                totalVal += ratio[i] * cap;
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
