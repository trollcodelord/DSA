package Arrays;

import java.util.Arrays;
import java.util.Scanner;


//ShuffleArray
public class LeetCode1470 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn .nextInt();
		
		int[] arr = new int[2*n];
		for(int i=0; i<arr.length ; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		int[] sol = ShuffleArray(arr,n);
		
		System.out.println(Arrays.toString(sol));
	}
	
	public static int[] ShuffleArray(int[] arr, int n) {
		
		int len = arr.length;
		int j =0;
		int[] ans = new int[len];
		
		for(int i=0; i<n; i++) {
			
			ans[j++] = arr[i];
			ans[j++] = arr[i+n];
		}
		
		return ans;
		
	}
}
