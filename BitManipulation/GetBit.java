package BitManipulation;

public class GetBit {
    public static void getBit(int num, int target) {
        int shiftBit = 1 << target;
        System.out.println(num & shiftBit);
        if ((num & shiftBit) != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        int num = 6;
        getBit(num, 2);
    }
}