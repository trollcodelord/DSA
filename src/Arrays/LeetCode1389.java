package Arrays;

import java.util.ArrayList;

public class LeetCode1389 {
	  public int[] createTargetArray(int[] nums, int[] index) {
	        
	        
	        ArrayList<Integer> ll = new ArrayList<Integer>();
	        
	    int[] arr = new int[nums.length];
	        
	        for(int i =0; i<nums.length; i++){
	            
	            ll.add(index[i],nums[i]);
	        }
	        
	        
	        for( int i=0; i<index.length; i++){
	            
	            arr[i] = ll.get(i);
	        }
	        
	        
	        return arr;
	    }
	}
