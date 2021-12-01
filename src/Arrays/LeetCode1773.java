package Arrays;

import java.util.*;

public class LeetCode1773 {

	 public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
	        
	        
	        int count = 0;
	        int index =0;
	        if(ruleKey.equalsIgnoreCase("color")) {
	        	index =1;
	        }
	        else if (ruleKey.equalsIgnoreCase("name")) {
	        	index=2;
	        }
	        
	        for(List a: items) {
	        	if(a.get(index).equals(ruleValue))
	        		count++;
	        		}
	        		return count;
	        		}
	 }
