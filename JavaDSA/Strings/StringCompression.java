public class StringCompression {
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        // String newStr = "";
        String str = "aaabbbbccdde";

        String result = compress(str);
        System.out.println(result);

        // for (int i = 0; i < str.length(); i++) {
        // Integer count = 1;

        // while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        // count++;
        // i++;
        // }
        // newStr += str.charAt(i);
        // if (count > 1) {
        // newStr += count.toString();
        // }
        // }
        // System.out.println(newStr);
    }
}
