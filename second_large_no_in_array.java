public class second_large_no_in_array {
    public static void main(String[] args) {
        int arr[]={23,45,65,53,76,12};
       int largest= Integer.MIN_VALUE;

       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
          largest=arr[i];
        }
      }
         
     int seclarge=arr[0];
     for(int i=0;i<arr.length;i++){
        if(seclarge<arr[i]&&arr[i]!=largest){
            seclarge=arr[i];
        }
     }
      System.out.println(seclarge);  
    }
}
