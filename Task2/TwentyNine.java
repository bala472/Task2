public class TwentyNine {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            if(i==0){
                for(int j=0;j<n-1;j++){
                    System.out.print("*");
                }
            }
            else if(i>0&&i<n-1){
                for(int l=i;l<n-1;l++){
                    System.out.println("*");
                }
            }
            else if(i==n-1){
                for(int k=0;k<n;k++){
                System.out.print("*");
                }
            }
            }
        }
    }
