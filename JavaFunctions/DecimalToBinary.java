import java.util.*;
import java.math.*;

public class DecimalToBinary {
    public static void decToBin(int dec) {
        int tempDec = dec;
        int binary = 0;
        int pow = 0;
        while (tempDec > 0) {
            int binDigit = tempDec % 2;
            binary = binary + (binDigit * (int)Math.pow(10, pow));
            tempDec /= 2;
            pow++;
        }
        System.out.println("Binary of " + dec + " is: " + binary);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int decimal = sc.nextInt();

        decToBin(decimal);
    }
}

// Decimal to Binary
// 5
// div it by 2, catch the remainder
// store it in rev order.
