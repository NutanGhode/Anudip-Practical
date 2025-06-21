class employee{
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

public class compile_poly{
    public static void main(String[] args) {
            employee s1 = new employee();
            s1.printinfo("nutan", 20);

    }
}
    

