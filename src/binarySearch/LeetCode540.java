package binarySearch;

public class LeetCode540 {

	
	public int SingleNonDuplicate(int[] nums) {
		
		
		int start = 0;
		int end = nums.length -1;
		
		while(start <= end ) {
			
			int mid = start + (end - start);
			
			if(mid%2 == 0) {
				
				if(nums[mid] != nums[mid+1]) {
					
					end = mid -1;
				}else {
					
					start = mid+1;
				}
				
				
			}else {
				
				if(nums[mid] == nums[mid+1]) {
					
					end = mid -1;
				}else {
					
					start = mid +1;
				}
				
			}
			
		}
		return nums[start];
	}
}
