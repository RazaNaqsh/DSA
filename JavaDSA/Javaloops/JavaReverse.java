import java.util.*;

public class JavaReverse {
    public static void main(String args[]) {

        System.out.print("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int rev=0 ;
        while (temp > 0) {
            int digit = temp % 10;
            rev = 10 * rev + digit;
            temp /= 10;
        }
        System.out.println("rev no is "+ rev);
    }
}
