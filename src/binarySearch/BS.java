package binarySearch;

import java.util.Scanner;

public class BS {
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		int n = scn.nextInt();
		
		int arr[] = new int[n];
		
	
		for(int i=0 ; i<n ; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		int t = scn.nextInt();
		
		
		int ans = binarySearch(arr,0,n-1,t);
		
		System.out.println(ans);
		
		
	}

	 static int binarySearch(int[] arr, int i, int j, int t) {
		
		 
		 while(i<=j) {
			 
			 int mid = i+(j-i)/2;
			 
			 if(arr[mid] == t) {
				 
				 return mid;
				 
			 }
			 else if(arr[mid] < t) {
				 
				 return binarySearch(arr,i+1,j,t);
				 
			 }
			 
			 else if(arr[mid] >t) {
				 
				 return binarySearch(arr, i, mid-1, t);
			 }
		 }
		 
		 return -1;
		
	}

}
