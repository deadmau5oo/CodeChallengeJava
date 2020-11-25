/* Set Matrix Zeroes
Given an m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
*/
package codechallenge;

public class Challenge29 {
    public static void setZeroes(int[][] matrix) {  
        printMatrix(matrix);System.out.println("");
        
        int [][] positions = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++){
            positions[i] = matrix[i].clone();
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (positions[i][j] == 0) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                    for (int k = 0; k < matrix[i].length; k++) {
                        matrix[i][k] = 0;
                    }
                }
            }
        }
        
        printMatrix(matrix);
    }
    
    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    static void run(){
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
}
