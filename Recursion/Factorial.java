import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int factRev(int n) {
        if (n <= 1)
            return 1;
        return n * factRev(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("factorial is: " + fact);
        int rev = factRev(n);
        System.out.println("factorial Rev is: " + rev);
    }
}
