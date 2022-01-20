package binarySearch;

public class LeetCode441 {

	
	 public int arrangeCoins(int n) {
	        
	        
	        // using sum of n natural number formula n(n+1)/2
	        
	        
	        long start = 0;
	        long end = n ;
	        
	        while(start <= end ){
	            
	            long mid = start + (end - start )/2;
	            
	            if (mid*(mid+1)/2 == n){
	                
	                return (int)mid;
	            }
	            
	            else if (mid*(mid+1)/2 < n){
	                
	                start = mid+1;
	            }
	            else if(mid*(mid+1)/2 > n){
	                
	                end = mid -1 ;
	            }
	            
	        }
	        
	        return (int)end;
	        
	    }
}
