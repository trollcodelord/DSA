package Arrays;

public class LeetCode283 {
	
	 public void moveZeroes(int[] nums) {
	        
	        int i =0; 
	        int j =0;
	        
	        while(i< nums.length && j < nums.length){
	            
	            if(nums[i] == 0){
	                
	                i++;
	            }
	            else{
	                
	                swap(nums,i,j);
	                i++;
	                j++;
	            }
	        }
	    }
	    
	    
	    
	    public void swap(int[] nums, int i, int j){
	        
	        
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }

}
