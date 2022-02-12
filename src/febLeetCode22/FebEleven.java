package febLeetCode22;

import java.util.Scanner;

public class FebEleven {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		
		String s1 = scn.next();
		String s2 = scn.next();
		
		
		
		boolean ans = permutationString(s1,s2);
		
		
		System.out.println(ans);
		
		
	}
	
	
	
	public static boolean permutationString(String s1, String s2) {
		
		
		int len = s2.length() - s1.length();
		
		if(len < 0) {
			
			return false;
		}
		
		
		
		char[] map1 = new char[26];
		char[] map2 = new char[26];
		
		
		for(int i=0; i<s1.length() ;i++) {
			
			map1[s1.charAt(i)-'a']++;
			map2[s2.charAt(i)-'a']++;
		}
		

		
		
		for(int j=0; j<len ; j++) {
			
			if (matches(map1, map2)) {
				return true;
			}
			
			
			
			map2[s2.charAt(j+s1.length()) - 'a']++;
			map2[s2.charAt(j)-'a']--;
		}
		
		return matches(map1,map2);
		
		
		
		
	}
	
	
	
	public static boolean matches(char[] map1, char[] map2) {
		
		int o = 25;
		
		
		while(o>=0) {
			
			if(map1[o] != map2[o]) {
				return false;
			}
			
			o--;
		}
		
		return true;
		
		
	}

}
