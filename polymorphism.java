class student{
        String name;
        int age;
        public void printinfo(String name){
            System.out.println(name);
        }
        public void printinfo(int age){
            System.out.println(age);
        }
        public void printinfo(String name,int age){
            System.out.println(name+" "+age);

        }

        }

public class polymorphism{
    public static void main(String[] args) {
            student s1 = new student();
            s1.printinfo("nutan", 20);

    }
}