import java.util.Scanner;

class ElevenPrintingRepeated {
    public static void main(String[] args) {
        //String input="a1b10;"
        System.out.println("Enter alphanumeric character ");
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder output = new StringBuilder();
        for (int i=0;i<input.length();i++) {
            StringBuilder result =new StringBuilder();
            StringBuilder occurrence =new StringBuilder();
        while (i<input.length()&& !Character.isDigit(input.charAt(i))) {
        result.append(input.charAt(i));
             i++;
            }
            while (i<input.length()&&Character.isDigit(input.charAt(i))) {
            occurrence.append(input.charAt(i));
            i++;
            }
            int repeatCount=Integer.parseInt(occurrence.toString());
            output.append(result.toString().repeat(repeatCount));
            i--;
        }
        System.out.println(output);
    }
}
