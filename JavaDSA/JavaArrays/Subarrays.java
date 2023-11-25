public class Subarrays {
    public static void subarrays(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i ; j < numbers.length ; j++) {
                System.out.print("[");
                for (int start = i; start <= j; start++) {
                    System.out.print(" "+numbers[start] + " ");
                }
                System.out.print("]");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarrays(numbers);
    }
}
