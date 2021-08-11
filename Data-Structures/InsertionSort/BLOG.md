# Insertion Sort 

Insertion Sort is an efficient algorithm for ordering a small number of items. This method is based on the way card players sort a hand of playing cards.
We start with an empty left hand and the cards laid down on the table. We then remove one card at a time from the table and insert it into the correct position in the left hand. To find the correct position for a new card, we compare it with the already sorted set of cards in the hand, from right to left

## Pseudocode
```
INSERTION-SORT (input)

for i=2 to input.length
    key = A[i]
    j = i - 1 
    while j > 0 and input[j] > key
        input[j+1] = input[j]
        j = j - 1
    A[j + 1] = key
```

## implementation

 we're going to write a function called insertionSort, taking as a parameter an array of integers. The function starts iterating over the array from the second item.

At any given time during the iteration, we could think of this array as being logically divided into two portions; the left side being the sorted one and right side containing the items not yet sorted.

An important note here is that after finding the correct position at which we'll insert the new item, we shift (and not swap) the items to the right to free a space for it

## Diagram 

![insertionSort](https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png)


## Time and Space Complexity
The time taken by the INSERTION-SORT procedure to run is O(n^2). For each new item, we iterate from right to left over the already sorted portion of the array to find its correct position.
Then we insert it by shifting the items one position to the right.

The algorithm sorts in place so its space complexity is O(1)


# Merge Sort
Merge sort is one of the most efficient sorting techniques.

## Pseudocode
```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```

## implementation
For the implementation, we'll write a mergeSort function which takes in the input array and its length as the parameters. This will be a recursive function so we need the base and the recursive conditions.
The base condition checks if the array length is 1 and it will just return. For the rest of the cases, the recursive call will be executed.
For the recursive case, we get the middle index and create two temporary arrays l[] and r[]. The mergeSort function is then called recursively for both the sub-arrays

We then call the merge function which takes in the input and both the sub-arrays and the starting and end indices of both the sub arrays.
The merge function compares the elements of both sub-arrays one by one and places the smaller element into the input array.
When we reach the end of one of the sub-arrays, the rest of the elements from the other array are copied into the input array thereby giving us the final sorted array

## Diagram

![mergeSort](https://www.baeldung.com/wp-content/uploads/2018/09/mergesort1.png)

## Time and Space Complexity

> T(n) = 2T(n/2) + O(n)

2T(n/2) corresponds to the time required to sort the sub-arrays and O(n) time to merge the entire array.

When solved, the time complexity will come to O(nLogn).

This is true for the worst, average and best case since it will always divide the array into two and then merge.

The space complexity of the algorithm is O(n) as we're creating temporary arrays in every recursive call



# Quick Sort

is a sorting algorithm, which is leveraging the divide-and-conquer principle,and  Quicksort isn't a stable algorithm. A stable sorting algorithm is an algorithm where the elements with the same values appear in the same order in the sorted output as they appear in the input list.

## Pseudocode

```
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp
```

## implementation

The first method is quickSort() which takes as parameters the array to be sorted, the first and the last index. First, we check the indices and continue only if there are still elements to be sorted.

We get the index of the sorted pivot and use it to recursively call partition() method with the same parameters as the quickSort() method, but with different indices

the partition() method takes the last element as the pivot. Then, checks each element and swaps it before the pivot if its value is smaller.

By the end of the partitioning, all elements less then the pivot are on the left of it and all elements greater then the pivot are on the right of it. The pivot is at its final sorted position and the function returns this position

## Diagram

![quickSort](https://www.geeksforgeeks.org/wp-content/uploads/gq/2014/01/QuickSort2.png)

## Time and Space Complexity

In the best case, the algorithm will divide the list into two equal size sub-lists. So, the first iteration of the full n-sized list needs O(n). Sorting the remaining two sub-lists with n/2 elements takes 2*O(n/2) each. As a result, the QuickSort algorithm has the complexity of O(n log n)
In the worst case, the algorithm will select only one element in each iteration, so O(n) + O(n-1) + … + O(1), which is equal to O(n2).

On the average QuickSort has O(n log n) complexity, making it suitable for big data volumes