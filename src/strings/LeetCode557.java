package strings;

public class LeetCode557 {

	public static void reverseFunc(char [] c, int i , int j) {
		
	while(i< j) {
		
		char a =c[i];
		c[i] = c[j];
		c[j] = a;
		
		i++;
		j--;
	}
		
	}
	
	
	public static String reverseInplace(String s) {
		
		
		char[] str = s.toCharArray();
		
		int i =0;
		int j =0;
		
		
		while(j < str.length) {
			
			
			if( j == str.length || str[j] == ' ') {
				
				reverseFunc(str, i, j-1);
				i= j+1;
			}
			
			j++;
		}
		
		return new String(str);
		
	}
	
}
