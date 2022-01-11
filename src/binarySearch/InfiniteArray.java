package binarySearch;

import java.util.Scanner;

public class InfiniteArray {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n ; i++) {
			
			arr[i] = scn.nextInt();
			
		}
				
		int trgt = scn.nextInt();
		
		int a = InfinArr(arr,trgt);
		
		System.out.println(a);
	}

	private static int InfinArr(int[] arr, int trgt) {
		// TODO Auto-generated method stub
		
		int start = 0;
		int end = 1;
		
		while(trgt >arr[end]) {
			
			int temp = end+1;
			end = end + (end- start +1)*2 ;
			
			start = temp;
		}
		
		return binarySearch(arr,start,end,trgt);
	}

	private static int binarySearch(int[] arr, int start, int end, int trgt) {
		// TODO Auto-generated method stub
		
		while(start<= end) {
			
			int mid = start + (end - start)/2;
			
			
			if(arr[mid] == trgt) {
				return mid;
			}
			
			else if(arr[mid] < trgt) {
				start = mid +1;
			}
			
			else if (arr[mid] > trgt) {
				end = mid-1;
			}
		}
		return -1;
	}
	
	
}
