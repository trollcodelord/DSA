package Arrays;

import java.util.Scanner;

public class SortZerosOnesTwos {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = scn.nextInt();
		}
		
		sort(arr,n);
		
		
	}
	
	
	static void printArray(int arr[], int n) {
		
		for(int i =0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	static void sort(int arr[], int n){
		
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int i;
		
		for( i= 0; i<n ; i++) {
			switch (arr[i]) {
			
			case 0 :
				count0 ++;
				break;
			case 1:
				count1 ++;
				break;
			case 2:
				count2 ++;
				break;
			}
			
		}
		
		i=0;
		
		while(count0 > 0) {
			arr[i++] = 0;
			count0--;
		}
		
		while(count1 > 0) {
			arr[i++] =1;
			count1--;
		}
		
		
		while(count2 >0) {
			arr[i++] =2;
			count2--;
		}
		
		printArray(arr,n);
	}
	
}
