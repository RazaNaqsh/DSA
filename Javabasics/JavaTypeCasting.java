import java.util.*;

public class JavaTypeCasting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = 25.50f;
        int b = (int) a;
        System.out.println(b);
    }
}
// This is called narrowing or explicit or type casting in Java
// In here the important data maybe lost, because we are doing lossy conversion
// In the sense that we're storing bigger data types inside smaller ones