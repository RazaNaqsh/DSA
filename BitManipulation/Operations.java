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

    public static void clearBit(int num, int target) {
        int shiftBit = 1 << target;
        System.out.println(num ^ shiftBit);
    }

    public static void clearBit2(int num, int target) {
        int shiftBit = ~(1 << target);
        System.out.println(num & shiftBit);
    }

    public static void updateBit(int num, int target, int mode) {
        if (mode == 1) {
            setBit(num, target);
        } else {
            clearBit(num, target);
        }
    }

    public static void main(String[] args) {
        int num = 6;
        // getBit(num, 2);
        // setBit(num, 1);
        // clearBit(num, 1);
        // clearBit2(num, 1);
        updateBit(num, 0, 1);
    }
}