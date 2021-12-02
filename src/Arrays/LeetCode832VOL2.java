package Arrays;

import java.util.Arrays;
import java.util.Scanner;
//FlippingAnImage
public class LeetCode832VOL2 {

	
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
		
	
		for(int i=0;i<arr.length;i++) {
			
		int start =0;
		int end = (arr[i].length)-1;
		int temp =0;
		
		while(start<end) {
			
			temp = arr[i][start];
			arr[i][start] = arr[i][end];
			arr[i][end] = temp;
			start++;
			end--;
		}
		
		
			
		}
	for(int i=0;i<arr.length;i++) {
			
			for(int j =0; j<arr[i].length;j++) {
				
				if(arr[i][j] == 1)
				{
					arr[i][j] = 0;
				}
				else if(arr[i][j] == 0) {
					arr[i][j] = 1;
				}
			}
			
	}
return arr;
		
	}
	
}
