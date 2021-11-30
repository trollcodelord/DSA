package Arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Kth_Smallest {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int arr[] = new int[n];
		
        for(int i =0 ; i< n; i++) {
			
			arr[i] = scn.nextInt();
			
		}
        
        System.out.println("ENTER THE K-th VAL:");
        int k_val = scn.nextInt();
        
		TreeMap<Integer, Integer> m = new TreeMap<Integer, Integer>();
		
		for (int k =0 ; k<n ; k++) {
			
			m.put(arr[k], m.getOrDefault(arr[k], 0) + 1);
		}
		
		
		int ans = get_kth_Smallest(m,k_val);
		
		System.out.println("SMALLEST :"+ ans );
		
	}
	
	public static  int get_kth_Smallest(TreeMap<Integer, Integer> m, int n) {
		
		int freq = 0;
		
		for(Map.Entry it : m.entrySet()) {
			
			
			freq += (int)it.getValue();
			
			if(freq >= n ) {
				
				return (int)it.getKey();
			}
		}
		
		return -1;
		
		
	}

}
