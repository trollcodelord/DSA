package Arrays;

import java.util.Scanner;

public class CyclicRotation {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		 int n = scn.nextInt();
		 
		 int[] a = new int[n];
		 
		 for(int i=0; i<n ; i++) {
			 
			 a[i] = scn.nextInt();
		 }
		 
		 
		 CyclicRotateArray(a,n);
	}
	
	static void CyclicRotateArray(int [] arr, int n) {
		
		for(int i=0; i<n;i++) {
			
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
