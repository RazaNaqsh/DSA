import java.util.*;
import java.math.*;

public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int tempBinary = binNum;
        while (tempBinary > 0) {
            int lastDigit = tempBinary % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            tempBinary /= 10;
        }
        System.out.println("Decimal of " + binNum + " is :" + decNum);

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary number: ");
        int binary = sc.nextInt();

        binToDec(binary);
    }
}
