import java.util.*;

public class SumOfN {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = sum(n);
        System.out.println("sum is: " + total);
    }
}
