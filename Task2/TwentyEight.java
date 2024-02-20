import java.util.Scanner;

public class TwentyEight {
    public static void main(String[] args) {
        System.out.println("Enter number of terms");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=0;
        int terms=0;
        for(int i=0;i<n;i++){
            terms=terms*10+1;
            result=result+terms;
        }
        System.out.println(result);
    }
}
