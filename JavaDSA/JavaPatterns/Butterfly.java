public class Butterfly {
    public static void buttefly(int n) {
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (n - row); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int star = 1; star <= n - row + 1; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (row - 1); space++) {
                System.out.print(" ");

            }
             for (int star = 1; star <= n - row+1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        buttefly(4);
    }
}
