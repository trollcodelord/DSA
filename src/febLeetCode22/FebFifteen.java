package febLeetCode22;


import java.util.*;
public class FebFifteen {

	
	
	public static int FindSingleNumber(int[] arr) {
		
		
	HashMap<Integer, Integer> map = new HashMap<>();
	
	 for(int num : arr) {
		 
		 
		 if(map.containsKey(num)) {
			 
			 map.put(num, map.get(num)+1);
		 }
		 
		 else {
			 
			 map.put(num, 1);
		 }
	 }
	 
	 for(int n : arr) {
	 if(map.get(n) == 1) {
		 
		 return n;
	 }
	
	 }
	 
	 return 0;
	
	}
}
