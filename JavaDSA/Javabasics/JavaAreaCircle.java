import java.util.*;
 
public class JavaAreaCircle {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}
// note, java considers all of decimal numbers as long,
// You've to mention f next to a decimal number to denote it as a float