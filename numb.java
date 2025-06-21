import java.util.*;
public class numb{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
         
        switch(numb) {
            case 1 :System.out.println("good morning");
            break;
            case 2 :System.out.println("namaste");
            break;
            case 3 :System.out.println("bonjure");
            break;
            default:System.out.println("invaLid numb");
            break;
        }
    }
}