public class LargestSmallestArray
{
 public static void main(String[] args)
 {
  int arr[]= new int[] {30,20,14,9,18,50,45};
  int smallest = arr[0];
  int largest = arr[0];
  for(int j=1;j<arr.length; j++){
      if(arr[j]>largest)
        largest=arr[j];
      else if(arr[j]<smallest)
        smallest=arr[j];
  }
  System.out.println("largest number is" +largest);
  System.out.println("smallest number is" +smallest);
 }
}
  