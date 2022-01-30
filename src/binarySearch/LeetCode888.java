package binarySearch;

import java.util.HashSet;
import java.util.Set;

public class LeetCode888 {
	 public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
	        
	        int result[] = new int[2];
	        
	        int sumA =0;
	        int SumB =0;
	        
	        Set<Integer> sb = new HashSet<>();
	        
	        
	        for(int a : aliceSizes){
	            
	            sumA += a;
	        }
	        
	        
	        for(int b : bobSizes){
	            
	            SumB += b;
	            sb.add(b);
	        }
	        
	        
	        int delta = (SumB - sumA)/2;
	        
	        
	        for(int a : aliceSizes){
	            
	            if(sb.contains(a + delta)){
	                result[0] = a;
	                result[1] = a+delta;
	                return result;
	            }
	            
	            
	        }
	        
	        return null;
	        
	    }

}
