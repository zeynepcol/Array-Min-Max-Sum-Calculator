package ArrayMinMaxSum;

import java.util.*;

public class ArrayMinMaxSum {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Initialize the array
	        int[] array = new int[size];

	        // Get array elements from the user
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        // Calculate maximum, minimum, and sum
	        int max = array[0];
	        int min = array[0];
	        int sum = array[0];

	        for (int i = 1; i < size; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	            if (array[i] < min) {
	                min = array[i];
	            }
	            sum += array[i];
	        }

	        // Display the results
	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
	        System.out.println("Sum: " + sum);

	        scanner.close();
	    }
	}