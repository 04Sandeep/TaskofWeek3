import java.util.Scanner;

public class SmallestNumberTernary {

        public static void main(String[] args)
        {
            int first, second, smallest;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number:");
            first = sc.nextInt();
            System.out.println("Enter second number:");
            second = sc.nextInt();

            smallest =first<second?first:second;

            System.out.println("The smallest number is: "+smallest);
        }
    }


