import java.util.*;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void fibSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibSeries(n);
    }
}
