import java.util.*;

public class PrintDecreasingNumber {
    public static void printDecreasingNumber(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printDecreasingNumber(n - 1);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasingNumber(n);
    }
}
