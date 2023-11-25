import java.util.*;

public class Strings {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        // /* A CHAR ARRAY */
        // char arr[] = { 'a', 'b', 'c', 'd' };

        // /* STRING ARRAY  + WAYS TO INITIALIZE STRINGS */
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String name = "valhalla";
        // System.out.println(name.length());
        String gang = "TOKYO MANJI GANG";
        printLetters(gang);
    }

}