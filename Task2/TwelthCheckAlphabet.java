import java.util.Scanner;

public class TwelthCheckAlphabet {
    public static void main(String[] args) {
        System.out.println("Enter a character to find alphabet or not");
        Scanner in=new Scanner(System.in);
        char inptByUser=in.nextLine().charAt(0);
        int result = inptByUser;
        if(result>=65&&result<=90){
            System.out.println("Given character is Alphabet");
        }
        else if(result>=97&&result<=122){
            System.out.println("Given character is Alphabet");
        }
        else{
            System.out.println("!!!!Given Character is not alphabet!!!!");
        }
    }
}
