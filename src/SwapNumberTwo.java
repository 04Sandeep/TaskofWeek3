public class SwapNumberTwo
{
  public static void main(String[] args)
  {
   int a=123, b=349;
   a=a+b;
   b=a-b;
   a=a-b;
   System.out.println("The first number after swapping is" +a);
   System.out.println("The second number after swapping is" +b);
  }
}
    