package Arrays;

import java.util.Scanner;

public class MaxSubArraySum {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n ; i++) {
			
			
			 arr[i] = scn.nextInt();
		}
		
		
		int ans = SubArraySum(arr, n);
		
		System.out.println(ans);
		
	}
	

	 static int SubArraySum(int arr[], int n) {
		
		int sum =0;
		int min_num = Integer.MIN_VALUE;
		
		for(int i=0; i<n ; i++) {
			
			sum = sum + arr[i];
			
			if(sum < 0) {
				sum = 0;
			}
			
			if(min_num < sum) {
				min_num = sum;
			}
		}
		
		return sum;
	}
}
