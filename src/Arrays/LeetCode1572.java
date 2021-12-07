package Arrays;

import java.util.Scanner;

public class LeetCode1572 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
	 int[][] arr = new int[n][n];
	 
	 for(int i=0; i<n; i++) {
		 
		 for(int j=0; j<n; j++) {
			 
			 
			 arr[i][j] = scn.nextInt();
		 }
		 
	 }
	 
	 
	   int ans=  DiagonalSum(arr);
	   
	   System.out.println(ans);
		
		
	}
	
	
	public static int DiagonalSum(int[][] arr) {
		
	 int n = arr.length;
	 int sum = 0;
	 
	 
	 for(int i=0;i<n;i++) {
		 
		 sum = sum + arr[i][i]+arr[i][n-1-i];
	 }
	 
	 
	 if(n%2==0) {
		 
		 return sum;
	 }else {
		 
		 return sum - arr[n/2][n/2];
	 }
	}
}
