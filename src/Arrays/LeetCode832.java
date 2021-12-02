package Arrays;

import java.util.Arrays;
import java.util.Scanner;
//FlippingAnImage
public class LeetCode832 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int[][] arr = new int[n][m];
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				
				arr[i][j] = scn.nextInt();
			}
		}
		int[][] ans = FlippingAnImage(arr);
		
for(int i=0;i<ans.length;i++) {
			
			for(int j =0; j<ans[i].length;j++) {
				
				System.out.println(ans[i][j]);
			}
			}
		
	}
	
	
	public static int[][] FlippingAnImage(int[][] arr){
		
		int[][] result = new int[arr.length][arr[0].length];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j =0; j<arr[i].length;j++) {
				
				result[i][j] = arr[i][j];
			}
			
		}
for(int i=0;i<arr.length;i++) {
			
			for(int j =0; j<arr[i].length;j++) {
				
				if(result[i][j] == 1)
				{
					result[i][j] = 0;
				}
				else if(result[i][j] == 0) {
					result[i][j] = 1;
				}
			}
			
		}
return result;
		
	}
	
}
