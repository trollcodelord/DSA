package binarySearch;


import java.util.*;


public class LeetCode74 {

	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int t = scn.nextInt();
		
		int[][] arr = new int[n][m];
		
		
		for(int i=0; i<n ; i++) {
			
			for(int j=0; j<m; j++) {
				
				
				arr[i][j] = scn.nextInt();
			}
		}
	
		boolean ans = searchMatrix( arr,t);
		
		System.out.println(ans);
	}
	
	
	
	public static boolean searchMatrix(int[][] arr, int target) {
		
		
		int row = arr.length;
		int col = arr[0].length;
		
		
		int left =0;
		int right = row*col -1;
		
		
		while(left <= right) {
			
			int mid = left + (right- left)/2;
			
			int val = arr[mid/col][mid%col];
			
			
			if(val == target) {
				
				return true;
			}
			
			else if (val< target) {
				
				left = mid+1;
			}else {
				right = mid-1;
				
			}
		}
		return false;
	}
}
