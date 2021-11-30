package Arrays;

import java.util.*;

public class UnionElementArray {

	
	public static void main(String[] args) {
		
		
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[m];
		
		for(int i= 0 ;i <n; i++) {
			
			a[i] = scn.nextInt();
		}
		
		for(int j=0; j<m; j++) {
			
			b[j] = scn.nextInt();
		}
		
		int ans = Union( a,  b ,  n,  m);
		
		System.out.println(ans);
		
		Intersection( a,  b ,  n,  m);
	}
	
	
	

	static int Union(int[] a, int[] b, int n , int m) {
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int i=0; i<n; i++) {
			
			s.add(a[i]);
		}
		
		for(int j=0; j<m ; j++) {
			
			s.add(b[j]);
		}
		
		return s.size();
		
	}
	
	
	static void Intersection(int []a , int[] b, int n, int m) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<n ; i++) {
			set.add(a[i]);
			
		}
		
		for(int j =0;j <m ; j++) {
			
			if (set.contains(b[j])){
				
				System.out.print(b[j] + " ");
			}
		}
		
	}
	
	
}
