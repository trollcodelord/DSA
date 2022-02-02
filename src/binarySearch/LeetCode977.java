package binarySearch;

public class LeetCode977 {

	
	public int[] sortedSquares(int[] nums) {
		
		int[] res = new int[nums.length];
		int left = 0;
		int right = nums.length -1;
		int resInd = nums.length-1;
		
		
		while(left <= right) {
			
			
			if(Math.abs(nums[left]) < Math.abs(nums[right])) {
				
				res[resInd--] = (int)Math.pow(nums[right--],2);
				
				
			}else {
				
				res[resInd --] = (int)Math.pow(nums[left++], 2);
			}
		}
		
		return res;
	}
}
