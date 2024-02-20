import java.lang.reflect.Array;
import java.util.Arrays;

public class Nineteen {
    public static void main(String[] args) {
        int[][] arr ={{1,2,3,4,5},
                      {1,2,3,4,5,6,7,8},
                      {1,2,3}};

                 //int temp=0;

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length/2;j++){
                   int temp=arr[i][j];
                    arr[i][j]=arr[i][arr[i].length-1-j];
                    arr[i][arr[i].length-1-j]=temp;
                }
            }
            System.out.println(Arrays.deepToString(arr));
    }
}
