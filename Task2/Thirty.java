
import java.util.ArrayList;
import java.util.Arrays;

public class Thirty {
    public static void main(String[] args) {
        /*int[][] arr={{1,2,3},
                    {4,5,6},
                    {7,8,9}};*/
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
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<2*arr.length-1;i++){
            result.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                result.get(i+j).add(arr[i][j]);
            }
        }
        System.out.println(result);
    }
}
