import java.util.Scanner;

public class EigthFIndAscii {

    public static void main(String[] args) {
        System.out.println("Enter character to find ASCII value");
        Scanner in =new Scanner(System.in);
        char inptByUser=in.nextLine().charAt(0);
        int converted= inptByUser;
        System.out.println("ASCII value of "+inptByUser+" is "+converted);
    }
}