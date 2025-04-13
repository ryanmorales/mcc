public void selectionSort(int arr[], int N) {
    int i, j, index, smallest;
    for (i = 0; i < N - 1; i++) { // Loop through each element (except the last one)
        smallest = arr[i]; // Assume the current element is the smallest
        index = i; // Store the index of the smallest element
        for (j = i + 1; j < N; j++) { // Search for the smallest element in the unsorted part
            if (arr[j] < smallest) {
                smallest = arr[j]; // Update smallest if a smaller element is found
                index = j; // Update the index of the smallest element
            }
        }
        // Swap the found smallest element with the element at position i
        if (index != i) { // Only swap if the smallest element isn't already in the correct position
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}
