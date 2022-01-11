package binarySearch;

import java.util.Scanner;

public class Floor {

	public static void main(String[] args) {
		
		
		//Find floor number, number from array which is less than or equal to trgt
		//we get answer when at end when while loop breaks 
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		
		for(int i=0; i<n; i++)
		{
			
			arr[i] = scn.nextInt();
			
		}
		
		int trgt = scn.nextInt();
		
		int ans =	FindFloor(arr,0,n-1,trgt);
		
		System.out.println(ans);
		
	}
	
	static int FindFloor(int[] arr,int i, int j, int trgt) {
		
		
		while(i<=j) {
			
			int mid = i+(j-i)/2;
			
		
			if(arr[mid] == trgt) {
				
				return mid;
			}
			
			else if(arr[mid] > trgt) {
				
				j= mid-1;
			}
			else if(arr[mid] < trgt) {
				i = mid+1;
				
			
			}
		
		}
		
		return j;
	}
	
}
