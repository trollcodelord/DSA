package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//RunningSumof1dArray
public class LeetCode1480 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i =0; i<n; i++ )
		{
			
			arr[i] = scn.nextInt();
		}
		
		
		int[] ans = RunningSumof1dArray(arr);
		
		System.out.println(Arrays.toString(ans));
	}
	
	
	public static int[] RunningSumof1dArray(int[] arr) {
		
		int sum =0 ;
		
		for(int i=0; i<arr.length ;i++) {
			
			sum = sum+ arr[i];
			
			arr[i] = sum;
		}
		
		return arr;
	}
}
