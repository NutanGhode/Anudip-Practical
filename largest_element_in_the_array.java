/*public class largest_element_in_the_array {
    public static void main(String[] args) {
       int arr[]={23,45,65,53,76,12};
       int largest= Integer.MIN_VALUE;

       for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
          largest=arr[i];
         System.out.println(largest) ;
       }

    }
}
}*/
   
public class largest_element_in_the_array {
    public static void main(String[] args) {
       int arr[]={23,45,65,53,76,12};
       int largest= Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          largest=arr[i];
        }
      }
          System.out.println(largest) ;
       

    
}
}
   