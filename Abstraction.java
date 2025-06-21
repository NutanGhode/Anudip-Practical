abstract class pet{
    //abstract method
        abstract void sound();
    //non abstract method
        void drink(){
            System.out.println("pet eats");
            }
        }

class cat extends pet{
    @Override
    void sound (){
        System.out.println("dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
    
        cat d1=new cat();
        d1.drink();
        d1.sound();
    }
    
}



