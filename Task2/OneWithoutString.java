import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OneWithoutString {
    public static void main(String[] args) {
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        System.out.println("Enter a Capital letter character ");
        Scanner in = new Scanner(System.in);
        char inputByUser = in.nextLine().charAt(0);
        int result=Arrays.binarySearch(arr, inputByUser);
        if (result>=0) {
            System.out.println(Arrays.copyOfRange(arr, result,arr.length)); 
        }
        else{
            System.out.println("Enter valid Input");
        }
    }
}
