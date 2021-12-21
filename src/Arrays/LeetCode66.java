package Arrays;

public class LeetCode66 {

    public int[] plusOne(int[] digits) {
        
        
        int curr = digits.length-1;
      
      
      
      while(curr>=0 && digits[curr] ==9){
          
          if(curr ==0){
              
              int[] res = new int[digits.length+1];
              
              res[0] =1 ;
              
              return res;
              
          }
          
          digits[curr] = 0;
          curr--;
      }
      
      
      digits[curr]+=1;
      return digits;
  }
}