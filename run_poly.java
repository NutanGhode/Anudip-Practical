class animal{
    public void sound(){
        System.out.println("animal makes sound");


    }
}
class dog extends animal{
    public void sound(){
        System.err.println("dog barks");
    }
}

class cat extends animal{
    public void sound(){
        System.out.println("cat meows");
    }
}

public class run_poly{
    public static void main(String[] args) {
        animal a = new animal();
        a.sound();
        dog d =new dog();
        d.sound();
        cat c= new cat ();
        c.sound();   
   }
}







public class run_poly {
    
}
