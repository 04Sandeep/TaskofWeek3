import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args)
    {
        int first, second, largest;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ente first number:");
        first = sc.nextInt();
        System.out.println("Enter second number:");
        second = sc.nextInt();

        largest =first>second?first:second;

        System.out.println("The largest number is: "+largest);
    }
}

