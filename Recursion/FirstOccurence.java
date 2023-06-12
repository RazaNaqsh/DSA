public class FirstOccurence {
    public static int firtOcc(int arr[], int key, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firtOcc(arr, 5, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int index = firtOcc(arr, 5, 0);
        if (index != -1) {
            System.out.println("Index is: " + index);
        } else {
            System.out.println("Element not present");
        }
    }
}
