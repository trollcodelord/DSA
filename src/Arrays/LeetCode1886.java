package Arrays;

import java.util.Arrays;

public class LeetCode1886 {

	 public boolean findRotation(int[][] mat, int[][] target) {
	        
	        int n = mat.length;
	        
	        int[][] res = new int[n][n];
	        
	        for(int i=0; i<n; i++){
	            for(int j=0; j<n; j++){
	             
	                
	                res[i][j] = mat[n-1-j][i];
	            }
	        }
	        
	        
	        int[][] res1 = new int[n][n];
	        
	        for(int i=0; i<n; i++){
	            for(int j=0; j<n; j++){
	                
	                res1[i][j] = res[n-1-j][i];
	            }
	        }
	        
	        int[][] res2 = new int[n][n];
	        
	        for(int i=0; i<n; i++){
	            
	            for(int j=0;j<n;j++){
	                
	                res2[i][j] = res1[n-1-j][i];
	                
	            }
	        }
	        
	        if(Arrays.deepEquals(target,res) ||Arrays.deepEquals(target,res1) || Arrays.deepEquals(target,res2) ||Arrays.deepEquals(target,mat)){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }
	}