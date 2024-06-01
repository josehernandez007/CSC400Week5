
import java.util.Arrays;
	// Testing class
public class RadixSortTesting {

    public static void main(String[] args) {
        int[] arr = {783, 99, 472, 182, 264, 543, 356, 295, 692, 491, 94};
        // Display the results for original and sorted array
        System.out.println("The Original array: " + Arrays.toString(arr));
        RadixSort.radixSort(arr);
        System.out.println("The Sorted array: " + Arrays.toString(arr));
    }
}
