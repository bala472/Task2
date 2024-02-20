import java.util.HashSet;
import java.util.Scanner;

public class SixteenMergingArray {
    public static void main(String[] args) {
        //int[] array1={2,4,5,6,7,9,10,13};
        //int[] array2={2,3,4,5,6,7,8,9,11,15};
         System.out.println("Enter length of the array 1 :");
        Scanner in =new Scanner(System.in);
        int inptByUser1=in.nextInt();
        int[] array1= new int[inptByUser1];
        int k=0;
        for(int i=0;i<inptByUser1;i++){
            System.out.println("Enter element for "+(i+1));
            k=in.nextInt();
            array1[i]=k;
        }
        System.out.println("Enter length of the array 2");
        int inptByUser2=in.nextInt();
        int[] array2= new int[inptByUser2];
        int m=0;
        for(int i=0;i<inptByUser2;i++){
            System.out.println("Enter element for "+(i+1));
            m=in.nextInt();
            array2[i]=m;
        }
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<array1.length;i++){
            result.add(array1[i]);
        }  
        for(int i=0;i<array2.length;i++){
            result.add(array2[i]);
        }
        result.toArray();
        System.out.println(result.toString());
    }
}
