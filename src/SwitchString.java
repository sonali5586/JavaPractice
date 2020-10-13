import java.util.Scanner;

public class SwitchString {
    public static void main(String[]args){
        Scanner r=new Scanner(System.in);
        System.out.println(" enter city name");


        String City=r.next();

        switch(City) {
            case "pune":
                System.out.println(" pune is good city");
                break;
            case  "Bangalore" :
                System.out.println(" Bangalore is good for job search");
                break;
            case "Hyderabad":
                System.out.println(" Hyderabad has so many IT company");
              break;
            default:
                System.out.println( City  +"not found ");
            break;



        }

    }
}
