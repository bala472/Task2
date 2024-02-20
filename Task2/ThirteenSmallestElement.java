import java.util.Scanner;

public class ThirteenSmallestElement {
    public static void main(String[] args) {
       // int[] arr = {55,60,1,5,77,88,100,64,22,86,100,74,0,88,-100,90,88,-2,0,56,74,33,28};
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
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
