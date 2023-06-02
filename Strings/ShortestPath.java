public class ShortestPath {

    public static float shortestPath(String str) {
        /* First find coordinates */
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                x--;
            }
            if (str.charAt(i) == 'E') {
                x++;
            }
            if (str.charAt(i) == 'S') {
                y--;
            }
            if (str.charAt(i) == 'N') {
                y++;
            }
        }
        System.out.println("x:" + x + "; y: " + y);
        int X2 = x*x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        float displacement = shortestPath(path);
        System.out.println(displacement);
    }
}
