package binarySearch;

import java.util.Scanner;
import java.util.*;

public class LeetCode875 {
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		
		int h = scn.nextInt();
		
		int sol = minEatingSpeed(arr, h);
		System.out.println(sol);
	}
	
	public static int minEatingSpeed(int[] arr, int h) {
		
		
		int max = arr[0];
		
		
		for(int a : arr) {
			
			max = Math.max(a, max);
		}
	
		if(h == arr.length) {
			
			return max;
		}
		
		int start = 0;
		int end = max;
		int ans =0;
		
		
		
		while(start<=end) {
			
			int mid = start +(end-start)/2;
			
			
			if(isPossible(arr,mid,h)) {
				
				ans = mid;
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		
		return ans;
	}
	
	
	public static boolean isPossible(int[] arr, int speed, int h) {
		
		int time = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			time +=Math.ceil(arr[i]*1.0/speed);
		}
		
		return time<=h;
	}

}
