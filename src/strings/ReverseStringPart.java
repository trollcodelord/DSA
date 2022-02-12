package strings;

public class ReverseStringPart {
	
	public static void main(String[] args) {
		
		String s = "test12pop90java989pyt";
		
	
		StringBuilder sb = new StringBuilder(s.length());
		
		
	
		int j = 0;
		for(int i =0; i< s.length(); i++) {
	
			char c = s.charAt(i);
			if(Character.isLetter(c)) {
				
				sb.insert(j,c );
				
			}
			
			else {
				
				sb.append(c);
				j = i+1;
			}
			
		}
		System.out.println(sb.toString());
		
	}
	
	
	

}