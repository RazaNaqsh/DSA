import java.util.*;

public class Factorial {
    public static void fact(int n){
        int factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println("factorial is:" + factorial);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        fact(n);
    }
}
