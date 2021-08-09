# Merge Sort

method to output the same array but by sorted numbers.

# Challenge
create method called mergeSort that returns the sorted arrays

# Approach & Efficiency
we'll write a mergeSort function which takes in the input array and its length as the parameters.
This will be a recursive function so we need the base and the recursive conditions.
The base condition checks if the array length is 1 and it will just return. 
For the rest of the cases, the recursive call will be executed.
For the recursive case,
we get the middle index and create two temporary arrays l[] and r[]. 
The mergeSort function is then called recursively for both the sub-arrays

We then call the merge function which takes in the input and both the sub-arrays and the starting and end indices of both the sub arrays.
The merge function compares the elements of both sub-arrays one by one and places the smaller element into the input array.
When we reach the end of one of the sub-arrays, the rest of the elements from the other array are copied into the input array thereby giving us the final sorted array

# Api
