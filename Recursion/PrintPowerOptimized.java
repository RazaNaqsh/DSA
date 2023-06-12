
import java.util.*;

public class PrintPowerOptimized {
    public static int pow(int n, int x) {
        if (x == 0) {
            return 1;
        }

        int halfPowerSq = pow(n, x / 2) * pow(n, x / 2);

        if (x % 2 != 0) {
            halfPowerSq = n * halfPowerSq;
        }
        return halfPowerSq;

    }

    public static void main(String args[]) {
        System.out.print("enter Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        System.out.print("enter pow:");
        int pow = sc.nextInt();
        int power = pow(n, pow);

        System.out.println(power);
    }
}
