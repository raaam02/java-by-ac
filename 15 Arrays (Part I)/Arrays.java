public class Arrays {
    // 1. Linear Search
    public static String linearSearch(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (key.equals(menu[i])) {
                return key + " found at index: " + i;
            }
        }
        return "Not found";
    }
    // 2. Largest number in an array
    public static String largest_smallest_number_in_array(int array[]) {
        int LARGEST = Integer.MIN_VALUE;
        int SMALLEST = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > LARGEST) {
               LARGEST = array[i]; 
            }
            if (array[i] < SMALLEST) {
                SMALLEST = array[i];    
            }
        }
        return "Smallest = " + SMALLEST + " and Largest = " + LARGEST ;
    }

    // 3. Binary search
    public static String binary_search(int array[], int key) {

        int start = 0, end = array.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return key + " found at index: " + mid;
            }
            if (array[mid] > key) {
                end = mid - 1;
            } else { 
                start = mid + 1;
            }
        }

        return "Not Found";
    }

    // 4. Reverse an array
    public static int[] reverseArray(int array[]){
        int start = 0, end = array.length-1;
        while (start <= end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            start++;
            end--;
        }
        return array;
    }

    // 5. Pair in an array
    public static void printPair(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ") ");
            }
            System.out.println();
        }
    }

    // 6. Subrray in Array
    public static void printSubarray(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String menu[] = {"apple", "ball", "cat", "dog", "elephant", "fan"};
        // 1. Linear search
        System.out.println(linearSearch(menu, "fan"));

        int array[] = {10,11,12,13,16,17,18};
        // 2. largest and smallest in array
        System.out.println(largest_smallest_number_in_array(array));

        // 3. Binary search
        System.out.println(binary_search(array, 18));

        // 4. reverse an array
        reverseArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // 5. Pairs in an array
        printPair(array);

        // 6. Subarray in array 
        printSubarray(array);
        
    }
}