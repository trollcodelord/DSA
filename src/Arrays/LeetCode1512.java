package Arrays;

import java.util.Scanner;

public class LeetCode1512 {

	public static void main(String[] args) {
		
		
	Scanner scn = new Scanner(System.in);
	
	int n = scn.nextInt();
	
	int[] arr = new int[n];
	
	for(int i=0; i<n; i++) {
		
		arr[i] = scn.nextInt();
	}
	
	
	int sol = GoodPair(arr);
	
	System.out.println(sol);
	}
	
	public static int GoodPair(int[] arr) {
		
		int count = 0;
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++ ) {
				
				if (arr[i] == arr[j])
				count++;
			}
		}
		return count;
		
	}
	
	
}
