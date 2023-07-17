package BitManipulation;

public class ClearRange {
    public static void clearRange(int n, int i, int j) {
        int a = -1 << j + 1;
        int b = 1 << i - 1;
        int c = a | b;
        System.out.println(n & c);
    }

    public static void main(String[] args) {
        int n = 10;
        clearRange(n, 2, 4);
    }
}
