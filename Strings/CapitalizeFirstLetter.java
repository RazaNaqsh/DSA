public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        String str = "nisu day desho nee";

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);


        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            } else {
                sb.append(str.charAt(i));
                char firstCh = Character.toUpperCase(str.charAt(i + 1));
                i++;
                sb.append(firstCh);
            }

        }
        System.out.println(sb);
    }
}
