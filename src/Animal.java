public interface Animal {
     void AnimalSound();

       void eat();

}
    class pig implements Animal{
        @Override
        public void AnimalSound() {
            System.out.println(" pig say : wee wee");


        }

        @Override
        public void eat() {
            System.out.println(" pig eat : small things");

        }
        public void sleep(){
            System.out.println( " pig sleep: zee zee");
        }
    }
     class cow implements Animal{


     @Override
     public void AnimalSound() {
         System.out.println(" cow say : baa baa ");

     }

     @Override
     public void eat() {
         System.out.println(" cow eat grass");

     }

     public void run(){
         System.out.println(" cow can't run fast like horse");
     }
 }


    class present {
    public static void main(String[]args){
        pig  j=new pig();
        j.AnimalSound();
        j.eat();
        j.sleep();

//  Animal j= new pig();
 //       j.sleep();

       //  Animal r=new cow();
        // r.run();
    }
    }

