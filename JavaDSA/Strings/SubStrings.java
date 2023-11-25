public class SubStrings {
    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    
    public static void main(String[] args) {
        String str = "Konnichiwa";
        String substr = substring(str, 0, 4);
        System.out.println(substr);
    }
}
