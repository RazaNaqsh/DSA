public class SelectionSOrt {
    public static void selectionSort(int arr[]) {
        
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for (int num : arr) {
      System.out.print(num + " ");
  }
    }
   public static void main(String[] args) {
       int numbers[] = { 5, 4, 1, 3, 2 };
       selectionSort(numbers);
   } 
}
