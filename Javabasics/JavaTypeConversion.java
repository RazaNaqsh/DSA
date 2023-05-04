import java.util.*;

public class JavaTypeConversion {
    public static void main(String args[]) {
        // This is possible,
        int a = 5;
        long b = a;
        System.out.println(b);
        // But the reverse isnt possible
        // we cant convert long into int
    }
}

//? Conversion can only happen when :
// * Type compatible
// * Destination type > Source type ( meaning in size )

// ! byte -> short -> int -> float -> long -> double
// left ones can be converted to the right ones, but not vice versa

//? This is also called implicit or widening or type conversion in Java

// ! Also, character Can be converted into int, a will convert to 97 