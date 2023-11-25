import java.util.*;

public class LinearSearch {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("The Key "+ key+ " is at : " +"position "+ (i+1)  );
            }
        }
    }

    public static void main(String args[]) {
        int numbers[] = {2,3,4,5,6,7,10};
        printArr(numbers);
        System.out.println("Enter Key number you wanna find: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        linearSearch(numbers, key);
    }
}
