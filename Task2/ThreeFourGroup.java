import java.util.Scanner;

public class ThreeFourGroup {
    public static void main(String[] args) {
        System.out.println("Enter start of roll");
        Scanner in=new Scanner(System.in);
        int s=in.nextInt();
        System.out.println("Enter end of roll");
        int k=in.nextInt();
        System.out.println("Enter groups:");
        int m=in.nextInt();
        for(int i=1;i<=m;i++){
            System.out.println("Group "+i);
            for(int j=s-1+i;j<=k;j=j+m){
                System.out.println(j);
            
        }
    }
}
}
