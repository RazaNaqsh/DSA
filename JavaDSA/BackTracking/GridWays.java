public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {

        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m); // ways to go down
        int w2 = gridWays(i, j + 1, n, m); // ways to go right

        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.print("Number of ways: ");
        System.out.println(gridWays(0, 0, n, m));
    }
}
