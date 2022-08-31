import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        int r;
        double pi=3.14, circle;
        System.out.println("Enter radius");
        Scanner s = new Scanner(System.in);
        r=s.nextInt();
        circle = pi * r * r;
        System.out.println("The area of circle is" +" " +circle);
    }
}
