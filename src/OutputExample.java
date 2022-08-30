public class OutputExample {
    public static void main(String[] args) {

        String str = "we", nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        String string = "As", astr = "";
        char ch1;
        for (int j = 0; j < string.length(); j++)
        {
            ch1 = string.charAt(j);
            astr = ch1 + astr;
        }

        String string1 = "A", str1 = "";
        char ch2;
        for (int k = 0; k < string1.length(); k++)
        {
            ch2 = string.charAt(k);
            str1 = ch2 + str1;
        }

        System.out.print("Reversed word: " +nstr);
        System.out.print("123");
        System.out.print(astr+ "");
        System.out.print("1");
        System.out.print(str1 + "1");

    }
}

