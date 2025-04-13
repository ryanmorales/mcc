import java.util.HashMap;
import java.util.Scanner;

public class HashSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Input number of key-value pairs
        System.out.print("Enter number of elements to insert in the hash map: ");
        int n = scanner.nextInt();

        // Inserting key-value pairs into the HashMap
        System.out.println("Enter key-value pairs (e.g., 101 John):");
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            String value = scanner.next();
            hashMap.put(key, value);
        }

        // Searching for a key
        System.out.print("Enter the key to search: ");
        int searchKey = scanner.nextInt();

        if (hashMap.containsKey(searchKey)) {
            System.out.println("Key found! Value: " + hashMap.get(searchKey));
        } else {
            System.out.println("Key not found in the hash map.");
        }

        scanner.close();
    }
}
