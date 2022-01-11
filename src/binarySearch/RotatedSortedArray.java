package binarySearch;

public class RotatedSortedArray {

	public static void main(String[] args) {
		
		int[] arr = {4,5,6,7,0,1,2};
		int trgt = 0;
		
		System.out.println(search(arr,trgt));
		
	}
	
	
	
	static int search(int[] arr, int trgt) {
		
		int pivot = findpivot(arr);
		
		if(pivot == -1) {
			
			return binarySearch(arr,0,arr.length-1,trgt);}
		
		if( arr[pivot] == trgt) {
			
			return pivot;
		}
		
		
		if(trgt >= arr[0]) {
			
			return binarySearch(arr,0,pivot-1,trgt);
		}
		return binarySearch(arr,pivot+1,arr.length-1,trgt);
	}
	
	
	static int binarySearch(int[] arr, int start , int end , int trgt) {
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			
			if (arr[mid] == trgt) {
				
				return mid;
			}
			if (trgt < arr[mid] ) {
				
				end = mid -1;
				
			}
			else if (trgt > arr[mid]) {
				
				start = mid+1;
			}
		}
		return -1;
		
	}
	
	
	static int findpivot(int[] arr) {
		
		 int start = 0;
		 int end = arr.length-1;
		 
		 while(start <= end) {
			 
			 
			 int mid = start + (end- start)/2;
			 
			 if(mid < end && arr[mid] > arr[mid+1]) {
				 return mid;
			 }
			 
			 if(mid > start && arr[mid] < arr[mid-1]) {
				 return mid-1;
			 }
			 
			 if(arr[mid] <= arr[start]) {
				 
				 end = mid-1;
			 }
			 else {
				 start = mid + 1;
			 }
		 }
		 
		 return -1;
	}
	
}
