public class TwentyFour {
    public static void main(String[] args) {
        int n=10;
        int temp=1;
        for(int i=1;i<=n/2-1;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
