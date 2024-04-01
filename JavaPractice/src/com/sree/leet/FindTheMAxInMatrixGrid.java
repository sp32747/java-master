package com.sree.leet;

public class FindTheMAxInMatrixGrid {

	public static void main(String[] args) {
		
		int rows=5;
		int columns=5;
		int[][] mainMatrix = new int[rows][columns];
		 
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	mainMatrix[i][j] = value+5;
                value++;
            }
        }
        
		/*
		 * System.out.println("The 2D array is: "); for (int i = 0; i < rows; i++) { for
		 * (int j = 0; j < columns; j++) { System.out.print(array[i][j] + " "); }
		 * System.out.println(); }
		 */
        
        int ans[][]=new int[mainMatrix.length-2][mainMatrix.length-2];
        
        
        
        
	}
	
	
	
	
}
