public static int sequentialSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // key found, return index
            }
        }
        return -1; // key not found
}
