/* SELECTION SORT ALGORITHM
 * ATTENTION: CODE TAKEN FROM: https://www.w3schools.com/dsa/dsa_algo_selectionsort.php
 * 
 * Notes:
 * For this Algorithm we using the indexes to compare and move the numbers in the array
 * 
 * How its done:
 * First we looking for the smallest value in the in the array in iteration 1(this happens in the first inner for loop)
 * Then we moving all the number from the start to that smallest value to the right
 * Then we take that smallest value and put it to the start
 * Then we continue with iteration 2 and so on
 */


class main{
    public static void main(String[] args) {
        int[] my_array = {64, 34, 25, 5, 22, 11, 90, 12};
        int n = my_array.length;

        for (int i = 0; i < n-1; i++) {                    // Iterate through each position
            int min_index = i;                             // Assume the current position holds the minimum value
            for (int j = i+1; j < n; j++) {                // Find the minimum value in the unsorted portion
                if (my_array[j] < my_array[min_index]) {
                    min_index = j;                         // Update min_index if a smaller value is found
                }
            }
            int min_value = my_array[min_index];           // Get the smallest value
            for (int k = min_index; k > i; k--) {          // Shift elements to the right
                my_array[k] = my_array[k-1];
            }
            my_array[i] = min_value;                       // Place the smallest value in the correct position
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {                      // Print the sorted array
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}


/*Notes on the execution of code:
 * 
 *  Iteration by Iteration Breakdown:
    Iteration 1 (i = 0)
    Outer loop (i = 0):

    Assume the first element 64 is the smallest.
    min_index = 0.
    Inner loop (j goes from 1 to 7):

    Compare 34 with 64 (at min_index = 0). Update min_index = 1.
    Compare 25 with 34 (at min_index = 1). Update min_index = 2.
    Compare 5 with 25 (at min_index = 2). Update min_index = 3.
    Compare 22 with 5 (no update).
    Compare 11 with 5 (no update).
    Compare 90 with 5 (no update).
    Compare 12 with 5 (no update).
    
    After Inner Loop:
    min_index is 3, and the smallest value is 5.
    
    Shift Elements:
    Shift 25, 34, and 64 to the right.
    
    Array after shifting:
    [64, 64, 34, 25, 22, 11, 90, 12]
    
    Place 5 at position 0:
    Array after placing:
    [5, 64, 34, 25, 22, 11, 90, 12]
 * *******************************************************************
 *  Iteration 2 (i = 1)
    Outer loop (i = 1):

    Assume the element at index 1 (64) is the smallest.
    min_index = 1.
    Inner loop (j goes from 2 to 7):

    Compare 34 with 64. Update min_index = 2.
    Compare 25 with 34. Update min_index = 3.
    Compare 22 with 25. Update min_index = 4.
    Compare 11 with 22. Update min_index = 5.
    Compare 90 with 11 (no update).
    Compare 12 with 11 (no update).
    
    After Inner Loop:
    min_index is 5, and the smallest value is 11.
    Shift Elements:

    Shift 22, 25, 34, and 64 to the right.
    Array after shifting:
    [5, 64, 64, 34, 25, 22, 90, 12]
    
    Place 11 at position 1:
    Array after placing:
    [5, 11, 64, 34, 25, 22, 90, 12]
 * 
 */
