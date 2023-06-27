import java.util.*;

public class PrintIncreasing {
    public static void printDecreasingNumber(int n) {
        if (n == 1) {
            System.out.print(n + " ");

            return;
        } else {
            printDecreasingNumber(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void printInc(int n) {
        if (n < 1)
            return;
        printInc(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasingNumber(n);
        System.out.println();
        printInc(n);
    }
}
