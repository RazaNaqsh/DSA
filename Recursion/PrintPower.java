import java.util.*;

public class PrintPower {
    public static int pow(int n, int x) {
        if (x == 0) {
            return 1;
        }
        return n * pow(n, x - 1);
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
