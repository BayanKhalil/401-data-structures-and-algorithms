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

            System.out.println(Arrays.toString(arr));



    }
}