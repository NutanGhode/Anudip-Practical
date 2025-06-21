import java.util.Scanner;




public class arm_strong {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in); 
       int n=sc.nextInt();
          int sum=n;
          int count=0;
          while(sum>0){
            int d=sum%10;
            count++;
            sum=sum%10;
            
          }
       
          
    }
    
}
