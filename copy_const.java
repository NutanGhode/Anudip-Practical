

class  student{
    String name;
    int age;
    student(String name,int age){
     this.name=name;
     this.age=age;



    student(student s){
     this.name=s.name;
     this.age=s.age;
    }
}
}
public class copy_const{
public static void main(String[] args) {
    student s1 = new student ("nutan",20);
    System.out.println(s1.name);
    
    student s2 = new student(s1);
    System.out.println(S2.name);
   } 
}


