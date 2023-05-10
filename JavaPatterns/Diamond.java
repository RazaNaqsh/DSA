public class Diamond {
    public static void diamond(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
         for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row-1 ; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * (n-row+1)) - 1; star++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        diamond(5);
    }
}
