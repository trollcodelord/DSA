package febLeetCode22;

import java.util.*;
public class FebSeventh {

	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String s = scn.next();
		String t = scn.next();
		
		
		char ans = findDifference(s,t);
		System.out.println(ans);
	}
	
	
	public static char findDifference(String s, String t) {
		
		
		int[] f = new int[26];
		
		for(char c: s.toCharArray()) {
			f[c - 'a']--;
		}
		
		for(char x:t.toCharArray()) {
			f[x - 'a']++;
		}
		
		int i =0;
		
		for(;i<26; i++) {
			
			if(f[i] == 1) break;
		
	}
		return (char)(i+'a');
}
}
