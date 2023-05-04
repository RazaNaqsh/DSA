import java.util.*;

public class JavaInput {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // Prints first word till space
        // String input = sc.next();
        // System.out.println(input);

        // Prints first para
        String name = sc.nextLine();
        System.out.println(name);

        // For integer 
        int number = sc.nextInt();
        System.out.println(number);

        // For float
        float price = sc.nextFloat();
        System.out.println(price);

        /* There are more like nextByte nextFloat and all with primitive data types */
    }
}
