public class PatternFour {
public static void main(String[] args) {
    int n=9;
    int temp=n;
    for(int i=0;i<n;i++){
        for(int k=0;k<i;k++){
            System.out.print(" ");
        }
        for(int j=i;j<n;j++){
            System.out.print(temp+" ");
        }
        temp--;
        System.out.println();
    }
}    
}
