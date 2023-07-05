
public class RunningSum {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] runningSumRaw(int num[]) {
        int result[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j <= i; j++) {
                result[i] += num[j];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4 };
        int result1[] = runningSumRaw(num);
        printArr(result1);
    }
}