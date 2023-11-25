public class MaxSubArraySum {

    // ? Brute Force Method
    // public static void maxSubArraySum(int arr[]) {
    //     int maxSum = Integer.MIN_VALUE;
    //      int tempSum = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         int start = i;
    //         for (int j = i; j < arr.length; j++) {
    //             int end = j;
    //              tempSum = 0;
    //              for (int k = start; k <= end; k++) {
    //                  tempSum += arr[k];
    //              }
    //             System.out.println(tempSum);
    //             if (tempSum > maxSum) {
    //                 maxSum = tempSum;
    //             }
    //         }

    //     }
    //     System.out.println("Max Sum of the SubArrays is : "+ maxSum);
    // }

    // * Prefix method
    // public static void maxSubArraySum(int arr[]) {
    //     int maxSum = Integer.MIN_VALUE;
    //     int tempSum = 0;

    //     int prefix[] = new int[arr.length];
    //     prefix[0] = arr[0];
    //     // calculate prefix array
    //     for (int i = 1; i < prefix.length; i++) {
    //         prefix[i] = prefix[i - 1] + arr[i];
    //     }

    //     for (int i = 0; i < arr.length; i++) {
    //         int start = i;
    //         for (int j = i; j < arr.length; j++) {
    //             int end = j;

    //             tempSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

    //             System.out.println(tempSum);
    //             if (tempSum > maxSum) {
    //                 maxSum = tempSum;
    //             }
    //         }

    //     }
    //     System.out.println("Max Sum of the SubArrays is : " + maxSum);
    // }

    // * Kadane's algorithm

    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max sum is:"+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2,-3,4,-1,-2,1,5,-3 };
        maxSubArraySum(numbers);
    }
}
