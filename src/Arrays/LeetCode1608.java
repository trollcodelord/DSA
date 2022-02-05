package Arrays;

public class LeetCode1608 {
public int specialArray(int[] nums) {
        
        int n = nums.length;
        
        
        for(int i = 1; i<= n ; i++){
                        
            int counter =0;

            for(int j =0 ; j<n ; j++){
                
                if(nums[j] >= i)
                    counter ++;
            }
            
            
            if(counter == i)
                
                return i;
        }
        
        return -1;
        
    }
}
