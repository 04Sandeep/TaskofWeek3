public class StringExample {
    public static void main(String[] args) {

        System.out.println(reverseStringWithoutSpecialChar("We123As1A1Team456Achieve789"));
    }

    public static String reverseStringWithoutSpecialChar(final String str) {
        int len = str.length() - 1;
        char[] chars = str.toCharArray();

        int i = 0;

        while (i < len) {
            char firstCh = str.charAt(i);
            char lastCh = str.charAt(len);

            if (!isAlphabet(firstCh))
            {
                i++;
            }else if (!isAlphabet(lastCh))
            {
                len--;
            }
            else {
                char temp = chars[i];
                chars[i] = chars[len];
                chars[len] = temp;
               i++;
                len--;
            }
        }

        return String.copyValueOf(chars);
    }

    private static boolean isAlphabet(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }

        return false;
    }
}