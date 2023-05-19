public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int swap = 0;
        for (int i = 0; i < arr.length ; i++) {
            
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap += 1;
                }
            }
        }
        System.out.println("The sorted arr is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        if (swap > 0) {
            System.out.println("Total no of swaps: "+swap);
        } else {
            System.out.println("This array is already Sorted!");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {4,3,2,5,1};
        bubbleSort(numbers);
    }
}
