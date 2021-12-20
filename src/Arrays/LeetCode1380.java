package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1380 {

	 public List<Integer> luckyNumbers (int[][] matrix) {
		 
		 
    ArrayList<Integer> minInRow = new ArrayList<Integer>();
    ArrayList<Integer> minInCol = new ArrayList<Integer>();
    
    
    for(int row=0; row<matrix.length; row++){
        
        int min = Integer.MAX_VALUE;
        
        int col =0;
        
        while(col<matrix[row].length){
            
            if(matrix[row][col]<min){
                min = matrix[row][col];
            }
            
            col++;
        }
        minInRow.add(min);
    }
    
    
    for(int col=0; col<matrix[0].length; col++){
        
        
        int max = Integer.MIN_VALUE;
        
        int row =0;
        
        while(row<matrix.length){
            
            if(matrix[row][col]>max){
                
                max = matrix[row][col];
                
            }
            
            row++;
        }
        
        minInCol.add(max);
    }
    
    
    
    
    List<Integer> cm = new ArrayList<>(minInRow);
    cm.retainAll(minInCol);
    
    return cm;
}
}
