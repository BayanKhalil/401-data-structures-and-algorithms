# Hashtables
data structure that implements an associative array abstract data type, a structure that can map keys to values.

# Challenge
write code to implement the hashtable methods to store and retrieve data in time complexity O(1) and a Space Complexity of O(1)

# Approach & Efficiency

Apply this methods:
* add()
  Takes in both the key and value. This method hashes the key, and adds the key and value pair to the table, handling collisions as needed.
* get()
  Takes in the key and returns the value from the table.
* contains()
  Takes in the key and returns a boolean, indicating if the key exists in the table already.
* hash()
  Takes key and returns an index in the collection.