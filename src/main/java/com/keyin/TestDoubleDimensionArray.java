package com.keyin;

public class TestDoubleDimensionArray {
    public static void main(String[] args) {
        // Create a 3x3 2D array
        DoubleDimensionArray dda = new DoubleDimensionArray(3, 3);

        // Test the Insert method
        dda.insert(0, 0, 5);
        dda.insert(1, 1, 10);
        dda.insert(2, 2, 15);

        // Test the Traverse method to print the array
        dda.traverse();

        // Test the Search method
        int value = dda.search(1, 1);
        System.out.println("Value at [1][1]: " + value);

        // Test the Delete method
        dda.delete(1, 1);
        dda.traverse(); // Traverse again to see the effect of deletion
    }
}
