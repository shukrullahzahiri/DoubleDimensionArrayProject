package com.keyin;

import java.util.Arrays;

public class DoubleDimensionArray {
    private int[][] array;
    private int rows;
    private int columns;

    // Constructor to initialize the array with given dimensions
    public DoubleDimensionArray(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];

        // Initializing all elements to 0
        for (int i = 0; i < rows; i++) {
            Arrays.fill(array[i], 0);
        }
    }

    // 1. Insert method to add value to a specific index
    public void insert(int row, int column, int value) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            array[row][column] = value;
        } else {
            System.out.println("Invalid index. Cannot insert value.");
        }
    }

    // 2. Traverse method to print the 2D array
    public void traverse() {
        System.out.println("Traversing the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 3. Search method to find the value at a specific index
    public int search(int row, int column) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            return array[row][column];
        } else {
            System.out.println("Invalid index. Cannot search value.");
            return -1; // Returning -1 to indicate an error
        }
    }

    // 4. Delete method to remove the value at a specific index (set it to 0)
    public void delete(int row, int column) {
        if (row >= 0 && row < rows && column >= 0 && column < columns) {
            array[row][column] = 0; // Assuming 0 is the deleted/default value
        } else {
            System.out.println("Invalid index. Cannot delete value.");
        }
    }
}
