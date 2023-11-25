public class LastOccurence {
    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, 5, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int index = lastOcc(arr, 5, 0);
        if (index != -1) {
            System.out.println("Index is: " + index);
        } else {
            System.out.println("Element not present");
        }
    }
}
