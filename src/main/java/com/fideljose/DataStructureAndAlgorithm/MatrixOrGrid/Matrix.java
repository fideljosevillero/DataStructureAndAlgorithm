package com.fideljose.DataStructureAndAlgorithm.MatrixOrGrid;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Matrix {

    private int[][] matrix2D = { {1, 2, 65}, {89, 785 ,525}, {0, 7, 45}};

    // Printing elements of a matrix or two-dimensional
    public void showMatrixElements(){
        Arrays.stream(matrix2D).forEach(block -> {
            //Arrays.stream(block).forEach(e -> System.out.println(e));
            Arrays.stream(block).forEach(e -> System.out.print(e));
        });
    }

    // Given a matrix mat[][] of size N x M, where every row and column is sorted in increasing order, and a number X is given. The task is to find whether element X is present in the matrix or not.

    // Given a 2D square matrix, print the Principal and Secondary diagonals.

    // Given a n x n matrix. The problem is to sort the given matrix in strict order. Here strict order means that the matrix is sorted in a way such that all elements in a row are sorted in increasing order and for row ‘i’, where 1 <= i <= n-1, the first element of row ‘i’ is greater than or equal to the last element of row ‘i-1’.

    // Given a square matrix, the task is that turn it by 180 degrees in an anti-clockwise direction without using any extra space.

    // Given a matrix mat[][] having n rows and m columns. We need to find unique elements in the matrix i.e, those elements not repeated in the matrix or those whose frequency is 1.

    //
}
