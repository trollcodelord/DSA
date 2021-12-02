package Arrays;

public class LeetCode1732 {

	
    public int largestAltitude(int[] gain) {
        
        int maxim=0;
        int alt=0;
        
        for(int i=0; i<gain.length; i++){
            
            alt=alt+gain[i];
            
           if(maxim<alt){
               maxim =alt;
           }
        }
        return maxim;
        
    }
}
