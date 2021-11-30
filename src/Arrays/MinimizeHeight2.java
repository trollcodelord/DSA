package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeHeight2 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=1;i<n;i++) {
			
			arr[i] = scn.nextInt();
		}
		
		int ans = getMinimizeHeight(arr,n,k);
		int ans1 = getMinimizeHeight2(arr,n,k);
			
		System.out.println(ans);
		System.out.println(ans1);
	}
	
	
	static int getMinimizeHeight(int[] arr, int n, int k) {
		
		int max = 0;
		int min = 0;
		int diff =0;
		
		Arrays.sort(arr);
		
		 diff = arr[n-1] - arr[0];
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] >= k) {
				
				max = Math.min(arr[i-1]+k, arr[n-1]-k);
				min = Math.min(arr[i]-k, arr[0]+k);
				
				diff = Math.min(diff, max-min);
			}
			else {
				continue;
			}
		}
		
		
		return diff;
	}

	
	static int getMinimizeHeight2(int[] arr, int n, int k) {
		

		int max = 0;
		int min = 0;
		int diff =0;
		
		Arrays.sort(arr);
		
		 diff = arr[n-1] - arr[0];
		
		for(int i=1; i<n; i++) {
			
			
				
				max = Math.min(arr[i-1]+k, arr[n-1]-k);
				min = Math.min(arr[i]-k, arr[0]+k);
				
				diff = Math.min(diff, max-min);
			
			
		}
		
		
		return diff;
	}
}
