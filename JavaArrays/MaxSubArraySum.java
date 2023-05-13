public class MaxSubArraySum {
    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
         int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                 tempSum = 0;
                 for (int k = start; k <= end; k++) {
                     tempSum += arr[k];
                 }
                System.out.println(tempSum);
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }

        }
        System.out.println("Max Sum of the SubArrays is : "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10 };
        maxSubArraySum(numbers);
    }
}
