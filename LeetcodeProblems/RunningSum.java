
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
        // this has a timecomplexity of O(n^2)
    }

    public static int[] runningSumOptimized(int num[]) {
        for (int i = 1; i < num.length; i++) {
            num[i] += num[i - 1];
        }
        return num;
        // this has tc of O(n)
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4 };
        int result1[] = runningSumRaw(num);
        System.out.println("unoptimized code: ");
        printArr(result1);
        System.out.println();
        System.out.println("optimized code: ");
        int result2[] = runningSumOptimized(num);
        printArr(result2);
    }
}