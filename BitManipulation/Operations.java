package BitManipulation;

public class Operations {
    public static void getBit(int num, int target) {
        int shiftBit = 1 << target;
        System.out.println(num & shiftBit);
        if ((num & shiftBit) != 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void setBit(int num, int target) {
        int shiftBit = 1 << target;
        System.out.println(num | shiftBit);
    }

    public static void main(String[] args) {
        int num = 4;
        // getBit(num, 2);
        setBit(num, 1);
    }
}