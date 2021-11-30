package Arrays;

import java.util.Scanner;

//1920. Build Array from Permutation

public class LeetCode1920 {

	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		 int n  = scn.nextInt();
		 
		 int [] arr = new int[n];
		 
		 for(int i=0; i<n; i++) {
			 
			 arr[i] = scn.nextInt();
			 
		 }
		
	  int[] ans = buildArrayFromPermutation(arr);
	  
	   display(ans);
		
	}
	
	
	public static int[] buildArrayFromPermutation(int[] arr) {
		
		int len = arr.length;
		int ans[] = new int[len];
		
		for(int i=0; i<len; i++) {
			
			ans[i] = arr[arr[i]];
		}
		return ans;
		
	}
	
	
	public static void display(int[] ans) {
		
		for(int a : ans) {
			
			System.out.println(a);
		}
	}
	
	
}
