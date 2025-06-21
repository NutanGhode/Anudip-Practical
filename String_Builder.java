


public class String_Builder{
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder ("tony");
        System.out.println(sb);
    
    System.out.println(sb.charAt(1));

    sb.setCharAt(0,'p');
    System.out.println("sb");

    sb.insert(0,'s');
    System.out.println(sb);

    sb.delete(1,3);
    System.out.println(sb);
    }
}