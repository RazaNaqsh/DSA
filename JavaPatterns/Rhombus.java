public class Rhombus {
    public static void rhombus(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            for (int star = 1; star <= n - row; star++) {
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        rhombus(5);
    }
}