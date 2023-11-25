package BitManipulation;

public class CheckOddEven {
    public static void main(String[] args) {
        int n = 4;

        if ((n & 1) == 1) {
            System.out.println("Its an Odd number");
        } else {
            System.out.println("Even Number");
        }
    }
}
