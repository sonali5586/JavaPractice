public interface Car1 {
    void start ();
    void tank();


}

class Audi implements Car1{

    @Override
    public void start() {
        System.out.println(" Audi start by itself");
    }

    @Override
    public void tank() {
        System.out.println("audi is petrol car ");
    }

    public void wheels(){
        System.out.println(" audi have 4 wheels");
    }
}
    class Bmw implements Car1{

    @Override
    public void start() {
        System.out.println(" Bmw start by key");

    }

    @Override
    public void tank() {
        System.out.println(" Bmw is petrol car");

    }
}
    class suv implements Car1{
    @Override
    public void start() {
        System.out.println(" suv start by key");

    }

    @Override
    public void tank() {
        System.out.println(" suv is cng car");

    }
    public void wheels(){
        System.out.println("suv have 4 wheels ");
    }
}
    class play{
    public static void main(String[] args) {

     //   Audi j=new Audi();
       // j.start();
        // j.tank();
        //j.wheels();

       Car1 w=new suv();
      w.start();
      w.tank();
      // w.wheels();

    }
}