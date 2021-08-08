# Insertion Sort 

Insertion Sort is an efficient algorithm for ordering a small number of items. This method is based on the way card players sort a hand of playing cards.
We start with an empty left hand and the cards laid down on the table. We then remove one card at a time from the table and insert it into the correct position in the left hand. To find the correct position for a new card, we compare it with the already sorted set of cards in the hand, from right to left

# Pseudocode
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

# implementation

 we're going to write a function called insertionSort, taking as a parameter an array of integers. The function starts iterating over the array from the second item.

At any given time during the iteration, we could think of this array as being logically divided into two portions; the left side being the sorted one and right side containing the items not yet sorted.

An important note here is that after finding the correct position at which we'll insert the new item, we shift (and not swap) the items to the right to free a space for it

# Diagram 

![insertionSort](https://media.geeksforgeeks.org/wp-content/uploads/insertionsort.png)


# Time and Space Complexity
The time taken by the INSERTION-SORT procedure to run is O(n^2). For each new item, we iterate from right to left over the already sorted portion of the array to find its correct position.
Then we insert it by shifting the items one position to the right.

The algorithm sorts in place so its space complexity is O(1)