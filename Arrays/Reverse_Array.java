import java.util.Arrays;

public class Reverse_Array{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // Create a new array to store the reversed elements
        int[] reversedArray = new int[array.length];

        // Fill the new array starting from the end of the original array
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length -1 -i];
        }

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}

// Original array: [1, 2, 3, 4, 5]
// Reversed array: [5, 4, 3, 2, 1]