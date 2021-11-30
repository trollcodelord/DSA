package Arrays;

import java.util.Scanner;

//ConcatenationOfArray
public class LeetCode1929 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n ;i++) {
			
			arr[i] = scn.nextInt();
		}
		
		int[] solution = ConcatenationOfArray(arr);
		
		display(solution);
		
		
	}
	
	public static int[] ConcatenationOfArray(int[] arr) {
		
		int[] ans = new int[2*arr.length];
		
		for(int i=0; i<arr.length ;i++) {
		
			ans[i] = arr[i];
			
			ans[ i + arr.length] = arr[i];
		}
		
		return ans;
		
	}
	
	public static void display(int[] solution) {
		
		for(int a: solution) {
			
			System.out.println(a);
		}
		
	}
}
