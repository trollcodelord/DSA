package Arrays;

import java.util.Scanner;

public class Segregate {
	
	public static void main(String[] args)
	{
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int arr[] = new int[n];
		
		for(int i =0; i<n ; i++) {
			arr[i] = scn.nextInt();
		}
		
		Segregate seg = new Segregate();
	
		 seg.mainFunction(arr, n);
		 
		 for(int i=0 ; i<n ;i++) {
			 
			 System.out.print(arr[i]+ " ");
		 }
	}
		
	
	
 void mainFunction(int[] arr , int n) {
		
		int left =0 ;
		int right = n-1;
		
		while(left<right) {
			
			while(arr[left] ==0 && left<right)
				left++;
			
			while(arr[right] == 1 && left<right)
				right--;
				
				if(left<right)
				{
					arr[left] = 0;
					arr[right] = 1;
					left--;
					right++;
				}
		}
	}
}
