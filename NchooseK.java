public class MyClass {
    public static void main(String args[]) {
     // Given N things find different ways to get k th combinations
     
     int n=20;
     int k=3;
     
     
     //for mula n!/k!(n-k)!
      String formula;
      
      Long resut=fact(n)/(fact(k)* fact(n-k));
      
      System.out.println(chosekRecursive(n,k));
    }
    
//
    static Long chosekRecursive(int n,int k){
        
        if(k==0 || k==n){
            return 1L;
        }
        
        return chosekRecursive(n-1,k)+chosekRecursive(n-1,k-1);
        
    }
    
    
    
    public static Long fact(int n){
        if(n==0){
            return 1L;
        }
        return n * fact(n-1);
    }
    
}
