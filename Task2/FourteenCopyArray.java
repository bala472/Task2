import java.util.Arrays;
import java.util.Scanner;

public class FourteenCopyArray {
    public static void main(String[] args) {
        System.out.println("Enter length of the array");
        Scanner in =new Scanner(System.in);
        int inptByUser=in.nextInt();
        int[] original= new int[inptByUser];
        int k=0;
        for(int i=0;i<inptByUser;i++){
            System.out.println("Enter element for "+(i+1));
            k=in.nextInt();
            original[i]=k;
        }
        System.out.println("original array" +Arrays.toString(original));
        int[] copyArray = new int[original.length];
        for(int i=0;i<copyArray.length;i++){
            copyArray[i]=original[i];
        }
        System.out.println("Copy of Array "+ Arrays.toString(copyArray));
    }
}
