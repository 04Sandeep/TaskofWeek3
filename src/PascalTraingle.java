public class PascalTraingle
{
 public static void main(String[] args)
 {
  int i,j,k,rows=6;
  for(i=1;i<rows;i++)
  {
    for(j=rows;j>i;j--)
      {
       System.out.print(" ");
      }
   int num=1;
    for(k=1;k<=i;k++)
      {
       System.out.print(num+" ");
       num = num * (i-k)/k;
      }
  System.out.println();
   }
  }
} 