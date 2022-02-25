package febLeetCode22;

import java.util.Scanner;

public class FebTwentySix {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String s1 = scn.next();
		String s2 = scn.next();
		
		 int  a =compareVersion(s1,s2);
 		
		 System.out.println(a);
	}
	
	
	public static int compareVersion(String s1, String s2) {
		
		
		String arr1[] = s1.split("\\.");
		String arr2[] = s2.split("\\.");
		
		for(String s : arr1) {
			
			System.out.println(s);
		}
		
		int max = Math.max(arr1.length,arr2.length);
		
		for(int i=0; i<max ; i++) {
			
			int n1 = (i>= arr1.length) ? 0 : Integer.parseInt(arr1[i]);
			int n2 = (i>= arr2.length) ? 0 : Integer.parseInt(arr2[i]);
		
		if(n1 > n2)
			return 1;
		else if (n1 < n2)
			return -1;
		}
		
		return 0;
	}
}
