package Arrays;

import java.util.Scanner;

public class MaxminNumber {

	
	
	static class maxmin{
		
		int max;
		int min;
		
	}
	
	static maxmin getmaxmin(int[] arr, int n) {
		
		maxmin minmax = new maxmin();
		
		if(n == 1 ) {
			minmax.max = arr[0];
			minmax.min = arr[0];
			
			return minmax;
		}
		
		if(arr[0] > arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
			
			
		}else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}
		
		for(int i=2 ; i<n ; i++) {
			 if(arr[i] > minmax.max) {
				 minmax.max = arr[i];
			 }else if (arr[i] < minmax.min) {
				 minmax.min = arr[i];
			 }
		}
		
		return minmax;
	}
	
public static void main(String args[]) {
		
		Scanner scn = new Scanner(System.in);
		
		int k = scn.nextInt();
		
		int[] arr = new int[k];
		
		for(int l =0;l <k; l++) {
			
			arr[l] = scn.nextInt();
		}
		
		maxmin minmax = getmaxmin(arr, k-1);
		
		System.out.println("\n MAXIMUM : "+ minmax.max);
		System.err.println("\n MINIMUM : " + minmax.min);
		
	
		
		
	}
	
	
	
}
