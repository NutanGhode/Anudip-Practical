interface fruit{
    public void walk();
    }


class apple implements fruit{
    @Override
    public void walk(){
        System.out.println("walking in B");
    }
}

public class Inter_face{
    public static void main(String[] args) {
        apple f1=new apple( );
        f1.walk();
        
    }
    
}