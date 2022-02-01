package febLeetCode22;

import java.util.*;

// LeetCode 121 : Best Time to buy and sell stock
public class FebFirst {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		 int prices[] = new int[n];
		 
		 
		 for(int i=0; i<n; i++)
		 {
			 
			 prices[i] = scn.nextInt();
		 }
		 
		 int profit = BuyandSellStock(prices);
	}
	
	
	public static int BuyandSellStock(int[] arr) {
		
		
		int min = Integer.MAX_VALUE;
		int profit = 0;
		int sell = 0;
		
		for(int i = 0; i<arr.length; i++) {
			
			if (arr[i] < min) {
				
			min = arr[i];
			
			}
			
			profit = arr[i] - min;
			if(sell < profit) {
				sell = profit;
			}
			
			
		}
		return sell;
	}
	
	
}
