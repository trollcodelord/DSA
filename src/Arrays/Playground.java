package Arrays;

import java.util.ArrayList;

public class Playground {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		
		 int[] arr = new int[2]; 
		ll.add(0, 5);
		ll.add(0,8);
		
		for(int i=0; i<2; i++) {
			arr[i] = ll.get(i);
		}
		
		
		for(int b : arr) {
			System.out.println(b);
		}
	}
}
