class shape{
    public void area(){
        System.out.println("display area");
    }
}

class triangle extends shape{

}
class equilateraltraingle extends shape{

}

public class heirarchical_inheritance {
 public static void main(String[] args) {
        shape s1=new shape();
        triangle t1=new triangle();
        equilatraltriangle e1 =new equilatraltriangle();
        

        s1.area();
        t1.area();
        e1.area();




    } 
}
   

