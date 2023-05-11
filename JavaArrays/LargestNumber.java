public class LargestNumber {

    public static void largestNumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest number in the array is : " + largest);
    }
    public static void main(String args[]) {
        int numbers[] = { 1, 4, 5, 7, 2 };
        largestNumber(numbers);
    }
}
