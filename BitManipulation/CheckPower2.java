package BitManipulation;

public class CheckPower2 {
    public static void checkPow(int num) {
        if ((num & (num - 1)) == 0) {
            System.out.println(num + " is a power of 2");
        } else {
            System.out.println("Not a power of 2");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int num = 8;
        checkPow(num);

        System.out.println(isPowerOfTwo(num));
    }
}
