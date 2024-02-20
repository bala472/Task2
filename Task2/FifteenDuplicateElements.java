import java.util.Scanner;

public class FifteenDuplicateElements {
    public static void main(String[] args) {
       // int[] arr= {77,20,66,100,100,44,2,1,20,3,7,0,66,3,50,-33,200,-2,10,-33,55,26};
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
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
          }
        }
    }
}
