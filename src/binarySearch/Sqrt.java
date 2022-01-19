package binarySearch;

import java.util.Scanner;

public class Sqrt {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		int x = scn.nextInt();
		
		int ans =findsqrt(x);
		
		
		System.out.println(ans);
		
	}

	private static int findsqrt(int x) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = x ;
		
		while(start <= end)
		{
			
			int mid = start + (end - start)/2;
			
			if(mid*mid == x) {
				return mid;
			}
			
			
			else if (mid*mid < x) {
				
				start = mid +1;
			}
			
			else if( mid*mid > x) {
				
				end = mid -1;
			}
		}
		
		return end;
	}
}
