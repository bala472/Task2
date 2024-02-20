import java.util.Arrays;
import java.util.Scanner;

public class EighteenSortOddDescending {
    public static void main(String[] args) {
       // int[] arr={1,2,3,4,5,6,7,8,9};
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
        int[] odd=new int[arr.length/2+1];
        int[] even=new int[arr.length/2];
        int oddIndex=0;
        int evenIndex=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                odd[oddIndex]=arr[i];
                oddIndex++;
            }
            else{
                even[evenIndex]=arr[i];
                evenIndex++;
            }
        }
        Arrays.sort(odd);
        Arrays.sort(even);
        int [] result=new int[arr.length];
        int count1=odd.length-1;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                result[i]=odd[count1];
                count1--;
            }else{
                result[i]=even[count2];
                count2++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
