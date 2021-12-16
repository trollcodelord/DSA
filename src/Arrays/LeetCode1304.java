package Arrays;

public class LeetCode1304 {
	 public int[] sumZero(int n) {
	        
	        int[] arr = new int[n];
	        int j =0;
	        if(n%2== 0){
	            
	            for(int i=-n/2;i<=n/2; i++){
	                
	                if(i==0){
	                    continue;
	                }
	                arr[j] = i;
	                j++;
	            }
	        }else{
	            
	            for(int i=-n/2; i<=n/2; i++){
	                arr[j] = i;
	                j++;
	            }
	        }
	        return arr;
	    }
}
