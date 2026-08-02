package session4;

public class C2_2DArray {
    public static void main(String[] args) {


        // 2D Array
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements in a 2D array
        System.out.println("Element at (0,0): " + numbers[0][0]); // Output: 1
        System.out.println("Element at (1,2): " + numbers[1][2]); // Output: 6

        // Iterating through a 2D array using nested loops
        System.out.println("All elements in the 2D array:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
        
    }
}
