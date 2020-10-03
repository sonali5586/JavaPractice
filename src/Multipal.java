 public interface Multipal {
   public void show ();
     public void addition(int a,int b);


}

  interface TestDrive
{
    void display();
}


 class Organic implements Multipal,TestDrive{

        public void show(){
        System.out.println(" 1");
         }

        public void addition( int a,int b){
          int c=a+b;
        System.out.println(" addition is :" +c);
         }


         public void show1(){
            System.out.println(" 2");
         }

     @Override
     public void display() {
    System.out.println(" hi hey there");

     }

 public static void main(String[]args){


         Organic j=new Organic();
         j.show();
     //    j.show1();
        // j.addition(10,20);
     j.display();

           }

             }

