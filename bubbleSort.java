import java.util.*; 
public class MyClass {
    public static void main(String args[]) {
      int arr[]={5,6,1,3,8,2,4,7};
      boolean swapped =true;
      int len=arr.length;
      System.out.println( 
            "Before Sort: "
            + Arrays.toString(arr)); 
      while(swapped){
          swapped =false;
          for(int i=1;i <len;i++){
              if(arr[i] > arr[i-1]){
                  swapped=true;
                  swap(arr,i,i-1);
              }
          }
          len=len-1;
      }
      
      System.out.println( 
            "After  Sort: "
            + Arrays.toString(arr)); 
    }
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
