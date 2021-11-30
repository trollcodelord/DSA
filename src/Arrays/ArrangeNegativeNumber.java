package Arrays;

import java.util.Scanner;

public class ArrangeNegativeNumber {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int arr[]= new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = scn.nextInt();
			
		}	
		
		
		SortNegativeNumber(arr, 0, n-1);
		displayResult(arr, n-1);
	}
	
	
	static void SortNegativeNumber(int arr[], int left, int right) {
		
		 
		while(left <= right) {
			
			if(left <0 && right<0)
				left++;
			
			if(arr[left] > 0 && arr[right] <0) {
				
				int temp = arr[left];
				arr[right] = arr[left];
				arr[right] = temp;
					
				left++;
				right--;
			}
			
			else if(arr[left]>0 && arr[right] >0) {
				right--;
			}
			else {
				
				right--;
				left++;
			}
			
		}
		
	}
	
	
	
	static void displayResult(int arr[], int n) {
		
		for(int i=0; i<n ; i++) {
			
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	
}
