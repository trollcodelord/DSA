package Arrays;

import java.util.Scanner;

public class LeetCode1295 {

	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		 int n = scn.nextInt();
		 
		 int[] arr = new int[n];
		 
		 for(int i=0; i<n ; i++) {
			 
			 arr[i] = scn.nextInt();
		 }
		 
		 int ans = CountEvenNumber(arr);
		 
		 System.out.println(ans);
	}
	
	
	public static int CountEvenNumber(int arr[]) {
		
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			int count =0 ;
			while(arr[i] > 0) {
				count++;
				arr[i] = arr[i]/10;
			}
			
			
			if(count%2 ==0) {
				result ++;
			}
			
		}
		
		return result;
		
	}
}
