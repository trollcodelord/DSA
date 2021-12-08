package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode989 {

	
	public List<Integer> addToInteger(int[] arr, int k){
		
		List<Integer> sol = new ArrayList<Integer>();
		
		for(int i = arr.length-1; i>=0; i--) {
			
			
			if(i>=0) {
				
				sol.add((arr[i]+k)%10);
				k = (arr[i]+k)/10;
			}
			else {
				
				sol.add(k%10);
				k=k/10;
			}
		}
		
		Collections.reverse(sol);
		
		return sol;
		
		
		
		
	}
}
