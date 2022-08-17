public class Factorial
{
 public static void main(String[] args)
 {
   int k, n=6, fact=1;
   for(k=1;k<=n;k++){
      fact=fact*k;
   }
   System.out.println("factorial of number is " +fact);
 }
}