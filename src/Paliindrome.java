public class Paliindrome {
    public static void main(String[] args) {
        int r, temp, num = 343, sum = 0;
        temp = num;
        while (num > 0)
        {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println(" The given number is Palindrome");
        } else {
            System.out.println(" The given number is not Palindrome");
        }
    }
}
