import java.util.Scanner;

public class CountCharactersInAString {
    public static void main(String args[]){
        String str;
        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String for count characters  ");
        str=scan.nextLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.print("The total number of character in a string :"+count);
    }
}
