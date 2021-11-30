package Arrays;

import java.util.Scanner;

public class ReverseArray {

	
	public static void main(String[] args) {
		
		 Scanner scn = new Scanner(System.in);
		 
			int n = scn.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0 ; i<n ; i++) {
				
				a[i] = scn.nextInt();
			}
			
			reverse(a,0,n-1);
		
	}
	
	public static void reverse(int arr[], int start, int end) {
		
		int temp;
		
		while(start<end) {
			
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;	
			
		}
		
		for(int b: arr) {
			
			System.out.print(b+ " ");
		}
		
	}
}
