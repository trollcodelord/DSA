package Arrays;

public class LeetCode1832 {

	 public boolean checkIfPangram(String sentence) {
	     
	        int count =0;
	        
	        for(char ch='a';ch<='z';ch++){
	            
	            for(char j=0;j<sentence.length();j++){
	                
	                if(sentence.charAt(j) == ch){
	                    count++;
	                    break;
	                }
	                
	            }
	        }
	        
	        if(count == 26){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }
}
