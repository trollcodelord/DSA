package Arrays;

import java.util.Scanner;

//RichestCustomerWealth
public class LeetCode1672 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int row = scn.nextInt();
		int col = scn.nextInt();
		
		int [][] arr = new int[row][col];
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<col; j++) {
				
				arr[i][j] = scn.nextInt();
				
			}
		}
		
		
		int ans = RichestCustomerWealth(arr);
		
		System.out.println(ans);
		
	}
	
	public static int RichestCustomerWealth(int[][] arr) {
		
		int ans =0;
		
		for(int i =0; i<arr.length; i++) {
			
			int sum =0 ;
			
			for(int j =0; j<arr[i].length; j++) {
				
				sum = sum + arr[i][j];
			}
			
			if (ans < sum) {
				
				ans = sum;
			}
		}
		
		return ans;
	}
	
}
