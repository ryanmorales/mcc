public void insertionSort(int arr[], int N) {
    int i, k, add;
    for(i = 1; i < N; i++) {
        add = arr[i];
        k = i - 1; // Start comparing from the element before 'i'
        while(k >= 0 && add < arr[k]) { // Ensure to compare correctly and move elements
            arr[k + 1] = arr[k]; // Shift elements one position to the right
            k--; // Move to the previous element
        }
        arr[k + 1] = add; // Insert the element in its correct position
    }
}
