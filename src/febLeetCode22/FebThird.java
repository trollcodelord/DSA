package febLeetCode22;

import java.util.HashMap;
import java.util.Map;


public class FebThird {
	
	
	public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4 ) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int k: nums3)
			for(int l: nums4)
				map.put(k+l, map.getOrDefault(k+l, 0)+1);
		
		int count =0;
		for(int i: nums1)
			for(int j: nums2)
				
				count += map.getOrDefault(-(i+j), 0);
		
		return count;
	}
	
	public static  void main(String[] args) {
		
		int num1[] = { 1,2};
				int num2[] = {-2,-1};
				int num3[] = {-1,2};
				int num4[] = {0,2};
				
				
			int a =	fourSumCount(num1,num2,num3,num4);
				
			System.out.println(a);
	}

}
