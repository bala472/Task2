public class PatternOne {
    public static void main(String[] args) {
        
        for(int i=1;i<10;i++){
            for(int j=1;j<10-i;j++){
                System.out.print(" ");
            }
            for(int s=1;s<i;s++){
                System.out.print(s);
            }
            for(int p=i;p>0;p--){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
