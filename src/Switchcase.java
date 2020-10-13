import javax.swing.*;
import java.util.Scanner;

public class Switchcase {


    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        System.out.println(" enter a value: ");
        double A = j.nextDouble();
        Scanner k = new Scanner(System.in);
        System.out.println(" enter b value: ");
        double B = k.nextDouble();
        System.out.printf("Enter an Operator: ( * ,- ,+ , / ) ");
        Scanner r = new Scanner(System.in);
        //System.out.println("enter any operator : " ;//

        char operator = r.next().charAt(0);


        double result;

          switch(operator)
        {
            case '+':
                result = A + B;
                break;

               case '-':
                result = A - B;
                break;

             case '*':
             result = A *B;
              break;

            case '/':
                result=A/B;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }


        System.out.println(" display result" +result);



    }
}




