import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println(" enter any alphabets");
        char ch=sc.next().charAt(0);


  //      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
    //    {
        //    System.out.println(ch + " is vowel");
      //  }
        //else
        //{
          //  System.out.println(ch + "is consonant");
        //}


        switch( ch ){
            case 'a':
            case 'i':
            case 'o':
            case 'u':
            case 'e':

                System.out.println(ch+" is vowel") ;

                break;

            default:
                System.out.println(ch+" is consonant");



        }



    }
}
