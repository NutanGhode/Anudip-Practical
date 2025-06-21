 class Singleton {

    public String str; 

    private static Singleton obj;

    
    private Singleton() {
        str = "I am a Singleton!";
    }

    
    public static Singleton getSingleInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleInstance();
        System.out.println(s1.str);

        Singleton s2 = Singleton.getSingleInstance();
        s2.str = "Changed message";

        System.out.println(s1.str); 
    }
}




        