/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import java.sql.Array;
import java.util.Arrays;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {

        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort array = new InsertionSort();
        array.insertionSort(arr);

            System.out.println("insertion sort"+Arrays.toString(arr));

            MergeSort mergeSort=new MergeSort();
            mergeSort.mergeSort(arr, arr.length);

            System.out.println("merge sort"+Arrays.toString(arr));


            QuickSort quickSort=new QuickSort();
            quickSort.quickSort(arr, 12,6);

            System.out.println("quick Sort"+Arrays.toString(arr));

    }
}
