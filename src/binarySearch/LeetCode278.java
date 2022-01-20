package binarySearch;

import java.util.Scanner;
/**
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start =0;
         int end = n;
         int bad = -1;
        while(start<=end){
            
            int mid = start+(end-start)/2;
            
            
            if(firstBadVersion(mid)){
               
               bad = mid;
                end = mid -1;
            }
            else {
                
                start = mid+1;
            }
            
        }
        return bad;
        
    }
}
**/