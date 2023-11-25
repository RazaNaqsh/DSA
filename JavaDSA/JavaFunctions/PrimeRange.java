import java.util.*;
import java.math.*;

public class PrimeRange {

    public static boolean isPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void primesInRange(int n) {
        for (int i = 2; i <=n; i++) {
            if (isPrime(i)) {
               System.out.println(i+" is a Prime number");
            }
        }
     }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range");
        int n = sc.nextInt();

       primesInRange(n);

    }
}
