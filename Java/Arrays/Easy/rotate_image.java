/*
    You are given an n x n 2D matrix representing an image, rotate the image by 90 
    degrees (clockwise).

    You have to rotate the image in-place, which means you have to modify the input 2D 
    matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix.length;
        for(int i=0; i<(size+1)/2; i++) {
            for(int j=0; j<size/2; j++) {
                int tmp = matrix[size-1-j][i];
                matrix[size-1-j][i] = matrix[size-1-i][size-1-j];
                matrix[size-1-i][size-1-j] = matrix[j][size-1-i];
                matrix[j][size-1-i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
}