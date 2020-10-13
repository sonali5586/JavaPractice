import java.util.Scanner;

public class TernaryAlphabets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter any alphabets,char,symbol");
        char ch = sc.next().charAt(0);


        //if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        //        System.out.println(ch + " is an alphabet.");
        //  else
        //        System.out.println(ch + " is not an alphabet.");


        String output = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch  <= 'Z')
                ? ch + " is an alphabet."
                : ch + " is not an alphabet.";

        System.out.println(output);
    }
}