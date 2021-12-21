package Arrays;

public class LeetCode566 {
	 public int[][] matrixReshape(int[][] mat, int r, int c) {
	        
	        
	        int n = mat.length;
	        int m = mat[0].length;
	        
	        if(r*c != m*n){
	            return mat;
	        }
	        
	        int row =0;
	        int col = 0;
	        
	        int res[][] = new int[r][c];
	        
	        
	        for(int i=0; i<n; i++){
	            
	            for(int j =0; j<m ; j++){
	                
	                
	                res[row][col] = mat[i][j];
	                
	                col++;
	                
	                if(col == c ){
	                    
	                    col =0;
	                    row++;
	                }
	                
	            }
	        }
	        
	        return res;
	        
	    }
	}