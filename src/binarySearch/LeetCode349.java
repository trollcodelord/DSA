package binarySearch;

import java.util.HashSet;

public class LeetCode349 {

	
	 public int[] intersection(int[] nums1, int[] nums2) {
	        
	        HashSet<Integer> set1 = new HashSet<>();
	        
	        for(int i: nums1){
	            
	            set1.add(i);
	        
	        }
	        
	        HashSet<Integer> set2 = new HashSet<>();
	        
	        for(int i: nums2){
	            
	            if(set1.contains(i)){
	                set2.add(i);
	            }
	        }
	            
	            int[] arr = new int[set2.size()];
	            
	            int j =0;
	            for(int n:set2){
	                arr[j++] = n;
	            }
	            
	        
	        
	        return arr;
	    }
}
