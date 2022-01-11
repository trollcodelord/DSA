package binarySearch;

import java.util.Scanner;

public class Ceiling {

	
	//Find Ceiling of number , number in an array which is equal or greater than target 
	// 2 3 5 9 14 16 , target = 15 , ceiling number will be 15 on arr[5]
	// we will get solution when condition breaks 
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = scn.nextInt();
			
		}
		
		int trgt = scn.nextInt();
		
		
		int ans = FindCeiling(arr,0,n-1,trgt);
		
		System.out.println(ans);
		
	}

	 static int  FindCeiling(int[] arr, int i, int j, int trgt) {
		// TODO Auto-generated method stub
		
		 while(i<=j) {
			 
			 
			 int mid = i+(j-i)/2;
			 
			 
			 if(arr[mid] == trgt) {
				 
				 return mid;
			 }
			 
			 else if(arr[mid] < trgt) {
				 
				 i = mid+1;
			 }
			 else if (arr[mid] > trgt) {
				 j =mid-1;
			 }
		 }
		 
		 return j;
		 
	}
}
