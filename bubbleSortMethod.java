public void bubbleSort(int arr[], int N) {
    int temp, k, move;
    boolean swapped; // Flag to check if any swap was made

    for (move = 0; move < (N - 1); move++) { // Loop through all elements
        swapped = false; // Assume no swap has been made in this pass
        
        for (k = 0; k < N - 1 - move; k++) { // Perform comparisons for unsorted part
            if (arr[k] > arr[k + 1]) {
                // Swap if the current element is greater than the next
                temp = arr[k];
                arr[k] = arr[k + 1];
                arr[k + 1] = temp;

                swapped = true; // Mark that a swap has been made
            }
        }

        // If no swaps were made, the array is already sorted, so break early
        if (!swapped) {
            break;
        }
    }
}
