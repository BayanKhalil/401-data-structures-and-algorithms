# Quick Sort

method to output the same array but by sorted numbers.

# Challenge
create method called quickSort that returns the sorted arrays

# Approach & Efficiency
1. We choose an element from the list, called the pivot. We'll use it to divide the list into two sub-lists.
2. We reorder all the elements around the pivot – the ones with smaller value are placed before it, and all the elements greater than the pivot after it. After this step, the pivot is in its final position. This is the important partition step.
3. We apply the above steps recursively to both sub-lists on the left and right of the pivot

Arr[] = {5, 9, 4, 6, 5, 3}
1. Let's suppose we pick 5 as the pivot for simplicity
2. We'll first put all elements less than 5 in the first position of the array: {3, 4, 5, 6, 5, 9}
3. We'll then repeat it for the left sub-array {3,4}, taking 3 as the pivot
4. There are no elements less than 3
5. We apply quicksort on the sub-array in the right of the pivot, i.e {4}
6. This sub-array consists of only one sorted element
7. We continue with the right part of the original array, {6, 5, 9} until we get the final ordered array


# Api
![quickSort](https://github.com/BayanKhalil/401-data-structures-and-algorithms/blob/main/Data-Structures/InsertionSort/assests/quickSort.jpg)

