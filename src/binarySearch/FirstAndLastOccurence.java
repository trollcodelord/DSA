package binarySearch;

import java.util.Scanner;

public class FirstAndLastOccurence {

	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			
			arr[i] = scn.nextInt();
		}
		
		int trgt = scn.nextInt();
		
		
		int[] a = FindDuplicate( arr,  trgt);
		
		for(int b: a) {
			
			System.out.println(b + " ");
		}
		
	}
	
	
	public static int[] FindDuplicate(int[] arr, int trgt) {
		
		int[] ans = {-1,-1};
		
		boolean flag = true;
		
		ans[0] =binarySearch(arr,0,arr.length-1,trgt,flag);
		
		if(ans[0] != -1) {
			ans[1] =binarySearch(arr,0,arr.length-1,trgt,!flag);
		}
		
		return ans;
		
	
		
	}


	private static int binarySearch(int[] arr, int i, int j, int trgt,  boolean flag) {
		// TODO Auto-generated method stub
		int ans = -1;
		
		
		
		while(i <= j) {
			
		int mid = i +( j- i)/2 ;
		
		if(trgt < arr[mid]) 
		{
			
			j = mid-1;
		}
		
		else if ( trgt > arr[mid])
		{
			i = mid+1;
		}
		else {
			
			ans = mid;
			
			if(flag) {
				
				j = mid -1;
			}else {
				
				i = mid+1;
			}
			
		}
		}
		
		return ans;
	}
}
