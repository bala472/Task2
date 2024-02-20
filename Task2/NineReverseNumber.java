import java.util.Scanner;

public class NineReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to reverse");
        Scanner inpt= new Scanner(System.in);
        int k=inpt.nextInt();
        int result=0;
        while (k>0) {
            result=(result*10)+(k%10);
            k=k/10;
        }
        System.out.println(result);
    }
}
