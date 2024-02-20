public class PatternTwo {
    public static void main(String[] args) {
        int n=9;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int temp=n-i+1;
            for(int s=1;s<=i;s++){
                System.out.print(temp +" ");
                temp++;
            }
            temp=n-i+1;
            for(int p=1;p<i;p++){
                System.out.print(temp++ +" ");
            }
            System.out.println();
        }
    }
}
