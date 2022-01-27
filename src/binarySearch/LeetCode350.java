package binarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode350 {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		
		
		int num1[] = new int[n1];
		int num2[] = new int[n2];
		
		for(int i=0; i<n1; i++) {
			
			num1[i] = scn.nextInt(); 
		}
		
		
		for(int j=0; j<n2 ; j++) {
			
			num2[j] = scn.nextInt();
		}
		
		
		int sol[] =  intersect(num1, num2);
		
		for(int a : sol) {
			System.out.println(a + " ");
		}
	}

	public static int[] intersect(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l = new ArrayList<>();
		
		addNumber(l1,num1);
		addNumber(l2,num2);
		
		for(int i=0; i<l1.size(); i++) {
			
			if(l2.contains(l1.get(i))) {
				
				l.add(l1.get(i));
				l2.remove(l1.get(i));
			}
		}
		
		int[] arr  = new int[l.size()];
		
		for(int i=0; i< l.size(); i++) {
			
			arr[i] = l.get(i);
		}
		
		
		 return arr;
	}
	
	
	public static void addNumber(List<Integer> s, int[] arr) {
		for(int i=0; i<arr.length; i++) {   
			
			s.add(arr[i]);
		}
	}
}
