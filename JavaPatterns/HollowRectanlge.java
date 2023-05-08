public class HollowRectanlge {
    public static void hollowRectangle(int totalRow, int totalCol) {
         for (int row = 1; row <= totalRow; row++) {
            for (int col = 1; col <= totalCol; col++) {
                if (row == 1 || row == 4 || col == 1 || col == 5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
       hollowRectangle(4, 5);
    }
}
