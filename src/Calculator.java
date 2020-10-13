import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        Scanner j = new Scanner(System.in);
        System.out.println(" enter a value: ");
        double A = j.nextDouble();
        Scanner k = new Scanner(System.in);
        System.out.println(" enter b value: ");
        double B = k.nextDouble();
        System.out.printf("Enter an Operator: ( * ,- ,+ , / ) ");
        Scanner r =new Scanner(System.in);
        //System.out.println("enter any operator : " ;//
        char operator=r.next() .charAt(0);


        double result;

        double multiplication = A * B;
        System.out.printf("A multiply B is: " + multiplication);

        double subtraction =A-B;
        System.out.println("A subtract B is: " + subtraction);

        double Division=A/B;
        System.out.println(" A div B is: "+Division);

        double Addition=A+B;
        System.out.println(" A add B is : " +Addition);

    }
    }