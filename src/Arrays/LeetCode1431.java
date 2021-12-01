package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//GreatestNumberofCandies
public class LeetCode1431 {

	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			arr[i] = scn.nextInt();
		}
		
		int extraCandies = scn.nextInt();
		
		ArrayList<Boolean> sol= GreatestNumberofCandies(arr,extraCandies);
		
		for(boolean a : sol) {
			System.out.println(a);
		}
		
	}
	
	
	public static ArrayList<Boolean> GreatestNumberofCandies(int[] arr, int extraCandies) {
		
		
		int Maxcandies =0;
		
		ArrayList<Boolean> llist = new ArrayList<Boolean>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(Maxcandies<arr[i]) {
				Maxcandies = arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]+extraCandies>= Maxcandies){
				llist.add(true);
			}else
				llist.add(false);
		}
		
		return llist;
	}
}
