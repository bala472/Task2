import java.util.Arrays;
import java.util.Scanner;

public class SeventeenFirstMaxSecondMin {
    public static void main(String[] args) {
        //int[] arr={1,2,3,4,5,6,7};
        System.out.println("Enter length of the array");
        Scanner in =new Scanner(System.in);
        int inptByUser=in.nextInt();
        int[] arr= new int[inptByUser];
        int k=0;
        for(int i=0;i<inptByUser;i++){
            System.out.println("Enter element for "+(i+1));
            k=in.nextInt();
            arr[i]=k;
        }
        int[] result=new int[arr.length];
        int maxIndex=arr.length-1;
        int minIndex=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                result[i]=arr[maxIndex];
                maxIndex--;
            }
            else{
                result[i]=arr[minIndex];
                minIndex++;
            }
        }
        System.out.println(Arrays.toString(result));
}
}
