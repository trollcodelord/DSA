package binarySearch;

import java.util.Scanner;

public class LeetCode374 {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		int n = scn.nextInt();
		
		
		int pick = scn.nextInt();
		
		
		int as = guessGame(n,pick);
		System.out.println(as);
		
		/***
		 * 
		 * public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        
        int start = 0;
        int end = n ;
        
        while(start <= end){
            
            int mid = start + (end - start)/2 ;
            
            int res = guess(mid);
            
            if(res == -1){
                end = mid -1;
            }
            
            else if(res == 1){
                
                start = mid+1 ;
            }else{
                
                return mid;
            }
        }
        
        return n;
        
    }
}
		 */
		
	}

	private static int guessGame(int n, int pick) {
		
		
		int start = 0;
		int end  = n;
		
		while(start <= end) {
			
			
			int mid = start + (end - start) /2 ;
			
			if(mid == pick) {
				return mid;
			}
			
			else if( mid < pick) {
				
				start = mid +1;
			}
			
			else if(mid > pick) {
				
				end = mid -1;
			}
		}
		return end;
	}

}
