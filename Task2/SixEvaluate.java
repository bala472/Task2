import java.util.Scanner;

public class SixEvaluate {
    public static void main(String[] args) {
       System.out.println("Enter value for 1:");
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       System.out.println("Enter value for 2:");
       int b=in.nextInt();
       System.out.println("value for ++a-b--:" +(++a-b--));
       System.out.println("value for a%b++:" +(a%b++));
       System.out.println("value for a*=b+5:"+(a*=b+5));
       System.out.println("value for x=a>>>2:"+(a>>>2));

    }
}
