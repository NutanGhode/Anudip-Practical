abstract class payment{
    abstract void process_payment(double amount);


}
class credit_card extends payment{
    void process_payment(double amount){
        System.out.println("amount in process"+ amount);
    }

}

class UPI extends payment{
    void process_payment(double amount){
        System.out.println("payment throw UPI is"+amount);
    }
}


public class nutan_abstraction {
    public static void main(String[] args) {
      // payment p1 =new credit_card();
        // p1.process_payment(1000.52);
      // payment p2=new UPI();
            //   p2.process_payment(500.75);

        credit_card c1=new credit_card();
        c1.process_payment(542.540);
        UPI u1 =new UPI();
        u1.process_payment(500.50);
        }

}


