package febLeetCode22;

import java.util.Scanner;

//leetCode 171 - Excel Sheet column Number

public class FebTwentyTwo {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String a = scn.next();
		
		int ans = titleToNumber(a);
		
		System.out.println(ans);
	}
	
	
	
	public static int titleToNumber(String a) {
		
		
		int pos = 0;
		
		for(int i=0; i<a.length() ; i++) {
			
			pos = pos*26 + a.charAt(i) - 'A' +1 ;
			
			}
		
		
		return pos;
	}
}
