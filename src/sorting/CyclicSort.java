package sorting;

public class CyclicSort {
	
	public static void main(String[] args) {
		
		
		int[] a= {5,3,2,1,4};
		
		
		CyclicS(a);
		
		for(int asd : a) {
			System.out.print(asd + " ");
		}
		
	}
	
	
	public static void CyclicS(int[] arr) {
		
		int i =0;
		
		while( i< arr.length) {
			
			int current = arr[i]-1;
			
			if(arr[i] != arr[current]) {
				
				Swap(arr,i,current);
			}
			else {
				i++;
			}
		}
	}
	
	
	public static void Swap(int[] arr, int i , int s) {
		
		int temp = arr[i];
		arr[i] = arr[s];
		arr[s] = temp;
	}

}
