public class LargestNumber {

    public static void largestNumber(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println("The Smallest number in the array is : " + smallest);
        System.out.println("The largest number in the array is : " + largest);
    }
    public static void main(String args[]) {
        int numbers[] = { 1, 4, 5, 7, 2 };
        largestNumber(numbers);
    }
}
