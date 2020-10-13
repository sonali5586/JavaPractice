import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args)
    {
        Scanner j=new Scanner(System.in);
        System.out.println(" enter no: ");
        int no= j.nextInt();
        String evenOdd=(no%2==0)?"even" :"odd";   //ternary Operator
        System.out.println(no+"is"+evenOdd);
    }
}
