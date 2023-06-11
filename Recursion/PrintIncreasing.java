import java.util.*;

public class PrintIncreasing {
    public static void printDecreasingNumber(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        } else {
            printDecreasingNumber(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasingNumber(n);
    }
}
