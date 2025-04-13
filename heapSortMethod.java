public static void heapSort(int[] arr) {
    int n = arr.length;

    // Build max heap
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }

    // Extract elements from heap one by one
    for (int i = n - 1; i > 0; i--) {
        // Move current root to end
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;

        // Call max heapify on the reduced heap
        heapify(arr, i, 0);
    }
}

// Helper method to maintain heap property
private static void heapify(int[] arr, int heapSize, int rootIndex) {
    int largest = rootIndex;        // Initialize largest as root
    int left = 2 * rootIndex + 1;   // left child
    int right = 2 * rootIndex + 2;  // right child

    // If left child is larger than root
    if (left < heapSize && arr[left] > arr[largest]) {
        largest = left;
    }

    // If right child is larger than largest so far
    if (right < heapSize && arr[right] > arr[largest]) {
        largest = right;
    }

    // If largest is not root
    if (largest != rootIndex) {
        int swap = arr[rootIndex];
        arr[rootIndex] = arr[largest];
        arr[largest] = swap;

        // Recursively heapify the affected sub-tree
        heapify(arr, heapSize, largest);
    }
}
