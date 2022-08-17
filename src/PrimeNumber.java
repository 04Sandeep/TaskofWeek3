public class PrimeNumber
{
  public static void main(String args[])
   {
     int count=0, i=2, num=5;
     while(i<=num/2){
 	if(num % i == 0){ 
	      count++;
	      break;
	   }
	   i++;
      }
       if(count==0){
         System.out.println(num+ "is  a prime");
       }
          else{
          System.out.println(num+ " is not a prime");
       }
   }
}