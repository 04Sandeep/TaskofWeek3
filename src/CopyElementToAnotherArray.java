public class CopyElementToAnotherArray {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] copyArr = new int[arr.length];

        for(int i = 0; i<arr.length; i++)
            copyArr[i] = arr[i];

        System.out.println("The original array is: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println("\n\nContents of the copied array is");
        for (int i = 0; i < copyArr.length; i++)
            System.out.print(copyArr[i] + " ");
    }
}
