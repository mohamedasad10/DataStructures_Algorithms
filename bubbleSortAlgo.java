/*Bubble Sort Algorithm
 * Notes:
 * 15(highest number) has bubbled up to the end of the array, where it belongs. But the rest of the array remains unsorted.
So the Bubble Sort algorithm must run through the array again, and again, and again, each time the next highest value bubbles up to its correct position. 
The sorting continues until the lowest value 3 is left at the start of the array. This means that we need to run through the array 4 times, to sort the array of 5 values.
And each time the algorithm runs through the array, the remaining unsorted part of the array becomes shorter.
 */

class main {
    public static void main(String[] args) {
        
        int[] array = {10, 15, 12, 14, 6};
        
        //int Val = array[0];
        int temp;
        for (int i = 0; i < array.length; i++) {      //running the loop 4 times to sort 5 values
            for (int j = 0; j < array.length - 1;j++){
                if(array[j] > array[j + 1]){          //compare values next to each other
                    temp = array[j+1];                //store the 2nd no. of the 2 that im comparing into temp
                    array[j+1] = array[j];            //swap the two values
                    array[j] = temp;                  //put the 2nd no. of the 2 into the "first slot"
                                                      //until here 15(highest number) gets pushed to the end so thats iteration 1 and then it continues

                }
            }

        }    
        //print out the sorted array
		for (int num : array) {
            System.out.print(num + " ");
        }
            
    }
}
