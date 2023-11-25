package BitManipulation;

public class CountSetBit {
    public static int countSet(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(countSet(num));
    }
}
