public class TwentySix {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<2*n;i++){
            for(int j=0;j<=2*n;j++){
                if(i+j<n){
                    System.out.print("*");
                }
                else if(i>j&&i-j>=n){
                    System.out.print("*");
                }
                else if(j>i&&j-i>=n){
                    System.out.print("*");
                }
                else if(i+j>2*n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
